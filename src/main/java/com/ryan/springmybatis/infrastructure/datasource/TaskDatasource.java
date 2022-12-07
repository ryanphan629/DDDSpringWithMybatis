package com.ryan.springmybatis.infrastructure.datasource;

import com.ryan.springmybatis.domain.Task;
import com.ryan.springmybatis.domain.TaskRepository;
import com.ryan.springmybatis.domain.fundamentals.BaseId;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDatasource implements TaskRepository {
    @Override
    public Task findBy(BaseId id) {
        return null;
    }

    @Override
    public List<Task> list() {
        return null;
    }
}
