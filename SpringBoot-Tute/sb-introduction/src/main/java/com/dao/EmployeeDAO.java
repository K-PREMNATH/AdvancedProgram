package com.dao;

import com.dto.req.LoginReq;
import com.dto.res.LoginRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

@Repository
public class EmployeeDAO {
    private Logger LOGGER = Logger.getLogger(this.getClass().getName());

    @Autowired
    JdbcTemplate jdbcTemplate;

    public LoginRes login(LoginReq loginReq) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        LoginRes loginRes = new LoginRes();
        try {
            connection = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
            statement = connection.createStatement();
            String query = "select userId,Status from userdetail where username = '" + loginReq.getUsername() + "' and passcode = '" + loginReq.getPassword() + "';";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                loginRes.setUserId(resultSet.getInt(1));
                loginRes.setStatus((short) resultSet.getInt(2));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException exception) {

            }
        }
        return loginRes;
    }
}
