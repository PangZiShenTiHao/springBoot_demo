package com.hxch.springboot;

import com.hxch.springboot.entity.Emp;
import com.hxch.springboot.service.EmpService;
import com.hxch.springboot.service.EmpService02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01Init02ApplicationTests {

    @Autowired
    private Emp emp;

    @Autowired
    private ApplicationContext context;

    @Test
    public void contextLoads() {
        System.out.println("$$$$$$$$$$$$ "+emp.toString());
    }

    @Test
    public void testXml() {

        EmpService empService = (EmpService) context.getBean("empService");
        empService.add();
        System.out.println("empService: " + context.getBean("empService"));
    }

    @Test
    public void testConfig() {

        EmpService02 empService02 = (EmpService02) context.getBean("empService02");
        empService02.add2();
    }

}
