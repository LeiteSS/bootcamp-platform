package io.github.leitess.BootcampPlatform.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Course extends Content
{
    private int workload;

    @Override
    public double calculateXp() {
        return XP_DEFAULT * workload;
    }
}
