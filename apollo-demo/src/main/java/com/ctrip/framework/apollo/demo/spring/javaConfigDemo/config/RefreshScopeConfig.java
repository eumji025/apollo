package com.ctrip.framework.apollo.demo.spring.javaConfigDemo.config;

import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * to support RefreshScope
 * @author Jason Song(song_s@ctrip.com)
 */
@Configuration
@Import(RefreshAutoConfiguration.class)
public class RefreshScopeConfig {
}
