package com.ryan.springmybatis.application.dtos;

import com.ryan.springmybatis.domain.Task;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TaskDto {
    private int id;
    private String title;
    private String description;
    private long createdAt;


    public TaskDto of(Task entity) {
        return TaskDto.builder()
                .id(entity.getId().getValue())
                .title(entity.getTitle().getValue())
                .description(entity.getDescription().getValue())
                .createdAt(entity.getCreatedAt().asUnixTime())
                .build();
    }
}
