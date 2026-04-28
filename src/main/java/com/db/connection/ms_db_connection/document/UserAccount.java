package com.db.connection.ms_db_connection.document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount {

    @Id
    private String id;
    private String username;
    private String password;
}
