package pe.edu.ulima.pm.jetpackproject.presenters

import pe.edu.ulima.pm.jetpackproject.model.FechasManager
import pe.edu.ulima.pm.jetpackproject.views.IMainView

class MainPresenter(val view : IMainView) : IMainPresenter{
    override fun obtenerFechas() {
        FechasManager.getInstance().getListaFechas { fechas ->
            var cad = ""
            fechas.forEach { fecha ->
                cad += "${fecha},"
            }
            //binding.tviFecha.text = cad
            view.setFechas(cad)
        }
    }
}