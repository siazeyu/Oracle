package com.example.oracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootTest
class OracleApplicationTests {
    @Autowired
    DataSource source;
    @Test
    void contextLoads() throws SQLException {
        Connection connection = source.getConnection();
        PreparedStatement s = connection.prepareStatement("select *from test");
        ResultSet resultSet = s.executeQuery();
        if (resultSet.next()){
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
        }
    }

}
