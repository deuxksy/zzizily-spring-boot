package com.zzizily.spring.boot.autoconfigure.properties.zzizily.url;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * zzizily-spring-boot
 *
 * @author crom
 * @date 2019-05-26
 */
@Getter
@Setter
@Component
@ConfigurationProperties("zzizily.url")
public class ZzizilyUrlProperties {
  private String cloudEureka1;
  private String cloudEureka2;
  private String cloudConfig;
  private String cloudMonitor;
  private String cloudOauth;
  private String cloudGateway;
  private String apiSkeleton;
  private String clientSkeleton;
}
