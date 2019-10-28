package com.levimartines.heroes_painel.services;

import com.levimartines.heroes_painel.models.Hero;
import com.levimartines.heroes_painel.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {
    @Autowired
    HeroRepository heroRepository;

    public Hero save (Hero hero) {
        hero = heroRepository.save(hero);
        return hero;
    }

    public Hero findById(Long id){
        return heroRepository.findById(id).orElseThrow();
    }

    public List<Hero> findAll() {
        return (List<Hero>) heroRepository.findAll();
    }

    public Hero update(Hero newHero) {
        Hero hero = this.findById(newHero.getId());
        hero.setName(newHero.getName());
        return heroRepository.save(hero);
    }

    public void delete(Long id){
        heroRepository.deleteById(id);
    }
}
