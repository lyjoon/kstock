package com.github.kstock.service;

import com.github.kstock.TestApp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestKrxService extends TestApp {

    @Autowired
    private KrxService krxService;

    @Test
    public void testCorpList(){
        krxService.corpList().subscribe();
    }
}
