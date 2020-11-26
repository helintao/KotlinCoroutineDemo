package base

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 协程很轻量
 * 全局协程像守护线程
 */
fun main() = runBlocking {
    //协程很轻量
    repeat(10_000){// 启动大量的协程
        delay(500L)
        println("$it ,Thread name = ${Thread.currentThread().name}")
    }

    //全局协程像守护线程
    GlobalScope.launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // 在延迟后退出
}

/**
 * 非守护线程
 */
//fun base.main(){
//    Thread{
//        repeat(1000){
//            i ->
//            println("I'm sleeping $i ...")
//            Thread.sleep(500L)
//        }
//    }.start()
//    Thread.sleep(1300)
//    println("base.main destroy")
//}