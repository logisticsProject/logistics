package com.sixbang.logistics;

import com.sixbang.logistics.contorller.PathContorller;
import com.sixbang.logistics.domain.Path;
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
    private PathContorller pathController;

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

    //运行此Test方法可以往path表中添加路线，按照需要改变list
    @Test
    public void test1(){
        String[] list=new String[]{"广州","佛山","东莞"};
        for (String start:list) {
            for(String end:list) {
                if (start.equals(end)){
                    continue;
                }
                Path path = new Path();
                path.setStartplace(start);
                path.setEndplace(end);
                path.setPriceperunit(500.00);
                pathController.addPath(path);
            }
        }
    }

}
