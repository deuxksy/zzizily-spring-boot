package com.zzizily.spring.boot.autoconfigure.config;


import com.zzizily.spring.boot.autoconfigure.filter.RequestParameterLoggingFilter;
import com.zzizily.spring.boot.autoconfigure.properties.RequestParameterLoggingFilterProperties;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * zzizily-spring-boot
 *
 * @author crom
 * @date 2019-05-26
 */
@Configuration
@AutoConfigureAfter(WebMvcAutoConfiguration.class)
@EnableConfigurationProperties(RequestParameterLoggingFilterProperties.class)
public class RequestParameterLoggingFilterAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  @ConditionalOnProperty(name = "spring.mvc.request-parameter-logging-filter.enabled", havingValue = "true")
  public Filter customUriLoggingFilter(RequestParameterLoggingFilterProperties requestParameterLoggingFilterProperties) {
    return new RequestParameterLoggingFilter(requestParameterLoggingFilterProperties.getLevel());
  }
}