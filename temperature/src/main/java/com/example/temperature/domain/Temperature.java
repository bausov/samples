package com.example.temperature.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by GreenNun on 11.12.2019.
 */
@Data
@RequiredArgsConstructor
public class Temperature {
    private final double value;
}
