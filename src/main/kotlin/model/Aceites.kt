package model

class Aceites(cantidad: Int) : Productos(cantidad), Icantidad {

    // atributos e instancias

    var ingrediente = mutableListOf<String>()
    val alimentos = listOf<String>("Aceite de maiz", "Aceite de mani", "Aceite de girasol", "Aceite clover")

    override fun escogerCantidad() {
        println("Escoge el producto")

        for ((index, food) in alimentos.withIndex()) {
            println("$index. $food")
        }
        var respuesta = readLine()!!.toInt()

        // validaciones

        // validacion uno
        if (respuesta.compareTo(3) >0) {
            println("Error, la respuesta tiene que ser de 0 a 3")
            escogerCantidad()
        }else{
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
                0 -> ingrediente.add("Aceite de maiz")
                1 -> ingrediente.add("Aceite de mani")
                2 -> ingrediente.add("Aceite de girasol")
                3 -> ingrediente.add("Aceite de clover")
            }
        }
    }
}