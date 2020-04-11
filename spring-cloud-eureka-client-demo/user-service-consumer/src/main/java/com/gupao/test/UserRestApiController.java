package com.gupao.test;

import com.gupao.domain.User;
import com.gupao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserRestApiController {

    @Autowired
    private UserService userService;

    /**
     *
     * @RequestBody user
     * @return 保存成功返回user对象,否则返回null
     */
    @PostMapping("/user/save")
    public User saveUser(@RequestBody User user){
        if(userService.save(user)){
            return user;
        }else{
            return null;
        }

    }

    /**
     *
     * @return 返回所有数据
     */
    @GetMapping("/user/list")
    public Collection<User> list(){
        return userService.findAll();
    }

}
