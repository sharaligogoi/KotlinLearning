package android.example.kotlinbakchodi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Stack

fun main(args: Array<String>) {
    var stack1 = StackImp()

    stack1.push(3)
    stack1.push(5)
    stack1.push(2)
    stack1.push(1)
    stack1.pop()
    stack1.pop()
    stack1.push(6)



   // stack1.arrayStack.forEach { System.out.println(it) }
    for(i in 0 .. stack1.top)
        print((stack1.arrayStack[i]))
    println()
    println("----------")
    print(stack1.peak())

}