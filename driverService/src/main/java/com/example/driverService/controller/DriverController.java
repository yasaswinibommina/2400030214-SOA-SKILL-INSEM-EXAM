package com.example.driverService.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {

    @Value("${server.port}")
    private int port;

    @GetMapping
    public String getDrivers() {
        return "Driver Service is running on port " + port;
    }
}
