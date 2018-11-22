package com.sixbang.logistics;

import com.sixbang.logistics.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogisticsApplicationTests {


    @Autowired
    private OrderService orderService;

    @Test
    public void contextLoads() {
        Date date=new Date();
        

    }

   @Test
    public  void  test(){
       System.out.println(orderService.allOrders().size());


    }

}
