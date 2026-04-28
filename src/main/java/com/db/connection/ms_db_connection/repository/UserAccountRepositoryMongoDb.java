package com.db.connection.ms_db_connection.repository;

import com.db.connection.ms_db_connection.document.UserAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepositoryMongoDb extends MongoRepository<UserAccount, Long> {
}
