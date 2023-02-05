package com.controller;

import com.business.EmployeeBusiness;
import com.dto.req.LoginReq;
import com.dto.res.LoginRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class EmployeeController {

    private Logger LOGGER = Logger.getLogger(this.getClass().getName());

    @Autowired
    EmployeeBusiness employeeBusiness;

    @PostMapping("/user/login")
    public LoginRes login(@RequestBody LoginReq loginReq){
        LoginRes loginRes = employeeBusiness.login(loginReq);
        return loginRes;
    }

}
