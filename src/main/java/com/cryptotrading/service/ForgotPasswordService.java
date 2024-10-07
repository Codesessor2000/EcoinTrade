package com.cryptotrading.service;

import com.cryptotrading.domain.VerificationType;
import com.cryptotrading.modal.ForgotPasswordToken;
import com.cryptotrading.modal.User;

public interface ForgotPasswordService {
    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,
                                    String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken (ForgotPasswordToken token);
}
