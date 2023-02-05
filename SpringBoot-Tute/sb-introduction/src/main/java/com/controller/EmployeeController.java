package com.controller;

import com.dto.req.GetSalaryTaxReq;
import com.dto.res.GetSalaryTaxRes;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class EmployeeController {

    private Logger LOGGER = Logger.getLogger(this.getClass().getName());

    @GetMapping("/get/type1")
    public String getSalaryTax1(@RequestParam("name") String name ){
        System.out.println(name);
        return name;
    }

    @PostMapping("/get/type2")
    public int getSalaryTax2(){
        return 10;
    }

    @PostMapping("/get/type3")
    public GetSalaryTaxRes getSalaryTax3(@RequestBody GetSalaryTaxReq getSalaryTaxReq){
        LOGGER.info(getSalaryTaxReq.toString());
        return null;
    }

}
