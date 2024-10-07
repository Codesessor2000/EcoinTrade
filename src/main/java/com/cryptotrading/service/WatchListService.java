package com.cryptotrading.service;

import com.cryptotrading.modal.Coin;
import com.cryptotrading.modal.User;
import com.cryptotrading.modal.WatchList;
import org.springframework.boot.autoconfigure.ssl.SslProperties;

public interface WatchListService {
    WatchList findUserWatchList(Long userId) throws Exception;
    WatchList createWatchList(User user);
    WatchList findById(Long id) throws Exception;
    Coin addItemToWatchList(Coin coin, User user) throws Exception;
}
