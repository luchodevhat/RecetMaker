package model

class Carnes(cantidad: Int) : Productos(cantidad), Icantidad {

    var ingrediente = mutableListOf<String>()
    val alimentos = listOf<String>("Carne roja", "Carne blanca", "Carne de cerdo", "Carne de cabra")

    override fun escogerCantidad() {
        println("Escoge el producto")

        for ((index, food) in alimentos.withIndex()) {
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
            println("La cantidad es de $cantidad\n" +
                    "Deseas escoger otro ingrediente? yes/no")
            var respuestaDos = readLine()

            // validacion dos
            if (respuestaDos.equals("yes") ?: ("yes" === null)) {
                escogerCantidad()
            }
            // validacion para agregar
            when(respuesta) {
                0 -> ingrediente.add("Carne roja")
                1 -> ingrediente.add("Carne blanca")
                2 -> ingrediente.add("Carne de cerdo")
                3 -> ingrediente.add("Carne de cabra")
            }
        }
    }
}