package spring.cloud.remote.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserModel implements Serializable {
    private String username;

    private String password;

    private String address;

    private String tel;


}
