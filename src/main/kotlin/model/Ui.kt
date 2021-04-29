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

        // validacion de respuesta de los productos
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

        // validacion si desea guardar la receta o no
        if (response.equals("yes") ?: ("yes" === null)) {

            // guardado de los ingredientes de la receta

            if (!(aceite.ingrediente?.equals(null) ?: (null == null))) {
                receta.setRecetasIngrediente(aceite.ingrediente)
            }
            if (!(carnes.ingrediente?.equals(null) ?: (null == null))) {
                receta.setRecetasIngrediente(carnes.ingrediente)
            }
            if (!(cereales.ingrediente?.equals(null) ?: (null == null))) {
                receta.setRecetasIngrediente(cereales.ingrediente)
            }
            if (!(frutas.ingrediente?.equals(null) ?: (null == null))) {
                receta.setRecetasIngrediente(frutas.ingrediente)
            }
            if (!(lacteos.ingrediente?.equals(null) ?: (null == null))) {
                receta.setRecetasIngrediente(lacteos.ingrediente)
            }
            if (!(verduras.ingrediente?.equals(null) ?: (null == null))) {
                receta.setRecetasIngrediente(verduras.ingrediente)
            }


            // guardado del nombre de la receta
            println("Nombre de la receta:")
            nombreReceta = readLine()!!
            receta.setRecetasNombre(nombreReceta)
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

        for ((index,food) in receta.recetasNombre.withIndex()) {
            var number: Int = 1
            number.plus(1)
            println("Nombre: ${receta.getRecetasNombre(index)}")
            println("Ingredientes:")

            for ((indice,i) in receta.recetasIngredientes.withIndex()) {
                println("${receta.getRecetasIngrediente(indice)} ")     // trabajando desde aqui, meter otra lista de recetas para mostrar
                indice.plus(1)
            }

            index.plus(1)
        }
    }


}