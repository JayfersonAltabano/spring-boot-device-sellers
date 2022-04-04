package com.altabanol.springbootdevicesellerapplication.service;

import com.altabanol.springbootdevicesellerapplication.repository.PurchaseRepository;
import com.altabanol.springbootdevicesellerapplication.repository.projection.PurchaseItem;
import com.altabanol.springbootdevicesellerapplication.model.Purchase;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService
{
    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository)
    {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase)
    {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId)
    {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }
}