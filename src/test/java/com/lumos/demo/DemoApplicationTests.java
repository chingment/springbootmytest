package com.lumos.demo;

import com.lumos.demo.utils.DBHelper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        //DBHelper dbHelper=new DBHelper();

        DBHelper.connection();
        int rows = DBHelper.executeUpdate("insert users (id,name,age) value(3,'qiuyue',6)");
        if (rows > 0) {
            System.out.print("执行成功");
        } else {
            System.out.print("执行失败");
        }
        DBHelper.close();

        String s = "sda";
        String c = s;
        System.out.print("dsdsdsd:");
    }

}
