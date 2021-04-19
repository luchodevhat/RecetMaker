package model

class Ui {

    //  instanciaciones

    val aceite: Aceites = Aceites(1)
    val cereales: Cereales = Cereales(1)
    val frutas: Frutas = Frutas(1)
    val verduras: Verduras = Verduras(1)
    val carnes: Carnes = Carnes(1)
    val lacteos: Lacteos = Lacteos(1)



    // funciones

    fun makeRecipe() {
        val foodList = listOf<String>("Agua","Lacteos","Carnes","Verduras","Frutas","Cereales","Huevos","Aceites")

        for ((index,food) in foodList.withIndex()) {
            index.plus(1)
            println("$index. $food")
        }

        println("Escoje un numero: ")
        var response = readLine()!!.toInt()

        // validacion
        if (response.compareTo(7) >0) {
            println("Error, los numeros tienen que ser de 0 al 7")
        }else {
            when(response) {
                0 -> println("Agua")
                1 -> println(lacteos.escogerCantidad())
                2 -> println(carnes.escogerCantidad())
                3 -> println(verduras.escogerCantidad())
                4 -> println(frutas.escogerCantidad())
                5 -> println(cereales.escogerCantidad())
                6 -> println("Huevos")
                7 -> println(aceite.escogerCantidad())
            }
        }
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