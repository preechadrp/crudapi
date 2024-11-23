package com.kongruksiam.crudapi.repository;

import com.kongruksiam.crudapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
