package org.wendu.dye.dyeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务注册中心启动类
 *
 * @SpringBootApplication: 标识这是一个Spring Boot应用，包含@Configuration、@EnableAutoConfiguration和@ComponentScan注解
 * @EnableEurekaServer: 启用Eureka服务器功能，将此应用作为服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class DyeEurekaApplication {

	/**
	 * 程序入口方法
	 * 启动Spring Boot应用并运行Eureka服务注册中心
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(DyeEurekaApplication.class, args);
	}

}
