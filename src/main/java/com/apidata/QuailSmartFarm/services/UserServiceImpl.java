package com.apidata.QuailSmartFarm.services;

import com.apidata.QuailSmartFarm.entities.User;
import com.apidata.QuailSmartFarm.reposities.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserReposity userReposity;

    @Override
    public List<User> findAll() {
        return userReposity.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userReposity.findById(id);
    }

    @Override
    public List<User> findAllByQuery() {
        return userReposity.findAllByQuery();
    }

    @Override
    public User save(Map<String,String> inputs) throws Exception {
        try {
            User user = new User();
            user.setName(inputs.get("name"));
            user.setEmail(inputs.get("email"));
            user.setPassword(inputs.get("password"));

            return userReposity.save(user);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        userReposity.deleteById(id);
    }

}
