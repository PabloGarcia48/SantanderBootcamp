package me.dio.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged


class MainActivity : AppCompatActivity() {

    private lateinit var mEtAltura: EditText
    private lateinit var mEtPeso: EditText
    private lateinit var mTvIMCResultado: TextView
    private lateinit var mBtCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.w("lifecycle", "CREATE - estou criando a tela")
//        setListeners()
        mEtAltura = findViewById<EditText>(R.id.etAltura)
        mEtPeso = findViewById<EditText>(R.id.etPeso)
        mTvIMCResultado = findViewById<TextView>(R.id.tvIMCResultado)
        mBtCalcular = findViewById<Button>(R.id.btCalcular)

    }


    private fun setListeners() {
        mEtAltura?.doAfterTextChanged { text ->
//            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        mEtPeso?.doOnTextChanged { text, start, before, count ->
//            mTvIMCResultado?.text = text
        }
        mBtCalcular?.setOnClickListener {
            calcularIMC(mEtPeso.text.toString(), mEtAltura.text.toString())
        }

    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            mTvIMCResultado.text = imc.toString()
        }
    }


//    override fun onStart() {
//        super.onStart()
//        Log.w("lifecycle", "START - deixei a tela visível para você")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.w("lifecycle", "RESUME - agora você pode interagir com a tela")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.w("lifecycle", "PAUSE - a tela perdeu o foco, você não pode interagir")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.w("lifecycle", "STOP - a tela não está mais visível, mas ainda existe")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.w("lifecycle", "RESTART - a tela está retornando ao foco")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.w("lifecycle", "DESTROY - oh não! A tela foi destruída")
//    }


}