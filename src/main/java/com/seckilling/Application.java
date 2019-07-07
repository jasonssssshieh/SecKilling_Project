package com.seckilling;

import com.seckilling.dao.UserDOMapper;
import com.seckilling.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.seckilling"})
@RestController
@MapperScan("com.seckilling.dao")
public class Application
{
    @SuppressWarnings("all")
    @Autowired
    private UserDOMapper userDOMapper;//不用管这个报错


    @RequestMapping("/")
    public String home(){
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if(userDO == null){
            return "用户对象不存在";
        }else{
            return userDO.getName();
        }
    }

    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
}
