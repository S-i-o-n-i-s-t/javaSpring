package com.example.lecture2;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    public enum Status{
        TO_DO,
        IN_PROGRESS,
        DONE
    }


    // тип данных для генерации id автоматически
    private UUID uuid;
    private String name, descroption;
    private Status status;
    private LocalDateTime completionTime;

    public Task(String name, String descroption) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.descroption = descroption;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescroption() {
        return descroption;
    }

    public void setDescroption(String descroption) {
        this.descroption = descroption;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDateTime completionTime) {
        this.completionTime = completionTime;
    }
}
