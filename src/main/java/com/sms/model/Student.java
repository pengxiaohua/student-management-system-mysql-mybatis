package com.sms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private String id;
    private String name;
    private String grade;
    private Double math;
    private Double sport;
    private Double english;
    private Double java;
    private Double algorithm;
    private Double polity;
    private Double frontend;
    private Double score;
    private Double average;
}
