package com.lab.Controller;

import com.lab.Service.UserService;
import com.lab.pojo.songs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/findByMusic")
    public List<songs> findByMusic(@RequestParam("Title") String Title) {
        System.out.println(Title);
        return userService.findByMusic(Title);
    }

}
