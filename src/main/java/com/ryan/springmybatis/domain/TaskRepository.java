package com.ryan.springmybatis.domain;

import com.ryan.springmybatis.domain.fundamentals.BaseId;

import java.util.List;

public interface TaskRepository {
    Task findBy(BaseId id);
    List<Task> list();
}
