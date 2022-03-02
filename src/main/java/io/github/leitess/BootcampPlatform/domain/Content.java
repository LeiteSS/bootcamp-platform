package io.github.leitess.BootcampPlatform.domain;

import lombok.Data;

@Data
public abstract class Content
{
    protected static final double XP_DEFAULT = 10d;

    private String title;
    private String description;

    public abstract double calculateXp();
}
