package fundamentos

fun main() {

    var mapNomeIdade = mutableMapOf("Gustavo" to 25, "Isabela" to 24)
    println(mapNomeIdade)

    mapNomeIdade["Bruno"] = 30
    println(mapNomeIdade)
    mapNomeIdade.remove("Bruno")
    println(mapNomeIdade)
    mapNomeIdade.putIfAbsent("Gustavo", 30)
    println(mapNomeIdade)
    //Não pode existir chave duplicada, apenas valor (K,V)

//    var lista = mutableListOf(1, 2, 4, 6, 3, 20, 15)
//
//    var listaNomes = mutableListOf("Isabela", "Gustavo")
//    println(listaNomes)
//    listaNomes.sort()
//    println(listaNomes)
//
//    // O set não repete valores iguais
//    var setNumeros = setOf(1,2,3,2)
//    println(setNumeros)

//    println(lista)
//    lista.sort()
//    println(lista)
//    lista.shuffle()
//    println(lista)

//    lista.add(8)
//    lista.removeAt(0)
//    lista.remove(3)
//
//    lista[0] = 20
//    println(lista)

//    val pares = lista.first { it % 2 == 0 }
//    println(pares)
//
//    lista.forEach() {
//        println(it)
//    }
//
//    for(numero in lista) {
//        println(numero)
//    }

//    println(lista[0])
//    println(lista.get(0))
//    println(lista.size)
//    println(lista.indexOf(6))
}