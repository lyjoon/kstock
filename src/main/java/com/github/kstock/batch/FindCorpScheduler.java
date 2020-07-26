package com.github.kstock.batch;

import com.github.kstock.common.CommonComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class FindCorpScheduler extends CommonComponent {

    /**
     * 한국거래소로부터 기업정보를 받아온다.
     * 엑셀파일로 떨어짐.
     */
    @Scheduled(cron = "0 0 1 * * 1-5")
    public void generateCorp(){
        log.info("cronJobSch");
    }
}
