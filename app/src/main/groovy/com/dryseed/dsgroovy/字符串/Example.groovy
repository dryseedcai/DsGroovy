package com.dryseed.dsgroovy.字符串

/**
 * https://www.w3cschool.cn/groovy/groovy_strings.html
 */
class Example {
    static void main(String[] args) {
        test1()
        test2()
    }

    private static void test1() {
        String sample = "Hello world";
        println(sample[4]); // Print the 5 character in the string

        //Print the 1st character in the string starting from the back
        println(sample[-1]);
        println(sample[1..2]);//Prints a string starting from Index 1 to 2
        println(sample[4..2]);//Prints a string starting from Index 4 back to 2

        /*
            o
            d
            el
            oll
         */
    }

    private static void test2() {
        println("Hello World 1")

        println '''Hello
        World 2'''

        def str = '333'

        println """Hello World
        ${str}
        """

        /*
        Hello World 1
        Hello
                World 2
        Hello World
                333
         */
    }
}
