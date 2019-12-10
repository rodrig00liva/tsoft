package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-12-10T15:05:59.535Z")

@RestSchema(schemaId = "projects06u")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projects06uImpl {

    @Autowired
    private Projects06uDelegate userProjects06uDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjects06uDelegate.helloworld(name);
    }

}
