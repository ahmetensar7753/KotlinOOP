package com.example.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a1 = 23

        var a2: Int = 32

        var d1: Boolean = true

        var d2: Double = 3.14

        val d3: Char = 'D'


        val d4: String? = null

        var myUser = User("Ahmet", 32)

        var secondUser = User(name = "Ensar", age = 22)


        myUser.age = 23

        println(myUser.name.toString())
        println(myUser.age.toString())
        println(secondUser.name.toString())
        println(secondUser.age.toString())
        println(secondUser.information())

        var james = Musician("James", "Guitar", 33)
        println(james.age.toString())

        // inheritance
        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        lars.sing()

        // polymorphism

        // static polymorphism
        var math = Mathematics()
        println(math.sum())
        println(math.sum(3, 2))
        println(math.sum(4, 3, 1))

        // dynamic polymorphism
        var animal = Animal()
        animal.sing()

        var barley = Dog()
        barley.sing()
        barley.test()

        // abstract & interface

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()


        // Lambda expressions

        fun printString(myString: String) {
            println(myString)
        }

        printString("My Test String")

        val testString = { myString: String -> println(myString) }
        testString("My Lambda String")

        val multiplyLambda = { a: Int, b: Int -> a * b }

        println(multiplyLambda(32, 51))

        val multiplyLambda2: (Int, Int) -> Int = { a, b -> a * b }
        println(multiplyLambda2(5, 15))

        // async

        // callback func, listener func, completion func

        fun downloadMusicians(url: String, completion: (Musician) -> Unit) {
            // url -> download
            //data
            val kirkHammet = Musician("Kirk", "Guitar", 60)
            completion(kirkHammet)
        }

        downloadMusicians("mettalica.com", { musician ->
            println("completed && ready")
            println(musician.name)

            //println(it.name)
        })

    }
}