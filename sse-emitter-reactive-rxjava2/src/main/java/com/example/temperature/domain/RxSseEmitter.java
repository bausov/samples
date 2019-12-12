package com.example.temperature.domain;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * Created by GreenNun on 12.12.2019.
 */
@Slf4j
public class RxSseEmitter extends SseEmitter {
    private static final long SSE_SESSION_TIMEOUT = 30 * 60 * 1000;
    private final Observer<Temperature> subscriber;

    public RxSseEmitter() {
        super(SSE_SESSION_TIMEOUT);
        this.subscriber = new Observer<>() {
            private Disposable disposable;

            @Override
            public void onSubscribe(Disposable disposable) {
                log.info(">>> RxSseEmitter.onSubscribe");
                this.disposable = disposable;
            }

            @Override
            public void onNext(Temperature temperature) {
                try {
                    RxSseEmitter.this.send(temperature);
                } catch (Exception e) {
                    onError(e);
                }
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(">>> RxSseEmitter.onError");
                disposable.dispose();
            }

            @Override
            public void onComplete() {
                log.info(">>> RxSseEmitter.onComplete");
                disposable.dispose();
            }
        };

        onCompletion(subscriber::onComplete);
        onTimeout(subscriber::onComplete);
    }

    public Observer<Temperature> getSubscriber() {
        return subscriber;
    }
}
