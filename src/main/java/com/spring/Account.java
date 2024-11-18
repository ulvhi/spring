package com.spring;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@RequiredArgsConstructor
public class Account {
    private long id;
    private BigDecimal balance;
    private LocalDateTime createTime;
    private String currency;

}
