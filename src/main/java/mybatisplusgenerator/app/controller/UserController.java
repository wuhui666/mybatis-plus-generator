package mybatisplusgenerator.app.controller;


import mybatisplusgenerator.app.entity.User;
import mybatisplusgenerator.app.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zbh
 * @since 2019-07-27
 */
@RestController
@RequestMapping("/app/user")
public class UserController {
    @Autowired
    UserServiceImpl service;
    @GetMapping("/{id}")
    public User select(Integer id){
        return service.getById(id);
    }
}
