package com.github.kstock.service.impl;

import com.github.kstock.api.KrxApi;
import com.github.kstock.common.CommonComponent;
import com.github.kstock.entity.Corp;
import com.github.kstock.service.KrxService;
import lombok.RequiredArgsConstructor;
import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class KrxServiceImpl extends CommonComponent implements KrxService {

    private final KrxApi krxApi;

    @Override
    public void corpGeneral() {

    }

    @Override
    public Mono<List<Corp>> corpList() {
        return Mono.fromCallable(() -> {
            HSSFWorkbook workbook = new HSSFWorkbook(krxApi.corpList().body().asInputStream());
            return workbook;
        }).map(workbook -> {
            return new ArrayList();
        });
    }
}
