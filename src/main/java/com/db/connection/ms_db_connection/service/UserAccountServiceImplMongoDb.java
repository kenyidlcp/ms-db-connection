package com.db.connection.ms_db_connection.service;

import com.db.connection.ms_db_connection.document.UserAccount;
import com.db.connection.ms_db_connection.repository.UserAccountRepositoryMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImplMongoDb implements UserAccountServiceMongoDb {

    @Autowired
    private UserAccountRepositoryMongoDb userAccountRepositoryMongoDb;

    @Override
    public void save(UserAccount userAccount) {
        userAccountRepositoryMongoDb.save(userAccount);
    }

    @Override
    public List<UserAccount> findAllUserAccount() {
        return userAccountRepositoryMongoDb.findAll();
    }
}
