package com.zzizily.spring.boot.autoconfigure.properties.zzizily;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * zzizily-spring-boot
 *
 * @author crom
 * @date 2019-05-26
 */
@Getter
@Setter
@Component
@ConfigurationProperties("zzizily")
public class ZzizilyProperties {
  private String domain;
  private String protocol;
  private List<String> origins;
}
