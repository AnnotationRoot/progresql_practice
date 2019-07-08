package com.lambda;



import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by JSKJ on 2019/6/17.
 */
public class TestLambda {
    List<Employee> emps = Arrays.asList(
            new Employee(101, "张三", 18, 9999.99),
            new Employee(102, "李四", 59, 6666.66),
            new Employee(103, "王五", 28, 3333.33),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(105, "田七", 38, 5555.55)
    );

    @Test
    public void test1(){
        Collections.sort(emps,(e1,e2) ->{
            if (e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Employee emp : emps){
            System.out.println(emp);
        }
    }

    /**
     * java8 内置函数式接口
     *
     * Consumer<T> 消费型接口
     */

    @Test
    public void test2(){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        SimpleDateFormat df =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

        executorService.scheduleAtFixedRate(new Runnable(){

            @Override
            public void run() {
                System.out.println("++++++++++++++++++++thread:" + df.format(new Date()));
            }

        }, 2, 3, TimeUnit.SECONDS);
        System.out.println("++++++++++++++++++++main:" + df.format(new Date()));

    }


}
