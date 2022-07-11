package pe.edu.ulima.pm.jetpackproject.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import pe.edu.ulima.pm.jetpackproject.model.FechasManager

class MainViewModel : ViewModel() {
    val  fechasModel = MutableLiveData<String>()

    fun getFechas() {
        FechasManager.getInstance().getListaFechas { fechas ->
            var cad = ""
            fechas.forEach { fecha ->
                cad += "${fecha},"
            }
            fechasModel.postValue(cad)
        }
    }
}