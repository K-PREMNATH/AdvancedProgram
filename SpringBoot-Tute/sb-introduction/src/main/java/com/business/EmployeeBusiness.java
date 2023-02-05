package com.business;

import com.dao.EmployeeDAO;
import com.dto.req.LoginReq;
import com.dto.res.LoginRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class EmployeeBusiness {

    @Autowired
    EmployeeDAO employeeDAO;

    private Logger LOGGER = Logger.getLogger(this.getClass().getName());

    public LoginRes login(LoginReq loginReq) {
        LOGGER.info("login-request-------------->"+loginReq.toString());
        LoginRes loginRes = employeeDAO.login(loginReq);
        return loginRes;
    }
}
