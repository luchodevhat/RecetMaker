package model

class Cereales(cantidad: Int) : Productos(cantidad), Icantidad {

    val alimentos = listOf<String>("Avena", "Arroz", "Trigo", "Centeno", "Cebada", "Quinoa")

    override fun escogerCantidad() {

        println("Escoge el producto")

        for ((index,food) in alimentos.withIndex()) {
            println("$index. $food")
        }
        var respuesta = readLine()!!.toInt()

        // validacion
        if (respuesta.compareTo(5) > 0) {
            println("Error, la respuesta tiene que ser de 0 a 5")
            escogerCantidad()
        } else {
            println("Escoje la cantidad")
            this.cantidad = readLine()!!.toInt()
            println("La cantidad es de $cantidad")
        }
    }
}