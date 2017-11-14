package spring.cluod.microserviceregistratcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //启用Eureka 注册中心
@SpringBootApplication
public class MicroServiceRegistratCenterApplication {
	public static void main(String[] args)
	{
        SpringApplication.run(MicroServiceRegistratCenterApplication.class, args);
	}
}
