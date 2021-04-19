package model

class Lacteos(ingrediente: String, cantidad: Int) : Productos(ingrediente, cantidad), Icantidad {

    val alimentos = listOf<String>("Leche", "Queso", "Natilla", "Yogurt")

    override fun escogerCantidad() {
        println("Escoge el producto")

        for ((index,food) in alimentos.withIndex()) {
            println("$index. $food")
        }
        var respuesta = readLine()!!.toInt()

        // validacion
        if (respuesta.compareTo(3) > 0) {
            println("Error, la respuesta tiene que ser de 0 a 3")
            escogerCantidad()
        } else {
            println("Escoje la cantidad")
            this.cantidad = readLine()!!.toInt()
            println("La cantidad es de $cantidad")
        }
    }
}