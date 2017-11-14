package spring.cloud.remote.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.cloud.remote.model.UserModel;

import java.util.List;
@RequestMapping("micro-application-service-provider-01")
public interface UserServiceApi {
    @RequestMapping(value = "/getuserlst", method = RequestMethod.GET)
    List<UserModel> findUsers();
}
