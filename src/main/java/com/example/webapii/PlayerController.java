package com.example.webapii;

import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {
    PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;

    }

    @GetMapping("/players")
    public Iterable <Player> players() {
        return playerRepository.findAll();
    }

    @PostMapping("/players")
    public Player create(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    @DeleteMapping("/players/{id}")
    public void delete(@PathVariable Long id) {
        playerRepository.deleteById(id);
    }



}
