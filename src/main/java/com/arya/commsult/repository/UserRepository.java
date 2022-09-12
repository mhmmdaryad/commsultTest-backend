package com.arya.commsult.repository;

import com.arya.commsult.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository< User, Integer > {
    User getOneByUsernameAndPassword(String username, String password);

    Optional< User > findByUsername(String username);
}
