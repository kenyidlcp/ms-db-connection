package com.db.connection.ms_db_connection.service;

import com.db.connection.ms_db_connection.document.UserAccount;

import java.util.List;

public interface UserAccountServiceMongoDb {

    void save(UserAccount userAccount);
    List<UserAccount> findAllUserAccount();

}
