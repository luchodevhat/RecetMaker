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
    fun getRecetasNombre(numero: Int): String {
        return recetasNombre.get(numero)
    }

    fun setRecetasIngrediente(ingrediente: MutableList<String>){
        recetasIngredientes.add(ingrediente.toString())
    }
    fun getRecetasIngrediente(numero: Int): String {
        return recetasIngredientes.get(numero)
    }
}