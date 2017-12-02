package com.kars.mybot.Dao;

import com.kars.mybot.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDao extends JpaRepository<UserInfo, Integer>{

    UserInfo findByUserIdAndUserPassword(String userId, String userPassword);

}
