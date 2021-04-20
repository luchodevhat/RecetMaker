package model

class Ui: Recetas() {

    //  instanciaciones

    var nombreReceta: String = ""
    val aceite: Aceites = Aceites(1)
    val cereales: Cereales = Cereales(1)
    val frutas: Frutas = Frutas(1)
    val verduras: Verduras = Verduras( 1)
    val carnes: Carnes = Carnes(1)
    val lacteos: Lacteos = Lacteos(1)
    val receta: Recetas = Recetas()



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

    fun createRecipe() {
        println("Elementos escgidos para crear la receta\n")
        println("Aceites escogidos: ${aceite.ingrediente}")
        println("Carnes escogidos: ${carnes.ingrediente}")
        println("Cereales escogidos: ${cereales.ingrediente}")
        println("Frutas escogidos: ${frutas.ingrediente}")
        println("Lacteos escogidos: ${lacteos.ingrediente}")
        println("Verduras escogidos: ${verduras.ingrediente}")

        println("Deseas guardar esta receta? yes/no")
        var response = readLine()

        // validacion
        if (response.equals("yes") ?: ("yes" === null)) {

            var ingredientes = listOf<String>(aceite.ingrediente.toString(), carnes.ingrediente.toString(), cereales.ingrediente.toString(),
                frutas.ingrediente.toString(), lacteos.ingrediente.toString(), verduras.ingrediente.toString())
            println("Nombre de la receta:")
            nombreReceta = readLine()!!
            receta.recetasNombre.add(nombreReceta)
            receta.recetasIngredientes.add(ingredientes.toString())
            println("Receta guardada exitosamente")

            // validacion para limpiar los campos en receta creada
            aceite.ingrediente = mutableListOf()
            carnes.ingrediente = mutableListOf()
            cereales.ingrediente = mutableListOf()
            frutas.ingrediente = mutableListOf()
            lacteos.ingrediente = mutableListOf()
            verduras.ingrediente = mutableListOf()


        }else {
            makeRecipe()
        }

    }

    fun viewRecipe() {
        println("Las recetas creadas hasta el momento son")

        for (i in receta.recetasNombre) {
            i.plus(1)
            println("Nombre: ${receta.recetasNombre}\n" +
                    "Ingredientes: ${receta.recetasIngredientes}")
        }
    }


}