package spring.cloud.application;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		//SpringApplication app = new SpringApplication(StartApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);
		//app.run(args);
		SpringApplication.run(StartApplication.class, args);
	}
}
