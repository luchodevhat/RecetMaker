package model

class Frutas(cantidad: Int) : Productos(cantidad), Icantidad {

    val alimentos = listOf<String>("Manzana", "Pera", "Fresas", "Uvas", "Sandia", "Melon", "Papaya")

    override fun escogerCantidad() {
        println("Escoge el producto")

        for ((index,food) in alimentos.withIndex()) {
            println("$index. $food")
        }
        var respuesta = readLine()!!.toInt()

        // validacion
        if (respuesta.compareTo(6) > 0) {
            println("Error, la respuesta tiene que ser de 0 a 6")
            escogerCantidad()
        } else {
            println("Escoje la cantidad")
            this.cantidad = readLine()!!.toInt()
            println("La cantidad es de $cantidad")
        }
    }
}