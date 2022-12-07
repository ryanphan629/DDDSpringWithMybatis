package com.ryan.springmybatis.domain.fundamentals;

import lombok.Data;

import java.util.Date;

@Data
public class DateTime {
    private Date value;

    public long asUnixTime() {
        return value.getTime();
    }

    public long asNow() {
        return new Date().getTime();
    }
}
