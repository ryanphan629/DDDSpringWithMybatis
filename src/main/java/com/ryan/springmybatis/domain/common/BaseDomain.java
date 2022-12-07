package com.ryan.springmybatis.domain.common;

public interface BaseDomain<T> {
    T value();
    String asText();
    boolean isEmpty();
    boolean hasValue();
}
