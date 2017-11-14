package spring.cluod.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //启用Eureka 注册中心
@SpringBootApplication
public class StartApplication {
	public static void main(String[] args)
	{
        SpringApplication.run(StartApplication.class, args);
	}
}
