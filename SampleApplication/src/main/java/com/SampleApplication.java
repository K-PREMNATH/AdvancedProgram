/*
 */
package com;

import com.sample.db.IUser;
import com.sample.db.impl.UserImpl;
import com.sample.model.User;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class SampleApplication {

    public static void main(String[] args) {
        IUser userObject = new UserImpl();
//        User user = new User(0,"Fname","Lname","other",31,"qqq@gmnail.com","123456");
//        int isAffectedRows = userObject.insertNewUser(user);
//        System.out.println("isAffectedRows------->"+isAffectedRows);
//        
//        user.setEmailAddress("rrr@gmnail.com");
//        int output = userObject.insertNewUser(user);
//        System.out.println("output------->"+output);

        System.out.println(userObject.selectUserById(6).toString());
        
         List<User> list = userObject.selectAllUsers();
         System.out.println(list);
    }
}