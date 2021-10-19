package fundamentos

fun main() {

    /* Var pode ter seu valor alterado */
    var nome = "Gustavo"

    /* Val NÃO pode ter seu valor alterado */
    val nomeVal = "Gustavo"

    nome = "Daniel"
    //nomeval = "daniel"

    val idade = 24
    println(idade)

    /* Não preciso declarar o tipo da variável, mas quando inicio, por baixo dos panos é atribuido um tipo
    e não pode ser alterado, conform exemplo abaixo, sem o toString() */
    var texto = "String"
    texto = 123.toString()
}

class Variaveis {

    var teste: String = "teste"
    /* o lateinit indica que essa variável será iniciado depois kkkkk, conforme o nome já diz */
    lateinit var teste1: String

    fun iniciaVariaveis() {
        teste = "teste"
    }
}

/*
* Tipos básicos do Kotlin
*
* -> Numéricos
*   Byte, Short, Int, Long
*
*   Floating-point
*       Float, Double
*
* -> Boolean
*   True, False
*
* -> Char
* -> String
* -> Arrays
*
* */
