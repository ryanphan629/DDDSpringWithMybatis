package com.ryan.springmybatis.domain.common;

public interface BaseDomain<T> {
    T values();
    String asText();
    boolean isEmpty();
    boolean hasValue();
}
