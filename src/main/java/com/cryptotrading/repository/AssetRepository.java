package com.cryptotrading.repository;

import com.cryptotrading.modal.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Long> {
    List<Asset> findByUserId(Long userId);

    Asset findAssetByUserIdAndCoinId(Long userId, String coinId);
}
