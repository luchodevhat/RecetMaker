fun main(args: Array<String>) {

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
            "1" -> println("Haciendo receta")
            "2" -> println("Viendo receta")
            "3" -> println("Saliendo")
        }

    }while (!(response?.equals("3") ?: ("3" === null))
)
}