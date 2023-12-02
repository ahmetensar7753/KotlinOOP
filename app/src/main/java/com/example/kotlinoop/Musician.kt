package com.example.kotlinoop

open class Musician(name: String, instrument: String, age: Int) {

    var name : String? = name
        private set
        get


    private var instrument : String? = instrument

     var age : Int? = age
        private set
        get

}