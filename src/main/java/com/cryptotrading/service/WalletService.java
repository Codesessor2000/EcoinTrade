package com.cryptotrading.service;

import com.cryptotrading.modal.Order;
import com.cryptotrading.modal.User;
import com.cryptotrading.modal.Wallet;

public interface WalletService {

    Wallet getUserWallet(User user);
    Wallet addBalance(Wallet wallet, Long money);
    Wallet findWalletById(Long id) throws Exception;
    Wallet walletToWalletTransfer(User sender, Wallet receiverWallet, Long amount) throws Exception;
    Wallet payOrderByPayment(Order order, User user) throws Exception;

}
