fun main(args: Array<String>) {

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
        println(":: Recetas ::")
    }

    //MENU

    do {
        println(":: Bienvenido a Recipe Maker ::\n" +
                "\n" +
                "\n" +
                "Selecciona la opción deseada\n" +
                "1. Hacer una receta\n" +
                "2. Ver mis recetas\n" +
                "3. Salir".trimMargin())

        var response = readLine()

        when(response) {
            "1" -> println("Haciendo receta ${makeRecipe()}")
            "2" -> println("Viendo receta ${viewRecipe()}")
            "3" -> println("Saliendo")
        }

    }while (!(response?.equals("3") ?: ("3" === null))
    )



}