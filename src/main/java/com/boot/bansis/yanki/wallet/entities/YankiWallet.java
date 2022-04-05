package com.boot.bansis.yanki.wallet.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("yanki_wallet")
public class YankiWallet {

    @Id
    private String id;

    @Field("available_balance")
    private double availableBalance;

    @Field("holder")
    private Holder holder;

    @Field("mobile_phone")
    private MobilePhone mobilePhone;

    @Field("created_at")
    @CreatedDate
    private Date CreatedAt;

    @Field("updated_at")
    @LastModifiedDate
    private Date UpdatedAt;

}
