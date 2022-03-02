package io.github.leitess.BootcampPlatform.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Data
@EqualsAndHashCode
public class Dev
{
    private String name;
    private Set<Content> contentsSubscribed = new LinkedHashSet<>();
    private Set<Content> contentsConcluded = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp)
    {
        this.contentsSubscribed.addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribed().add(this);
    }

    public void toProgress()
    {
        Optional<Content> content = this.contentsSubscribed.stream().findFirst();

        if(content.isPresent())
        {
            this.contentsConcluded.add(content.get());
            this.contentsSubscribed.remove(content.get());
        } else
        {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp() {
        return this.contentsConcluded
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }
}
