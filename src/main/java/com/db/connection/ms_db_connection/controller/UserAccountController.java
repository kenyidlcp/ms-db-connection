package com.db.connection.ms_db_connection.controller;

import com.db.connection.ms_db_connection.entity.UserAccount;
import com.db.connection.ms_db_connection.service.UserAccountService;
import com.db.connection.ms_db_connection.service.UserAccountServiceMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user-accounts")
@RestController
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private UserAccountServiceMongoDb userAccountServiceMongoDb;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void createUserAccount(@RequestBody UserAccount userAccount) {
        userAccountService.save(userAccount);
    }

    @GetMapping(produces = "application/json")
    public List<UserAccount> findAllUserAccount() {
        return userAccountService.findAllUserAccount();
    }

    @PostMapping(value = "/mongodb", consumes = "application/json", produces = "application/json")
    public void createUserAccountMongoDb(@RequestBody com.db.connection.ms_db_connection.document.UserAccount userAccount) {
        userAccountServiceMongoDb.save(userAccount);
    }

    @GetMapping(value = "/mongodb")
    public List<com.db.connection.ms_db_connection.document.UserAccount> findAllUserAccountMongoDb() {
        return userAccountServiceMongoDb.findAllUserAccount();
    }
}
