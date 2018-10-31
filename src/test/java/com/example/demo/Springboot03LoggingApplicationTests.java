package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LoggingApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
		/**
		 * 日志的级别：
		 * 由低到高 trace <debug <info <warn < error
		 * 可以调整输出的日志级别；日志就只会在这个级别之后的高级别生效
		 */
		logger.trace(Marker.ANY_MARKER,"这是trace日志...");
		logger.debug(Marker.ANY_NON_NULL_MARKER,"这是debug日志...");
		//springboot默认给我们使用的是info级别，没有指定级别的就使用springboot默认规定的级别，root级别
		logger.info(Marker.ANY_NON_NULL_MARKER,"这是info日志...");
		logger.warn("这是warn日志...");
		logger.error("这是error日志...");
	}

}
