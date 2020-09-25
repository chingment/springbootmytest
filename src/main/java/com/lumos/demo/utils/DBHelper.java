package com.lumos.demo.utils;

import java.sql.*;

public class DBHelper {
    private static Connection connection=null;
    public static void connection() {
        String URL = "jdbc:mysql://localhost:3306/mytest";
        String USER = "root";
        String PASSWORD = "123456";
        // 1.加载驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获得数据库链接
            connection= DriverManager.getConnection(URL, USER, PASSWORD);

//            // 3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
//            String id="1";
//            //预编译
//            String sql="select * from users where id=?";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1, id);
//            ResultSet rs = statement.executeQuery();
////			String sql="select * from userinfo where UserName='"+name+"'";
////			Statement statement = conn.createStatement();
////			ResultSet rs = statement.executeQuery(sql);
//            // 4.处理数据库的返回结果(使用ResultSet类)
//            while (rs.next()) {
//                System.out.println(rs.getString("name") + " " + rs.getString("age"));
//            }

            // 关闭资源
            //conn.close();
            //rs.close();
            //statement.close();
        } catch (ClassNotFoundException e) {
            connection=null;
            e.printStackTrace();
        }catch (SQLException e) {
            connection=null;
            e.printStackTrace();
        }
    }

    public static void close(){
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int  executeUpdate(String sql){
        int rows=0;
        try {
            if (connection != null) {
                Statement statement = connection.createStatement();
                rows = statement.executeUpdate(sql);
                statement.close();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }
}
