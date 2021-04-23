package model

open class Recetas {

    // atributos
    val numero: Int = 0
    val nombre: String = ""
    val ingrediente: String = ""

     var recetasNombre = mutableListOf<String>()
     var recetasIngredientes = mutableListOf<String>()

    // getters y setters
    fun setRecetasNombre(nombre: String) {
        recetasNombre.add(nombre)
    }
    fun getRecetasNombre(): String {
        return recetasNombre.get(numero)
    }

    fun setRecetasIngrediente(ingrediente: String){
        recetasIngredientes.add(ingrediente)
    }
    fun getRecetasIngrediente(): String {
        return recetasIngredientes.get(numero)
    }
}