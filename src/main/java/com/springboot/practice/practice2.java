package com.springboot.practice;

import reactor.core.publisher.Flux;

import java.util.List;

public class practice2 {
    public static void main (String[] args) {
        Flux.fromIterable(List.of(1,3,6,7,8,11))
                .filter(n -> n >4 && (n % 2 == 0 ))
                .reduce((n1, n2) -> n1 + n2)
                .subscribe(System.out::println);

    }
}
