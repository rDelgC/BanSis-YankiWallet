package com.boot.bansis.yanki.wallet.repositories;

import com.boot.bansis.yanki.wallet.entities.YankiWallet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rDelgC
 */
@Repository
public interface YankiWalletRepository extends ReactiveMongoRepository<YankiWallet, String> {

}
