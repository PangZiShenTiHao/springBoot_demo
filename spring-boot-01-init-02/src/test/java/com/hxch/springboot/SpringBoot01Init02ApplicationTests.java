package com.hxch.springboot;

import com.hxch.springboot.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01Init02ApplicationTests {

    @Autowired
    private Emp emp;

    @Test
    public void contextLoads() {
        System.out.println("$$$$$$$$$$$$"+emp.toString());
    }

}
