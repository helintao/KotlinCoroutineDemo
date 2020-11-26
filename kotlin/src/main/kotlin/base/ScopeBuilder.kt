package base

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 作用域构建器
 */
fun main() = runBlocking {
    launch {
        delay(2000)
        println("Task from runBlocking ,Thread name = ${Thread.currentThread().name}")
    }

    coroutineScope {// 创建一个协程作用域
        launch {
            delay(5000)
            println("Task from nested launch ,Thread name = ${Thread.currentThread().name}")
        }
        delay(1000)
        println("Task from coroutine scope ,Thread name = ${Thread.currentThread().name}")// 这一行会在内嵌 launch 之前输出
    }

    println("Coroutine scope is over ,Thread name = ${Thread.currentThread().name}")// 这一行在内嵌 launch 执行完毕后才输出
}