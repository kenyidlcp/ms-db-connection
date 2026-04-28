package com.db.connection.ms_db_connection.service;

import com.db.connection.ms_db_connection.entity.UserAccount;
import com.db.connection.ms_db_connection.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public void save(UserAccount userAccount) {
        userAccountRepository.save(userAccount);
    }

    @Override
    public List<UserAccount> findAllUserAccount() {
        return userAccountRepository.findAll();
    }
}
