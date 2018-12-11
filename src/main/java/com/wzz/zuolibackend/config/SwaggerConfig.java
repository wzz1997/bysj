package com.wzz.zuolibackend.config;

import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.config
 * @ClassName: SwaggerConfig
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/11 0011 14:25
 * @Version: 1.0.2
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {

        //添加head参数start
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        //添加head参数end

        Predicate<RequestHandler> predicate = input -> {
            Class<?> declaringClass = null;
            if (input != null) {
                declaringClass = input.declaringClass();
            }
            // 排除
            if (declaringClass == BasicErrorController.class) {
                return false;
            }
            // 被注解的类
            assert declaringClass != null;
            return declaringClass.isAnnotationPresent(Api.class);
        };
        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(pars)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .select()
                .apis(predicate::test)
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //大标题
                .title("卓立仪表物流信息管理平台 Api文档")
                //版本
                .version("1.0")
                .build();
    }

}

