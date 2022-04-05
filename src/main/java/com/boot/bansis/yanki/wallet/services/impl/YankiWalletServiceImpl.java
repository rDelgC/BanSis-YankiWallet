package com.boot.bansis.yanki.wallet.services.impl;

import com.boot.bansis.yanki.wallet.entities.YankiWallet;
import com.boot.bansis.yanki.wallet.repositories.YankiWalletRepository;
import com.boot.bansis.yanki.wallet.services.YankiWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
public class YankiWalletServiceImpl implements YankiWalletService {

    @Autowired
    private YankiWalletRepository yankiWalletDao;

    @Override
    public Flux<YankiWallet> findAll() {
        return yankiWalletDao.findAll();
    }

    @Override
    public Mono<YankiWallet> findById(String id) {
        return yankiWalletDao.findById(id);
    }

    @Override
    public Mono<YankiWallet> save(YankiWallet yankiWallet) {
        return yankiWalletDao.insert(yankiWallet);
    }

    @Override
    public Mono<YankiWallet> update(YankiWallet yankiWallet, String id) {
        return yankiWalletDao.findById(id)
                .map(p -> yankiWallet)
                .doOnNext(e -> e.setId(id))
                .doOnNext(e -> e.setCreatedAt(yankiWallet.getCreatedAt()))
                .flatMap(yankiWalletDao::save);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return yankiWalletDao.deleteById(id);
    }

}
