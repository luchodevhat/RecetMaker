package model

class Cereales(cantidad: Int) : Productos(cantidad), Icantidad {

    var ingrediente = mutableListOf<String>()
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
            println("La cantidad es de $cantidad\n" +
                    "Deseas escoger otro ingrediente? yes/no")
            var respuestaDos = readLine()

            // validacion dos
            if (respuestaDos.equals("yes") ?: ("yes" === null)) {
                escogerCantidad()
            }
            // validacion para agregar
            when(respuesta) {
                0 -> ingrediente.add("Avena")
                1 -> ingrediente.add("Arroz")
                2 -> ingrediente.add("Trigo")
                3 -> ingrediente.add("Centeno")
                4 -> ingrediente.add("Cebada")
                5 -> ingrediente.add("Quinoa")
            }
        }
    }
}
