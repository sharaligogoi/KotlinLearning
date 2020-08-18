package android.example.kotlinbakchodi

import java.util.ArrayList

    class StackImp {
         var top = -1
        var arrayStack : IntArray
        var capacity = 5



        constructor() {

            this.arrayStack = IntArray(capacity)
        }

        fun push(value: Int){

            top++
            arrayStack[top] = value

        }

        fun pop(): Int{

            var a = top
            top--
            capacity--
            return arrayStack[a]
        }

        fun peak(): Int{
            return arrayStack[top]
        }

    }
