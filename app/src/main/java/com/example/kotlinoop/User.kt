package com.example.kotlinoop

class User : People {

    var name : String? = null
    var age : Int? = null


    // constructor vs init

    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }

    init {
        println("init func")
    }

}