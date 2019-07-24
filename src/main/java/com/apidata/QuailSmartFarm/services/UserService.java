package com.apidata.QuailSmartFarm.services;

import com.apidata.QuailSmartFarm.entities.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Integer id);

    List<User> findAllByQuery();

    Optional<User> findByIdQuery(Integer id);

    User save(Map<String,String> inputs) throws Exception;

    void deleteById(Integer id) throws Exception;

}
