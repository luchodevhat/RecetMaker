package model

class Aceites(ingrediente: String, cantidad: Int) : Productos(ingrediente, cantidad), Icantidad {

    // atributos e instancias

    var recetas: Recetas = Recetas()
    val alimentos = listOf<String>("Aceite de maiz", "Aceite de mani", "Aceite de girasol", "Aceite clover")
   // val menu: Ui = Ui()

    override fun escogerCantidad() {
        println("Escoge el producto")

        for ((index, food) in alimentos.withIndex()) {
            println("$index. $food")
            this.ingrediente = food
        }
        var respuesta = readLine()!!.toInt()

        // validacion
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

            }


        }


    }
}