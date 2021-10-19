package fundamentos

fun main() {
    val pessoa: Pessoa? = null
    //tomar cuidado com as !!(garante que não vai estar nula e pode dar nullpointer)
    println(pessoa!!.nome)
}