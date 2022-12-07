package com.ryan.springmybatis.domain;

import com.ryan.springmybatis.domain.fundamentals.BaseId;
import com.ryan.springmybatis.domain.fundamentals.DateTime;
import com.ryan.springmybatis.domain.fundamentals.Description;
import com.ryan.springmybatis.domain.fundamentals.Title;
import lombok.Data;

@Data
public class Task {
    private BaseId id;
    private Title title;
    private Description description;
    private DateTime createdAt;

    public Task(BaseId baseId, Title title, Description description, DateTime dateTime) {
        this.id = baseId;
        this.title = title;
        this.description = description;
        this.createdAt = dateTime;
    }
}
