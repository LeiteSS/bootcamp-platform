package io.github.leitess.BootcampPlatform;

import io.github.leitess.BootcampPlatform.domain.Bootcamp;
import io.github.leitess.BootcampPlatform.domain.Course;
import io.github.leitess.BootcampPlatform.domain.Dev;
import io.github.leitess.BootcampPlatform.domain.Mentorship;

import java.time.LocalDate;

public class App
{
    public static void main(String[] args)
    {
        Course course1 = new Course();
        course1.setTitle("Curso Java");
        course1.setDescription("Descrição curso java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Curso JS");
        course2.setDescription("Descrição curso JavaScript");
        course2.setWorkload(4);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentoria de Java");
        mentorship.setDescription("Descrição Mentoria Java");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev devSilas = new Dev();
        devSilas.setName("Silas");
        devSilas.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Silas: " + devSilas.getContentsSubscribed());
        devSilas.toProgress();
        devSilas.toProgress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Silas: " + devSilas.getContentsSubscribed());
        System.out.println("Conteúdos concluidos Silas: " + devSilas.getContentsConcluded());
        System.out.println("XP: " + devSilas.calculateTotalXp());
        System.out.println("-----------------------------------------------------");

        Dev devPaulao = new Dev();
        devPaulao.setName("Paulão");
        devPaulao.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulão: " + devPaulao.getContentsSubscribed());
        devPaulao.toProgress();
        devPaulao.toProgress();
        devPaulao.toProgress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Paulão: " + devPaulao.getContentsSubscribed());
        System.out.println("Conteúdos concluidos Paulão: " + devPaulao.getContentsConcluded());
        System.out.println("XP: " + devPaulao.calculateTotalXp());
    }
}
