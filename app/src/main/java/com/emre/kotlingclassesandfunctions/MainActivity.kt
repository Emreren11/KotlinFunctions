package com.emre.kotlingclassesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum(5, 6)
        println(multiply(5, 7)) // return sonucunu parantez içine verir

        //Classes
        val homer = Simpson("Homer", 50, "Nuclear")
        /*
        homer.name = "Homer Simpson"
        homer.age = 50
        homer.job = "Nuclear"*/
        println(homer.name)


        //Nullability

        var myString: String? = null // "?" değerin null olma ihtimalinden dolayı konur
        println(myString) // Çıktısını "null" olur

        var myAge: Int? = null
        myAge = 20

        // !! -> myAge kesin boş değil
        //println(myAge!! * 50)

        // ? -> myAge boş olabilir
        //println(myAge!! * 50)

        //elvis operator

        println(myAge?.minus(10) ?: -10) // myAge null ise -10 yazdırır.

        //if - else

        if (myAge != null) {
            println(myAge.minus(10))
        } else {
            println("myAge is null")
        }

        // if - else ile yerine

        myAge?.let { // it -> eğer myAge null değilse myAge değerini alır
            println(it * 10)
            //myAge null ise bu alan çalışmaz
        }

    }

    fun test() { // Fonksiyon oluşturma

    }

    fun sum(a: Int, b: Int) { // Unit fonksiyon -> geri dönüt vermeyen foksiyonlar (void)
        println(a + b)
    }

    fun multiply(x: Int, y: Int): Int {
        return x * y
    }
}