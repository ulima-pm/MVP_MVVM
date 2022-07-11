package pe.edu.ulima.pm.jetpackproject.presenters

import pe.edu.ulima.pm.jetpackproject.views.IMainView

class MockMainPresenter(val view : IMainView) : IMainPresenter {
    override fun obtenerFechas() {
        val cad = "01/01/2020,01/01/2021, 01/01/2022"
        view.setFechas(cad)
    }
}