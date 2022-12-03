
package com;

/**
 *
 * @author ASUS
 */
public enum UserEnum {
    customer((short) 1, "customer"),
    system((short) 2, "system"), 
    adminUsers((short) 2, "adminUsers");
  
    private final Short id;
   
    private final String userType;

    /**
     *
     */
    private UserEnum(Short id, String userType) {
        this.id = id;
        this.userType = userType;
    }

    /**
     *
     */
    public Short getId() {
        return id;
    }

    /**
     *
     */
    public String getUserType() {
        return userType;
    }
}
