package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnvSystemConfig implements Serializable {

    private Long emloyeeNum;
    private Date date;
    private int limitHours;
}
