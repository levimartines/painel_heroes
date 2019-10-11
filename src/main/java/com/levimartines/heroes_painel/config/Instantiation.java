package com.levimartines.heroes_painel.config;

import com.levimartines.heroes_painel.models.Hero;
import com.levimartines.heroes_painel.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    HeroService heroService;
    @Override
    public void run(String... args) {

        Stream.of("Narco", "Bombasto", "Celeritas", "Magneta", "RubberMan", "Dynama", "Dr IQ").forEach(name -> {
            heroService.save(new Hero(null, name));
        });
        heroService.findAll().forEach(System.out::println);
    }
}
