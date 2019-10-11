package com.levimartines.heroes_painel;

import com.levimartines.heroes_painel.models.Hero;
import com.levimartines.heroes_painel.services.HeroService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class HeroesPainelApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroesPainelApplication.class, args);
    }


}
