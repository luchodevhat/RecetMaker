package model

class Verduras(cantidad: Int) : Productos(cantidad), Icantidad {

    var ingrediente = mutableListOf<String>()
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
            println("La cantidad es de $cantidad\n" +
                    "Deseas escoger otro ingrediente? yes/no")
            var respuestaDos = readLine()

            // validacion dos
            if (respuestaDos.equals("yes") ?: ("yes" === null)) {
                escogerCantidad()
            }
            // validacion para agregar
            when(respuesta) {
                0 -> ingrediente.add("Patata")
                1 -> ingrediente.add("Col")
                2 -> ingrediente.add("Zanahoria")
                3 -> ingrediente.add("Brocoli")
                4 -> ingrediente.add("Coliflor")
            }
        }
    }
}
