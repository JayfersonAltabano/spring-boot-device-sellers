package com.altabanol.springbootdevicesellerapplication.service;

import com.altabanol.springbootdevicesellerapplication.model.Purchase;
import com.altabanol.springbootdevicesellerapplication.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}

