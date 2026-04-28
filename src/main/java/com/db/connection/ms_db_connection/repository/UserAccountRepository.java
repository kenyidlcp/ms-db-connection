package com.db.connection.ms_db_connection.repository;

import com.db.connection.ms_db_connection.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {


}
