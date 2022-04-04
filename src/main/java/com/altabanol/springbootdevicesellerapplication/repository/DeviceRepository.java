package com.altabanol.springbootdevicesellerapplication.repository;

import com.altabanol.springbootdevicesellerapplication.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long>
{
}

