package com.springboot.practice;

import reactor.core.publisher.Mono;

public class practice1 {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Hello, Reactive");
        mono.subscribe(message -> System.out.println(message));
    }
}
