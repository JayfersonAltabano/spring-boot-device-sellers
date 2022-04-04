package com.altabanol.springbootdevicesellerapplication.service;

import com.altabanol.springbootdevicesellerapplication.model.Device;
import com.altabanol.springbootdevicesellerapplication.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService
{
    private final DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository)
    {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device saveDevice(Device device)
    {
        device.setCreateTime(LocalDateTime.now());

        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id)
    {
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices()
    {
        return deviceRepository.findAll();
    }
}