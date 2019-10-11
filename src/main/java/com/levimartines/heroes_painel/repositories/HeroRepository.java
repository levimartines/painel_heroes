package com.levimartines.heroes_painel.repositories;

import com.levimartines.heroes_painel.models.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends CrudRepository<Hero, Long> {

}