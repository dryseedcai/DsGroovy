package com.dryseed.dsgroovy.方法

class Example {
    static void main(String[] args) {
        new Example().test1()

    }

    def add(a, b) {
        a + b
    }

    void test1() {
        println add(1, 2)
    }

}
