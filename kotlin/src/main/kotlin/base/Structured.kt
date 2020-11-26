package base

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 结构化的并发
 */
fun main() = runBlocking {
    launch {// 在 runBlocking 作用域中启动一个新协程
        delay(1000)
        println("World! ,Thread name = ${Thread.currentThread().name}")
    }
    println("Hello ,Thread name = ${Thread.currentThread().name}")
}