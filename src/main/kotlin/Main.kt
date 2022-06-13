import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    println("*-OPERACIONES-*")

    print("\ndigite un número: ")
    val n1 = scanner.nextInt()
    print("digite segundo número: ")
    val n2 = scanner.nextInt()

    val OpResultado = Operacion_Funciones()

    val suma = OpResultado.sumar(n1,n2)
    val resta = OpResultado.restar(n1,n2)
    val multiplicacion = OpResultado.multiplicar(n1,n2)
    val division = OpResultado.dividir(n1,n2)

    OpResultado.mostarResultado(suma, resta, multiplicacion, division)




}
