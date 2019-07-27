package mybatisplusgenerator.app.service.impl;

import mybatisplusgenerator.app.entity.User;
import mybatisplusgenerator.app.mapper.UserMapper;
import mybatisplusgenerator.app.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zbh
 * @since 2019-07-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper mapper;

    public void insertBatch(Collection<User> list){
        mapper.insertBatch(list);
    }
    public Integer all(){
       return mapper.all();
    }
}
