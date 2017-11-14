package spring.cloud.application.database.imp;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import spring.cloud.application.database.mapper.UserMapper;
import spring.cloud.application.database.model.UserModel;
import spring.cloud.application.database.service.IDBUserService;

@Service
public class DBUserServiceImp  extends ServiceImpl<UserMapper, UserModel> implements IDBUserService
{

}
