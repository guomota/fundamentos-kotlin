package fundamentos

fun main() {
    //pode conter inteiro nulo na lista
    var lista : List<Int?> = listOf(1,2,null,3)

    //pode ter lista nula
    var listaNullable : List<Int>? = null

    //pode conter inteiro nulo na lista e pode ter lista nula
    var listaNullableTest : List<Int?>? = null

//    var nome : String? = null
//    var tamanho: Int = nome?.length?: 0
//    println(tamanho)

//    var nome: String? = "Gustavo"
//    if(nome != null) {
//        println(nome.length)
//    }
//    println(nome?.length)
//    val toShort : Short = nome!!.length.toShort()
}