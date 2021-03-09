package com.example.hiltkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var lars: Musician
    @Inject
    lateinit var myClass : ClassEx


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lars.sign()
       println(myClass.myFunc())
        println(myClass.ndFunc())
    }
}
class FragmentEx(): Fragment(){
    @Inject
    lateinit var kirk :Musician

}