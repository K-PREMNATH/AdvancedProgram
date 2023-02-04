package com.service;

import com.dto.req.NewEmployeeRequest;
import com.dto.res.NewEmployeeResponse;

public class EmployeeService {

    public NewEmployeeResponse createNewEmployee(NewEmployeeRequest newEmployeeRequest){
        System.out.println(newEmployeeRequest.toString());
        return null;
    }
}
