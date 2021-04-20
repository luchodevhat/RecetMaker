package model

class Frutas(cantidad: Int) : Productos(cantidad), Icantidad {

    var ingrediente = mutableListOf<String>()
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
            println("La cantidad es de $cantidad\n" +
                    "Deseas escoger otro ingrediente? yes/no")
            var respuestaDos = readLine()

            // validacion dos
            if (respuestaDos.equals("yes") ?: ("yes" === null)) {
                escogerCantidad()
            }
            // validacion para agregar
            when(respuesta) {
                0 -> ingrediente.add("Manzana")
                1 -> ingrediente.add("Pera")
                2 -> ingrediente.add("Fresas")
                3 -> ingrediente.add("Uvas")
                4 -> ingrediente.add("Sandia")
                5 -> ingrediente.add("Melon")
                6 -> ingrediente.add("Papaya")
            }
        }
    }
}
