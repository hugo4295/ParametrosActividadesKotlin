package mx.android.hugo4295.parametrosactividadeskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val parametros = intent.extras
        val nombre = parametros.get("Nombre")
        lblnombre.text = nombre.toString()
    }
}
