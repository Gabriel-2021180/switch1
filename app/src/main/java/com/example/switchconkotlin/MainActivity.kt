package com.example.switchconkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.isGone
import com.example.switchconkotlin.databinding.ActivityMainBinding
import android.view.View;

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var mensaje:String?=null
    private var nombre:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mensaje=binding.etTexto1.text.toString()
        nombre=binding.etTexto2.text.toString()


    }

    private fun Funcionswitch(){
        /*var Mensaje=binding.etTexto1.text
        var Nombre=binding.etTexto1.text*/
       // binding.txtNombre.text=nombre
        //binding.txtmensaje.text=mensaje
     binding.SwHablar.setOnCheckedChangeListener { compoundButton, isChecked ->
         if(isChecked){
             binding.txtNombre.text=nombre +":"+" "+ mensaje
             binding.txtmensaje.isGone
         }else
             binding.txtNombre.text=nombre
             binding.txtmensaje.text=mensaje
     }
    }

}