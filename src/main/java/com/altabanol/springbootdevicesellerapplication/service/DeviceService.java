package com.altabanol.springbootdevicesellerapplication.service;

import com.altabanol.springbootdevicesellerapplication.model.Device;

import java.util.List;

public interface DeviceService
{
    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}