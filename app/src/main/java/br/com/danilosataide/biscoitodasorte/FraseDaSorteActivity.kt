package br.com.danilosataide.biscoitodasorte

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_frase_da_sorte.*
import java.util.*

class FraseDaSorteActivity : AppCompatActivity() {
    //Criando uma lista de frases para o biscoito da sorte
    private var frasesDaSorte = arrayListOf(
        "A vida trará coisas boas se tiveres paciência.",
        "Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você.",
        "Não compense na ira o que lhe falta na razão.",
        "Defeitos e virtudes são apenas dois lados da mesma moeda.",
        "A maior de todas as torres começa no solo.",
        "Não há que ser forte. Há que ser flexível.",
        "Gente todo dia arruma os cabelos, por que não o coração?",
        "Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.",
        "A juventude não é uma época da vida, é um estado de espírito.",
        "Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.",
        "Dê toda a atenção para a formação dos teus filhos, sobretudo por exemplos de tua própria vida.",
        "Siga os bons e aprenda com eles.",
        "Não importa o tamanho da montanha, ela não pode tapar o sol.",
        "O bom senso vai mais longe do que muito conhecimento.",
        "Quem quer colher rosas deve suportar os espinhos."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frase_da_sorte)
        gerarFraseDaSorte()

        btnAbrirOutroBiscoitoSorte.setOnClickListener {
            gerarFraseDaSorte()
        }

        btnVoltarMain.setOnClickListener {
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
        }

    }

    fun getFraseDaSorte (index: Int): String{
        if(index != null)
            return this.frasesDaSorte[index]
        else
            return ""
    }

    fun gerarFraseDaSorte(){
        val frasesDaSorteSize: Int = this.frasesDaSorte.size
        val random = Random()
        val rand = random.nextInt(frasesDaSorteSize)

        textViewFrase.text = getFraseDaSorte(rand);
    }
}