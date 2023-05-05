package com.emre.kotlingclassesandfunctions

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myText: TextView
    lateinit var button: Button
    lateinit var nameText: EditText
    lateinit var ageText: EditText
    lateinit var jobText: EditText
    var age: Int? = 0
    var name = ""
    var job = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.myText)
        button = findViewById(R.id.button)
        nameText = findViewById(R.id.nameText)
        ageText = findViewById(R.id.ageText)
        jobText = findViewById(R.id.jobText)


        /*
        sum(5, 6)
        println(multiply(5, 7)) // return sonucunu parantez içine verir
        */


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

    fun buttonClicked(view: View) {
        name = nameText.text.toString()
        age = ageText.text.toString().toIntOrNull() // değeri nullable yapar (Int?)
        job = jobText.text.toString()

        if (age != null) {

            val simpson = Simpson(name, age!!, job)

            myText.text = "Name: ${simpson.name} - Age: ${simpson.age} - Job: ${simpson.job}"
        } else {
            myText.text = "Enter age"
        }


    }
}