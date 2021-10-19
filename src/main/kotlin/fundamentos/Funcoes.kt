package fundamentos

fun main() {
    dizOi(retornaNome(), 25)
    dizOi(idade = 25, nome = "Gustavo")
    dizOi("Daniel")
}

fun retornaNome() : String {
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome}, parabéns por sua idade: ${idade} anos")
}