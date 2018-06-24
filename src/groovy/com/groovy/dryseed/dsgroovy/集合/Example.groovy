package com.groovy.dryseed.dsgroovy.集合

/**
 * https://www.w3cschool.cn/groovy/groovy_strings.html
 */
class Example {
    static void main(String[] args) {
        test1()
    }

    private static void test1() {
        def numList = [1, 2, 3]
        def numMap = [1: "dry", "dry": "seed"]

        println numList[1]      //输出 2
        println numList[-1]     //输出 3

        numList[2] = 4          // println numList[2]将输出 4
        numList[3] = 5
        numList << "dryseed"    //现在numList = [1, 2, 4, 5, "dryseed"]

        //========== Map 使用 ================
        println numMap[1]              //输出 dry
        println numMap.dry             //输出 seed, key是字符串的话可以这样访问
        //map[3] = "I am dryseed"     // 在map里加入一个[3:"I am dryseed"]项
        println()

        //========== 遍历集合 ================
        numList.each {
            print(it + " ")
        }
        println()
        numMap.each {
            print(it.key + ":" + it.value)
        }
        println()
    }

}
