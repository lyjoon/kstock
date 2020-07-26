package com.github.kstock.api;

import feign.Response;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * api(http://kind.krx.co.kr)
 *
 * corpList(/corpgeneral/corpList.do) 의 경우 302 redirect 이후 엑셀데이터를 응답으로 서비스되고 있습니다.
 * FeignAutoConfiguration.class 참고하여  follow-redirects 활성을 위한 의존성 'feign-okhttp', 'feign-httpclient' 이 각각 추가되었습니다.
 */
@FeignClient(url = "http://kind.krx.co.kr", name = "kind.krx.co.kr", configuration = FeignAutoConfiguration.class)
public interface KrxApi {

    /**
     * 증권정보를 받아오는 api
     * 정상일 경우 리턴값이 엑셀로 반환됨에 따라 InputStream 을 이용하여 변환처리해야 합니다.
     * @return
     */
    @GetMapping(value = "/corpgeneral/corpList.do?method=download")
    Response corpList();

}
