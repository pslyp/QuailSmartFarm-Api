package com.apidata.QuailSmartFarm.reposities;

import com.apidata.QuailSmartFarm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserReposity extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM users", nativeQuery = true)
    public List<User> findAllByQuery();

    @Query(value = "SELECT * FROM users a WHERE a.id = ?1", nativeQuery = true)
    public Optional<User> findByIdQuery(Integer id);

}
