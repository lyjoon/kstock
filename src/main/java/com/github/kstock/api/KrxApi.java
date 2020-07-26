package com.github.kstock.api;

import feign.Response;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 증권정보를 받아오는 api
 * corpList 의 경우 302 redirect 발생에 따름 fallback 처리가 필요함.
 */
@FeignClient(url = "http://kind.krx.co.kr", name = "kindKrx", configuration = FeignAutoConfiguration.class)
public interface KrxApi {

    @GetMapping(value = "/corpgeneral/corpList.do?method=download")
    Response corpList();

}
