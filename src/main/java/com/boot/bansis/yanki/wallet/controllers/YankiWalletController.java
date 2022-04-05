package com.boot.bansis.yanki.wallet.controllers;

import com.boot.bansis.yanki.wallet.entities.YankiWallet;
import com.boot.bansis.yanki.wallet.services.YankiWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@RestController
@RequestMapping("/yanki")
public class YankiWalletController {

    @Autowired
    private YankiWalletService yankiWalletService;

    @GetMapping("/")
    public Flux<YankiWallet> findAll() {
        return yankiWalletService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<YankiWallet> findById(@PathVariable String id) {
        return yankiWalletService.findById(id);
    }

    @PostMapping("/save")
    public Mono<YankiWallet> savePerson(@RequestBody YankiWallet yankiWallet) {
        return yankiWalletService.save(yankiWallet);
    }

    @PutMapping("/update/{id}")
    public Mono<YankiWallet> updatePerson(@RequestBody YankiWallet yankiWallet, @PathVariable String id) {
        return yankiWalletService.update(yankiWallet, id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deletePerson(@PathVariable String id) {
        return yankiWalletService.deleteById(id);
    }

}
