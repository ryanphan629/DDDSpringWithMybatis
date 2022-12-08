package com.ryan.springmybatis.application.dtos;

import com.ryan.springmybatis.domain.Task;
import com.ryan.springmybatis.domain.fundamentals.BaseId;
import com.ryan.springmybatis.domain.fundamentals.CreatedTime;
import com.ryan.springmybatis.domain.fundamentals.Description;
import com.ryan.springmybatis.domain.fundamentals.Title;

public class CreateTaskDto {
    private String title;
    private String description;

    public Task toEntity() {
        return new Task(
                new BaseId(),
                new Title(),
                new Description(),
                new CreatedTime()
        );
    }
}
