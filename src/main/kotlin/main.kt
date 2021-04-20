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
                "2. Guardar receta\n" +
                ("3. Ver mis recetas\n" + "4. Salir").trimMargin())

        var response = readLine()

        when(response) {
            "1" -> println("Haciendo receta ${systemFunctions.makeRecipe()}")
            "2" -> println("Creando receta ${systemFunctions.createRecipe()}")
            "3" -> println("Cargando recetas ${systemFunctions.viewRecipe()}")
            "4" -> println("Saliendo, gracias por escogernos")
        }

    }while (!(response?.equals("4") ?: ("4" === null))
    )



}