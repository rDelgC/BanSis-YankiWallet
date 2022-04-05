package com.boot.bansis.yanki.wallet.services;

import com.boot.bansis.yanki.wallet.entities.YankiWallet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
public interface YankiWalletService {

    public Flux<YankiWallet> findAll();

    public Mono<YankiWallet> findById(String id);

    public Mono<YankiWallet> save(YankiWallet yankiWallet);

    public Mono<YankiWallet> update(YankiWallet yankiWallet, String id);

    public Mono<Void> deleteById(String id);

}
