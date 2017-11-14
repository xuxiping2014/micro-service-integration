package spring.cloud.dto.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserDto implements Serializable {

    private String username;

    private String password;

    private String address;

    private String tel;


}
