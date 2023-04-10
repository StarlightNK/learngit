package com.example.pojo;
@Data
public class User {
        @TableId(type = IdType.AUTO)
        private Integer id;
        private String username;
        private String password;
        private Integer age;
        private String email;
        private String sex;

    }
