package dao;

import org.springframework.stereotype.Repository;

/**
 * Created by paul on 2018/5/25.
 */

@Repository(value = "userDao")
public class IUserDaoImpl implements IUserDao {
    @Override
    public void loginUser() {
        System.out.println("输出dao");
    }
}

