package model

class Verduras(cantidad: Int) : Productos(cantidad), Icantidad {

    val alimentos = listOf<String>("Patata", "Col", "Zanahoria", "Brocoli", "Coliflor")

    override fun escogerCantidad() {
        println("Escoge el producto")

        for ((index,food) in alimentos.withIndex()) {
            println("$index. $food")
        }
        var respuesta = readLine()!!.toInt()

        // validacion
        if (respuesta.compareTo(4) > 0) {
            println("Error, la respuesta tiene que ser de 0 a 4")
            escogerCantidad()
        } else {
            println("Escoje la cantidad")
            this.cantidad = readLine()!!.toInt()
            println("La cantidad es de $cantidad")
        }
    }
}