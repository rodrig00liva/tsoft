package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjects06u {

        Projects06uDelegate projects06uDelegate = new Projects06uDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projects06uDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}