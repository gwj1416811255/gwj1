package org.gaoweijian.weixin.menu;

import org.gaoweijian.commons.config.EventListenerConfig;
import org.gaoweijian.commons.domain.event.EventInMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("org.gaoweijian")
@ComponentScan("org.gaoweijian")
public class SelfMenuApplication implements EventListenerConfig {

	public static void main(String[] args) {
		SpringApplication.run(SelfMenuApplication.class, args);
	}

	@Override
	public void handle(EventInMessage msg) {
		// 目前此模块不处理任何消息，所以这里留空即可
	}
}
