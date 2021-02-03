package com.hujq.majiang;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootTest
class MajiangApplicationTests {

    public static void main(String[] args) {
        String str = "";
        String str1 = null;

        System.out.println(str);
        System.out.println(str1);
    }
    @Test
    void contextLoads() throws ClassNotFoundException, SQLException {
       /* Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/community", "root", "hadoop");
        System.out.println(connection);*/

    }

}
