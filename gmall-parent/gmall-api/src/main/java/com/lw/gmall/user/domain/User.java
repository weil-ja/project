package com.lw.gmall.user.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Accessors(chain = true)
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

}