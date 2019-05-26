package com.zzizily.spring.boot.autoconfigure.properties.zzizily.host;

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
@ConfigurationProperties("zzizily.host")
public class ZzizilyHostProperties {
  private String email;
  private String postgre;
}
