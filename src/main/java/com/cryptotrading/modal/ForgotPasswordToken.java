package com.cryptotrading.modal;

import com.cryptotrading.domain.VerificationType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ForgotPasswordToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @OneToOne
    private User user;

    private VerificationType verificationType;

    private String sendTo;

    private String otp;
}
