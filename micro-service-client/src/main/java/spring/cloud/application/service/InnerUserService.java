package spring.cloud.application.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import spring.cloud.remote.service.api.UserServiceApi;

@FeignClient(value = "micro-application-service-provider-01")
public interface InnerUserService extends UserServiceApi {

}
