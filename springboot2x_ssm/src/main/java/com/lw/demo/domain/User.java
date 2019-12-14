package com.lw.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@Entity
@Table(name = "user")
public class User {
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
}