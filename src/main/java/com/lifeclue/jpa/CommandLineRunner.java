package com.lifeclue.jpa;

import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.List;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    private final ArticleRepository articleRepository;

    public CommandLineRunner(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void run(String... args) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < 100_000; i++) {
            articleRepository.findAll();
        }
        sw.stop();
        System.out.println(sw);
    }
}
