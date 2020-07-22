package com.github.kstock.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CORP")
public class Corp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String corpCode;

    private String corpName;

    private String corpType;

    private String corpTheme;

}
