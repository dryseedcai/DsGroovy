package com.dryseed.dsgroovy.闭包

class Closure {
    static void main(String[] args) {
        test1()
    }

    private static void test1() {
        def greeting = { it -> "Hello, $it!" }
        assert greeting('Patrick') == 'Hello, Patrick!'
    }
}