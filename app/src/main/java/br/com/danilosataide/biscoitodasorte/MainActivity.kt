package br.com.danilosataide.biscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Escutando o clique do botão Sair
        btnSair.setOnClickListener {
            // Criando uma caixa de diálogo
            val alert = AlertDialog.Builder(this)

            //Definindo o título da caixa de diálogo
            alert.setTitle("App 1 Biscoito da Sorte")

            //Definindo o corpo da mensagem
            alert.setMessage("Deseja sair do aplicativo?")

            //Definindo o rótulo do botão e escutando o clique
            alert.setPositiveButton("Sim, sair") {dialog, wich ->
                //Eliminando as telas da pilha
                finishAffinity()
            }

            //Definindo o rótulo do botão e escutando seu clique
            alert.setNegativeButton("Não") {_,_ ->}

            //Exibindo a caixa de diálogo
            alert.show()
        }

        btnAbrirBiscoitoSorte.setOnClickListener {
            val mIntent = Intent(this, FraseDaSorteActivity::class.java)
            startActivity(mIntent)
        }
    }
}