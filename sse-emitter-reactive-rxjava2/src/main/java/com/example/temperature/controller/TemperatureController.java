package com.example.temperature.controller;

import com.example.temperature.component.TemperatureSensor;
import com.example.temperature.domain.RxSseEmitter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GreenNun on 11.12.2019.
 */
@RestController
public class TemperatureController {
    private final TemperatureSensor temperatureSensor;

    public TemperatureController(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    @GetMapping("/temperature-stream")
    public SseEmitter events(HttpServletRequest request) {
        final RxSseEmitter emitter = new RxSseEmitter();

        temperatureSensor
                .temperatureStream()
                .subscribe(emitter.getSubscriber());

        return emitter;
    }
}
