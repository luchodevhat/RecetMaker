package model

class Ui {

    // funciones

    fun makeRecipe() {
        val foodList = listOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceites")

        for ((index,food) in foodList.withIndex()) {
            index.plus(1)
            println("$index. $food")
        }

        println("Escoje un numero: ")
        var response = readLine()
    }

    fun viewRecipe() {
         val recipes = listOf<String>("Arroz con leche", "Batido de chocolate", "Ensalada de frutas")
        println(":: Recetas ::")

        for ((index,food) in recipes.withIndex()) {
            println("$index. $food")
        }
        var response = readLine()
    }




}