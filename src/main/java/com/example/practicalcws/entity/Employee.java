package com.example.practicalcws.entity;

import com.example.practicalcws.annotation.Column;
import com.example.practicalcws.annotation.Id;
import com.example.practicalcws.annotation.Table;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "employees")
public class Employee {
    @Id(AutoIncrement = true)
    @Column(name = "id", type = "INT")
    private int id;
    @Column(name = "name", type = "VARCHAR(255)")
    private String name;
    @Column(name = "salary", type = "DECIMAL")
    private BigDecimal salary;

}
