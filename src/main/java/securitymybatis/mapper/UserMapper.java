package securitymybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import securitymybatis.pojo.User;

import java.util.List;

@Mapper
@Repository
//或者@Component Dao层 被Spring整合
public interface UserMapper {
    //CRUD
    //查询所有用户
    List<User> queryUserList();

    //单个查询
    User queryUserById(int id);

    int updateUser(User user);
    int addUser(User user);
    int deleteUser(int id);

}
