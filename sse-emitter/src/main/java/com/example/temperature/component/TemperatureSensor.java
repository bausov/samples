package com.example.temperature.component;

import com.example.temperature.domain.Temperature;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by GreenNun on 11.12.2019.
 */
@Component
@RequiredArgsConstructor
public class TemperatureSensor {
    private final ApplicationEventPublisher publisher;
    private final Random random = new Random();
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    @PostConstruct
    public void startProcessing() {
        this.executor.schedule(this::probe, 1, SECONDS);
    }

    private void probe() {
        final double temperature = 16 + random.nextGaussian() * 10;
        publisher.publishEvent(new Temperature(temperature));

        executor.schedule(this::probe, random.nextInt(5000), MILLISECONDS);
    }
}
