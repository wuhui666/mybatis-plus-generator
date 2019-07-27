package mybatisplusgenerator.app.service;

import mybatisplusgenerator.app.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zbh
 * @since 2019-07-27
 */
public interface IUserService extends IService<User> {
    void insertBatch(Collection<User> list);
}
