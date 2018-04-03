package com.anoxiatown.designpattern.builder;

import com.anoxiatown.designpattern.pojo.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    /**
     * Builder Pattern第一种写法
     */
    @Test
    public void testBuilder1() {
        Student student = new Student.Builder("#24")
                .name("Kobe")
                .age(23)
                .build();
        Assert.assertNotNull(student);
        Assert.assertEquals("Kobe", student.getName());
        Assert.assertEquals("#24", student.getNumber());
        Assert.assertEquals(23, student.getAge());
    }

    @Test
    public void testBuilder2(){
        TeacherBuilder teacherBuilder = new TeacherBuilder();
        Teacher teacher = teacherBuilder.build("#24");
        Assert.assertNotNull(teacher);
        Assert.assertEquals("", teacher.getName());
        Assert.assertEquals("#24", teacher.getNumber());
        Assert.assertEquals(0, teacher.getAge());
    }

}