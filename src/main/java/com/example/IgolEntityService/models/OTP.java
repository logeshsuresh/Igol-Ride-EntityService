package com.example.IgolEntityService.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OTP extends BaseModel {

    private String code;

    private String sentToNumber;

    public static OTP make(String phoneNumber) {
        Random random = new Random();
        int code = random.nextInt(9000) + 1000;
        return OTP.builder().code(Integer.toString(code)).sentToNumber(phoneNumber).build();
    }

}