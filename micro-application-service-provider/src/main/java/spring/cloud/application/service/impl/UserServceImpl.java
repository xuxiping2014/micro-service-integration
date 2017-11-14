package spring.cloud.application.service.impl;

import org.springframework.web.bind.annotation.RestController;
import spring.cloud.remote.model.UserModel;
import spring.cloud.remote.service.api.UserServiceApi;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserServceImpl implements UserServiceApi {
    @Override
    public List<UserModel> findUsers() {
        List<UserModel> lst = new ArrayList<>();
        lst.add(new UserModel("Xiping Xu","***","浙江省绍兴市","13575788541"));
        lst.add(new UserModel("Sheng Zheng","***","浙江省杭州市","13478547452"));
        lst.add(new UserModel("Yingwu Du","***","浙江省金华市","15125478854"));
        return lst;

    }
}
