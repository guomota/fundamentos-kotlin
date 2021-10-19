package fundamentos

fun main() {
    println(parOuImpar(2))
    println(parOuImpar(3))

    resultadoNota(3)
    resultadoNota(5)
    resultadoNota(8)
}

fun parOuImpar(numero: Int): String {
    // Return antes do if
    return if(numero % 2 == 0) {
        "Par"
    } else {
        "Ímpar"
    }
}

fun resultadoNota(nota: Int) {
    if (nota >= 6) {
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperação")
    } else {
        println("Reprovou")
    }
}