package spring.cloud.dto.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.cloud.dto.model.UserDto;

import java.util.List;
@RequestMapping("micro-application-service-provider-01")
public interface UserServiceApi {
    @RequestMapping(value = "/getuserlst", method = RequestMethod.GET)
    List<UserDto> findUsers();
}
