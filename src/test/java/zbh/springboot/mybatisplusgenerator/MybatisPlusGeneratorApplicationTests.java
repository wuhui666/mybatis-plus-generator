package zbh.springboot.mybatisplusgenerator;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mybatisplusgenerator.MybatisPlusGeneratorApplication;
import mybatisplusgenerator.app.entity.User;
import mybatisplusgenerator.app.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlusGeneratorApplication.class)
public class MybatisPlusGeneratorApplicationTests {

    @Autowired
    UserServiceImpl service;
    @Test
    public void contextLoads() {
        //service.list().forEach(System.out::println);

        User user1=new User();
        User user2=new User();
        user1.setUsername("hehe");
        user2.setUsername("hehe2");
        List<User> list= new ArrayList<>();
        list.add(user1);
        list.add(user2);
        service.insertBatch(list);
        System.out.println("done");

        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(24);
        service.removeByIds(list);
        System.out.println("done");*/
    }
    @Test
    public void test2(){
        PageHelper.startPage(1, 2);
        List<User> users = service.list();
        PageInfo<User> pageInfo = new PageInfo(users, 5);
        System.out.println(pageInfo);
    }
}
