package com.levimartines.heroes_painel.services;

import com.levimartines.heroes_painel.models.Hero;
import com.levimartines.heroes_painel.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HeroService {
    @Autowired
    HeroRepository heroRepository;

    public Hero save (Hero hero) {
        hero = heroRepository.save(hero);
        return hero;
    }

    public List<Hero> findAll() {
        return (List<Hero>) heroRepository.findAll();
    }
}
