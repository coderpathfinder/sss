package com.xsd.sss.dao;

import com.xsd.sss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
}
