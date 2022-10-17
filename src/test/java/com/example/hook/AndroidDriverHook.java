package com.example.hook;

import com.example.app.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHook {

    @Before
    public void before(){
        AndroidDriverInit.initialization();
    }

    @After
    public void after(){
        AndroidDriverInit.close();
    }

}
