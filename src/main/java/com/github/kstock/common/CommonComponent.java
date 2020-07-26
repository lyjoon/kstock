package com.github.kstock.common;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 * 공통 컴포넌트
 */
@RequiredArgsConstructor
public class CommonComponent {

    private ApplicationContext applicationContext;

    protected Logger log = LoggerFactory.getLogger(getClass());

}
