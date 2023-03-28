package com.server.rds_server;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;
    private String str;
}
