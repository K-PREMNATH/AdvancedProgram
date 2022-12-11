/*
 */
package com.sample.db;

import com.sample.model.User;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IUser {
    
    public int insertNewUser(User user);
    
    public int updateUser(User user);
    
    public User selectUserById(int id);
    
    public List<User> selectAllUsers();
    
    public int deleteUserById(int id);
}
