package spring.cloud.application.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.application.database.model.UserModel;
import spring.cloud.application.database.service.IDBUserService;
import spring.cloud.dto.model.UserDto;
import spring.cloud.dto.service.api.UserServiceApi;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserServceImpl implements UserServiceApi {
    @Autowired
    private IDBUserService userService;
    @Override
    public List<UserDto> findUsers() {

        Wrapper wrapper = new EntityWrapper();
        wrapper.where("username={0}","xuxiping");
        List<UserModel> userLst =  userService.selectList(wrapper);
        List<UserDto> lst = new ArrayList<>();
        for (UserModel model :userLst) {
            lst.add(new UserDto(model.getUsername(),model.getPassword(),model.getAddress(),model.getTel()));
        }
        return lst;

    }
}
