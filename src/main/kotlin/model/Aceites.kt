package model

class Aceites(cantidad: Int) : Productos(cantidad), Icantidad {

    val alimentos = listOf<String>("Aceite de maiz", "Aceite de mani", "Aceite de girasol", "Aceite clover")

    override fun escogerCantidad() {
        println("Escoge el producto")

        for ((index, food) in alimentos.withIndex()) {
            println("$index. $food")
        }
        var respuesta = readLine()!!.toInt()

        // validacion
        if (respuesta.compareTo(3) >0) {
            println("Error, la respuesta tiene que ser de 0 a 3")
            escogerCantidad()
        }else{
            println("Escoje la cantidad")
            this.cantidad = readLine()!!.toInt()
            println("La cantidad es de $cantidad")
        }


    }
}