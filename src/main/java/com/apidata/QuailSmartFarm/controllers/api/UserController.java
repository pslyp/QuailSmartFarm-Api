package com.apidata.QuailSmartFarm.controllers.api;

import com.apidata.QuailSmartFarm.entities.User;
import com.apidata.QuailSmartFarm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController("api-user")
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public Optional<User> show(@PathVariable String id) throws Exception {
        return userService.findById(Integer.parseInt(id));
    }

    @PostMapping(value = "")
    public String store(@RequestParam Map<String,String> inputs) throws Exception {
        userService.save(inputs);

        return "Create data success";
    }

    @DeleteMapping(value = "/{id}")
    public String destroy(@PathVariable String id) throws Exception {
        userService.deleteById(Integer.parseInt(id));

        return "Delete data ID: " + id + "success";
    }

}
