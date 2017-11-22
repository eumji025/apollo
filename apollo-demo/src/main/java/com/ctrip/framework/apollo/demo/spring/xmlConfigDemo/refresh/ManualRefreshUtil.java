package com.ctrip.framework.apollo.demo.spring.xmlConfigDemo.refresh;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.demo.spring.xmlConfigDemo.bean.XmlBean;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class ManualRefreshUtil {
  private static final Logger logger = LoggerFactory.getLogger(ManualRefreshUtil.class);

  @ApolloConfig
  private Config config;

  @Autowired
  private XmlBean xmlBean;

  @ApolloConfigChangeListener
  private void onChange(ConfigChangeEvent changeEvent) {
    if (changeEvent.isChanged("timeout")) {
      logger.info("Manually refreshing xmlBean.timeout");
      xmlBean.setTimeout(config.getIntProperty("timeout", xmlBean.getTimeout()));
    }

    if (changeEvent.isChanged("batch")) {
      logger.info("Manually refreshing xmlBean.batch");
      xmlBean.setBatch(config.getIntProperty("batch", xmlBean.getBatch()));
    }
  }
}
