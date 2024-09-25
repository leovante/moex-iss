package ru.exdata.moex.enums;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@Introspected
@AllArgsConstructor
public enum SecurityGroup {

    stock_shares,
    stock_ppif

}