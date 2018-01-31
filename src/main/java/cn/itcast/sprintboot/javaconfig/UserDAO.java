package cn.itcast.sprintboot.javaconfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenmin on 2018/1/31.
 */
public class UserDAO {
    public List<User> queryUserList(){
        List<User> result = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(i+1);
            user.setName("username_"+i);
            user.setPassword("password_"+i);
            result.add(user);
        }
        return result;
    }
}
