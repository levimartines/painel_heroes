package com.levimartines.heroes_painel.controllers;

import com.levimartines.heroes_painel.models.Hero;
import com.levimartines.heroes_painel.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api/heroes")
public class HeroController {
    @Autowired
    private HeroService heroService;

    @GetMapping
    public ResponseEntity<List<Hero>> findAll() {
        List<Hero> list = heroService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Hero> insert(@RequestBody Hero hero) {
        hero = heroService.save(hero);
        return ResponseEntity.ok().body(hero);
    }
}

