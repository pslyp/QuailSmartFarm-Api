package com.apidata.QuailSmartFarm.reposities;

import com.apidata.QuailSmartFarm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserReposity extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM users", nativeQuery = true)
    public List<User> findAllByQuery();

}
