package com.anoxiatown.designpattern.builder;

import com.anoxiatown.designpattern.pojo.Teacher;

/**
 * Builder Pattern第二种写法,一个专门的XXXBuilder负责build某类对象
 *
 * 重叠构造器
 *
 */
public class TeacherBuilder {

    Teacher build(String number) {
        return build(number, "", 0);
    }

    Teacher build(String number, String name) {
        return build(number, name, 0);
    }

    Teacher build(String number, String name, int age) {
        return new Teacher(number, name, age);
    }

}