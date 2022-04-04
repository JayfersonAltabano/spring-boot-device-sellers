package com.altabanol.springbootdevicesellerapplication.repository.projection;

import com.altabanol.springbootdevicesellerapplication.model.DeviceType;

import java.time.LocalDateTime;

public interface PurchaseItem
{
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}

