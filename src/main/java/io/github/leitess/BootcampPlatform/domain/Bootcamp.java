package io.github.leitess.BootcampPlatform.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@EqualsAndHashCode
public class Bootcamp
{
    private final LocalDate dateBegins = LocalDate.now();
    private final LocalDate dateEnds = dateBegins.plusDays(45);

    private String name;
    private String description;
    private Set<Dev> devsSubscribed = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();
}
