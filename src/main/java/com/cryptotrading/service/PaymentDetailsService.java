package com.cryptotrading.service;

import com.cryptotrading.modal.PaymentDetails;
import com.cryptotrading.modal.User;

public interface PaymentDetailsService {
    PaymentDetails addPaymentDetails(
            String accountNumber,
            String accountHolderName,
            String ifsc,
            String bankName,
            User user);

    PaymentDetails getUsersPaymentDetails(User user);
}
