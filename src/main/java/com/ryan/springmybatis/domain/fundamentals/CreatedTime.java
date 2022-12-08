package com.ryan.springmybatis.domain.fundamentals;

import com.ryan.springmybatis.domain.common.BaseDomain;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data
public class CreatedTime implements BaseDomain<Date> {
    private Date value;

    public long asUnixTime() {
        return value.getTime();
    }

    public long ofNow() {
        return new Date().getTime();
    }

    @Override
    public Date values() {
        return value;
    }

    @Override
    public String asText() {
        return values().toString();
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(value);
    }

    @Override
    public boolean hasValue() {
        return !isEmpty();
    }
}
