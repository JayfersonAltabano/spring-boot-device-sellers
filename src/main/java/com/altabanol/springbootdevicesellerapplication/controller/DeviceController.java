package com.altabanol.springbootdevicesellerapplication.controller;

import com.altabanol.springbootdevicesellerapplication.model.Device;
import com.altabanol.springbootdevicesellerapplication.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/device")//pre-path
public class DeviceController
{
    @Autowired
    private DeviceService deviceService;

    @PostMapping //api/device
    public ResponseEntity<?> saveDevice(@RequestBody Device device)
    {
        return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
    }

    @DeleteMapping("{deviceId}")//api/device/{deviceId}
    public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId)
    {
        deviceService.deleteDevice(deviceId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/device
    public ResponseEntity<?> getAllDevices()
    {
        return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
    }
}
