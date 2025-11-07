package com.presupuesto_app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(schema = "app_core", name = "users")
public class User {
    @Id
    private Long id;

    @Column("name")
    private String username;

    @Column("passwd")
    private String password;

    private String role;
}
