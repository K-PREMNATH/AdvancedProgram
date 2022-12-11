/*
 */
package com.sample.db.impl;

import com.sample.db.DbConnection;
import com.sample.db.IUser;
import com.sample.model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class UserImpl implements IUser {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public int insertNewUser(User user) {
        int isAffected = 0;
        Connection connection = null;
        Statement statement = null;
        try {
            logger.info("insertNewUser-request---->"+user.toString());
            connection = DbConnection.getConnection();
            System.out.println("-------->"+connection.hashCode());
            statement = connection.createStatement();
            String sql = "insert into usertemp(FirstName,LastName,OtherName,Age,EmailAddress,Passcode) "
                    + "values ('" + user.getFirstName() + "','" + user.getLastName() + "','" + user.getOtherName()
                    + "','" + user.getAge() + "','" + user.getEmailAddress() + "','" + user.getPasscode() + "');";

            isAffected = statement.executeUpdate(sql);
        } catch (SQLException e) {
            logger.info("Exception caused in insertNewUser, " + e.toString());
        }
        return isAffected;
    }

    @Override
    public int updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User selectUserById(int id) {
        User user = null;
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DbConnection.getConnection();
            statement = connection.createStatement();
            String sql = "select * from usertemp where userId = '"+id+"';";
            ResultSet resultSet =  statement.executeQuery(sql);
            if(resultSet != null){
                user = new User();
                while(resultSet.next()){
                    user.setUserId(resultSet.getInt("UserId"));
                    user.setEmailAddress(resultSet.getString("EmailAddress"));
                    user.setPasscode(resultSet.getString("Passcode"));
                }
            }
        }catch (SQLException e) {
            logger.info("Exception caused in selectUserById, " + e.toString());
        }
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> list = null;
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DbConnection.getConnection();
            statement = connection.createStatement();
            String sql = "select * from usertemp;";
            ResultSet resultSet =  statement.executeQuery(sql);
            if(resultSet != null){
                list = new ArrayList<>();
                while(resultSet.next()){
                    User user = new User();
                    user.setUserId(resultSet.getInt("UserId"));
                    user.setEmailAddress(resultSet.getString("EmailAddress"));
                    user.setPasscode(resultSet.getString("Passcode"));
                    
                    list.add(user);
                    
                }
            }
        }catch (SQLException e) {
            logger.info("Exception caused in selectAllUsers, " + e.toString());
        }
        return list;
    }

    @Override
    public int deleteUserById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
