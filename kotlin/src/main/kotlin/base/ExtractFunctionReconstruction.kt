package base

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 提取函数重构
 */
fun main() = runBlocking {
    launch {
        doWorld()
    }
    println("Hello ,Thread name = ${Thread.currentThread().name}")
}

// 这是你的第一个挂起函数
suspend fun doWorld(){
    delay(1000)
    println("World ,Thread name = ${Thread.currentThread().name}")
}