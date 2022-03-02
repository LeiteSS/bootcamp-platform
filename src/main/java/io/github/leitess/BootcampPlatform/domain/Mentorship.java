package io.github.leitess.BootcampPlatform.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Mentorship extends Content
{
    private LocalDate date;

    public Mentorship()
    {

    }

    @Override
    public double calculateXp()
    {
        return XP_DEFAULT + 20d;
    }

    @Override
    public String toString()
    {
        return "Mentoria {" +
                "titulo = '" + getTitle() + '\'' +
                ", descricao = '" + getDescription() + '\'' +
                ", data = " + getDate() +
                '}';
    }
}
