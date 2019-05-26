package com.zzizily.spring.boot.autoconfigure.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.slf4j.event.Level;

/**
 * zzizily-spring-boot
 *
 * @author crom
 * @date 2019-05-26
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.mvc.request-parameter-logging-filter")
public class RequestParameterLoggingFilterProperties {
  private boolean enabled;
  private Level level;
}
