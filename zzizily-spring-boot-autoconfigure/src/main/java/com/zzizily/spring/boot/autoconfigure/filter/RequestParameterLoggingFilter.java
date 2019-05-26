package com.zzizily.spring.boot.autoconfigure.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.event.Level;

import javax.servlet.*;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Filter 를 이용한 Request Parameter Logging 남기기
 *
 * @author crom
 * @date 2019-05-26
 */
@Slf4j
public class RequestParameterLoggingFilter implements Filter {
  private Level level;

  public RequestParameterLoggingFilter(Level level) {
    this.level = level;
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    String params = request.getParameterMap()
                           .entrySet()
                           .stream()
                           .map(entry -> entry.getKey() + "=" + String.join(",", entry.getValue()))
                           .flatMap(Stream::of)
                           .collect(Collectors.joining("&"));
    log(params);
    chain.doFilter(request, response);
  }

  private void log(String params) {
    switch (this.level) {
      case TRACE:
        log.trace("{}", params);
        break;
      case DEBUG:
        log.debug("{}", params);
        break;
      case INFO:
        log.info("{}", params);
        break;
      case WARN:
        log.warn("{}", params);
        break;
      case ERROR:
        log.error("{}", params);
        break;
      default:
    }
  }
}
