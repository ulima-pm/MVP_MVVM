package pe.edu.ulima.pm.jetpackproject.model

import java.text.SimpleDateFormat

// Singleton
class FechasManager {
    companion object {
        private var instance : FechasManager? = null

        fun getInstance() : FechasManager{
            if (instance == null) {
                instance = FechasManager()
            }
            return instance!!
        }
    }

    fun getListaFechas(callback : (List<String>)-> Unit)  {
        val resp = listOf<String>("01/01/2022", "11/07/2022", "31/12/2022")
        callback(resp)
    }
}