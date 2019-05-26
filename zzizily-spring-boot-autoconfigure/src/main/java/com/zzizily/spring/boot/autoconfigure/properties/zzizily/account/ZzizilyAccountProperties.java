package com.zzizily.spring.boot.autoconfigure.properties.zzizily.account;

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
@ConfigurationProperties("zzizily.account")
public class ZzizilyAccountProperties {
  private String gitUsername;
  private String gitPassword;
  private String monitorUsername;
  private String monitorPassword;
  private String eurekaUsername;
  private String eurekaPassword;
  private String emailUsername;
  private String emailPassword;
  private String postgresUsername;
  private String postgresPassword;
}
