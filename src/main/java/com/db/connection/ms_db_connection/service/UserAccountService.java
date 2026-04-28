package com.db.connection.ms_db_connection.service;

import com.db.connection.ms_db_connection.entity.UserAccount;

import java.util.List;

public interface UserAccountService {

    void save(UserAccount userAccount);
    List<UserAccount> findAllUserAccount();

}
