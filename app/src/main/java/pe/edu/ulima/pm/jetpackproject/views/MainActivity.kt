package pe.edu.ulima.pm.jetpackproject.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import pe.edu.ulima.pm.jetpackproject.databinding.ActivityMainBinding
import pe.edu.ulima.pm.jetpackproject.model.FechasManager
import pe.edu.ulima.pm.jetpackproject.presenters.IMainPresenter
import pe.edu.ulima.pm.jetpackproject.presenters.MainPresenter
import pe.edu.ulima.pm.jetpackproject.presenters.MockMainPresenter
import pe.edu.ulima.pm.jetpackproject.viewmodels.MainViewModel
import java.util.*

class MainActivity : AppCompatActivity(), IMainView {
    private lateinit var binding : ActivityMainBinding
    private val viewmodel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodel.fechasModel.observe(this, androidx.lifecycle.Observer { fechaCad ->
            setFechas(fechaCad)
        })

        binding.claPantalla.setOnClickListener {
            viewmodel.getFechas()
        }
    }

    override fun setFechas(cadFechas: String) {
        binding.tviFecha.text = cadFechas
    }
}