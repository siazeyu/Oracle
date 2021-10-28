package com.example.oracle.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Siaze
 * @date 2021/10/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 学生学号/教师教师号
     */
    private int id;

    /**
     * 学生教师姓名
     */
    private String name;

    /**
     * 性别 0表示男，1表示女
     */
    private int sex;

    /**
     * 班级 id
     */
    private int dept_id;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 角色 0表示学生，1为班长，2为辅导员
     */
    private int role;
}
