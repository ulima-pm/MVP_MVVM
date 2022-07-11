package pe.edu.ulima.pm.jetpackproject.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.ulima.pm.jetpackproject.databinding.ActivityMainBinding
import pe.edu.ulima.pm.jetpackproject.model.FechasManager
import pe.edu.ulima.pm.jetpackproject.presenters.IMainPresenter
import pe.edu.ulima.pm.jetpackproject.presenters.MainPresenter
import pe.edu.ulima.pm.jetpackproject.presenters.MockMainPresenter
import java.util.*

class MainActivity : AppCompatActivity(), IMainView {
    private lateinit var binding : ActivityMainBinding
    private lateinit var presenter : IMainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = MockMainPresenter(this)

        binding.claPantalla.setOnClickListener {
            presenter.obtenerFechas()
        }
    }

    override fun setFechas(cadFechas: String) {
        binding.tviFecha.text = cadFechas
    }
}