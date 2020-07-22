package com.github.kstock.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 * 상장기업정보
 */
@Data
@Entity
@Table(name = "CORP")
public class Corp {

    /**
     * 종목코드
     */
    @NotEmpty
    @Id
    @Column(nullable = false, length = 6)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String corpCode;

    /**
     * 기업명
     */
    @NotEmpty
    @Column(nullable = false, length = 50)
    private String corpName;

    /**
     * 업종
     */
    @Column(length = 500)
    private String corpType;

    /**
     * 업종테마 full-text
     */
    @Column(length = 500)
    private String corpTheme;

}
