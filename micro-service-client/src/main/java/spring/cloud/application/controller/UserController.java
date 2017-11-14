package spring.cloud.application.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.dto.model.UserDto;
import spring.cloud.application.service.InnerUserService;

import java.util.List;

@RequestMapping("/user")
@RestController
@Data
public class UserController {

    @Autowired
   private InnerUserService userService;

    @RequestMapping(value = "/getuserlst", method = RequestMethod.GET)
    public  List<UserDto> test2() {
        List<UserDto> lst = userService.findUsers();
        System.out.println(lst.size());
        return lst;
    }
}
