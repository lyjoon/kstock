package com.github.kstock.service;

import com.github.kstock.entity.Corp;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.List;

public interface KrxService {

    /**
     * 기업정보를 생성합니다.
     */
    void corpGeneral();

    /**
     * 기업정보를 반환합니다.
     * @return
     */
    Mono<List<Corp>> corpList();
}
