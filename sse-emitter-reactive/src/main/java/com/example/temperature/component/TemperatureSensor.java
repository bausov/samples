package com.example.temperature.component;

import com.example.temperature.domain.Temperature;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import rx.Observable;

import java.util.Random;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * Created by GreenNun on 11.12.2019.
 */
@Component
@RequiredArgsConstructor
public class TemperatureSensor {
    private final Random random = new Random();
    private final Observable<Temperature> dataStream = Observable
            .range(0, Integer.MAX_VALUE)
            .concatMap(tick -> Observable.just(tick)
                    .doOnNext(System.out::println)
                    .delay(random.nextInt(5000), MILLISECONDS)
                    .map(tickValue -> this.probe()))
            .publish()
            .refCount();

    private Temperature probe() {
        final double temperature = 16 + random.nextGaussian() * 10;
        return new Temperature(temperature);
    }

    public Observable<Temperature> temperatureStream() {
        return dataStream;
    }
}
