package com.github.kstock.api;

import com.github.kstock.TestApp;
import feign.Response;
import feign.httpclient.ApacheHttpClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.io.InputStream;

public class TestKrxApi extends TestApp {

    @Autowired
    private KrxApi krxApi;

    @Test
    public void testCorpList() throws IOException {
        Response response = this.krxApi.corpList();
        //InputStream inputStream = response.body().asInputStream();
        Response.Body body = response.body();
        log.info(body.getClass().getSimpleName());
        InputStream inputStream = response.body().asInputStream();
        log.info(response.reason());
    }
}
