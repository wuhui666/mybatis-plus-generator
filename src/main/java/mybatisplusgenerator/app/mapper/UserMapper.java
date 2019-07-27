package mybatisplusgenerator.app.mapper;

import mybatisplusgenerator.app.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Collection;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zbh
 * @since 2019-07-27
 */
public interface UserMapper extends BaseMapper<User> {
    void insertBatch(Collection<User> list);
    Integer all();
}
