package service;


import dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by paul on 2018/5/25.
 */
@Service(value = "UserService")

public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

        public int find(){
            return 100;
        }
    @Override
    public void findUser() {
        userDao.loginUser();
        System.out.println("service被调用");
    }

    public void setUserDao(IUserDao UserDao) {
        this.userDao = UserDao;
    }

}
