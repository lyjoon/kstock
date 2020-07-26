package com.github.kstock.api;

import com.github.kstock.TestApp;
import feign.Response;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;

public class TestKrxApi extends TestApp {

    @Autowired
    private KrxApi krxApi;

    @Test
    public void testCorpList() throws IOException {
        Response response = this.krxApi.corpList();
        //InputStream inputStream = response.body().asInputStream();
        log.info(response.reason());
    }
}
