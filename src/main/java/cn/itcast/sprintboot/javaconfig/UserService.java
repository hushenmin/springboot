package cn.itcast.sprintboot.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shenmin on 2018/1/31.
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public List<User> queryUserList(){
        return this.userDAO.queryUserList();
    }
}
