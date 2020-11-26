import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job1 = GlobalScope.launch {
        delay(3000)
        println("World!")
    }
    val job2 = GlobalScope.launch {
        delay(2000)
        println("java")
    }
    main_1()
    println("Hello")
    job1.join()
    job2.join()
}

fun main_1() = runBlocking <Unit>{
    println("kotlin")
    delay(1000)
}