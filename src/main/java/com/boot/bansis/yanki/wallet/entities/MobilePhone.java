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
@Document("mobile_phone_wallet")
public class MobilePhone {
    
    @Id
    private String id;
    
    @Field("mobile_number")
    private String mobileNumber;
    
    @Field("imei_code")
    private String imeiCode;
    
    @Field("created_at")
    @CreatedDate
    private Date createdAt;
    
    @LastModifiedDate
    @Field("updated_at")
    private Date updatedAt;
}
