package com.lw.domain;

import javax.persistence.*;
import java.io.Serializable;

//@Data
//@Accessors(chain = true)
@Entity
@Table(name = "user")
public class User implements Serializable {
    // 主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Integer id;
    // 姓名
    @Column
    private String name;
    // 年龄
    @Column
    private Integer age;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }
}