package cancel_and_time_out

import kotlinx.coroutines.*

fun main()= runBlocking{
    val job = GlobalScope.launch {
        repeat(1000){
            println("job: I'm sleeping $it ...")
            delay(500L)
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancel()
    job.join()
//    job.cancelAndJoin()
    println("main: Now I can quit.")
}