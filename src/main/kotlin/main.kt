import model.Ui

fun main(args: Array<String>) {

    // objects

    val systemFunctions = Ui()

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
            "1" -> println("Haciendo receta ${systemFunctions.makeRecipe()}")
            "2" -> println("Viendo receta ${systemFunctions.viewRecipe()}")
            "3" -> println("Saliendo, gracias por escogernos")
        }

    }while (!(response?.equals("3") ?: ("3" === null))
    )



}