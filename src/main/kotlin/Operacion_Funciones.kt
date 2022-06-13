class Operacion_Funciones {

    fun sumar(n1 : Int, n2 : Int): Int {
        var suma = n1 + n2
        return suma

    }

    fun restar(n1: Int, n2: Int) : Int{
        var resta = n1.minus(n2)
        return resta
    }

    fun multiplicar(n1: Int, n2: Int) : Int{
        var multiplica = n1 * n2
        return multiplica
    }

    fun dividir(n1: Int, n2: Int) : Int{
        var divide = n1.div(n2)
        return divide
    }


    fun mostarResultado(sumar: Int, restar: Int, multiplicar: Int, dividir: Int){
        println("\nLa suma es: $sumar")
        println("La resta es: $restar")
        println("La multiplicación es: $multiplicar")
        println("La divisón es: $dividir")


    }

}