package fundamentos

class MinhaClasse (
    var nome: String,
    var endereco: String,
    var idade: Int)
    {
        // o companion object funciona como se fosse uma classe estática no java, criar builders
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Gustavo", "Rua Teste", 25)
        }
    }
}

class SegundaClasse (
    var nome: String,
    var endereco: String,
    var idade: Int)
    {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Gustavo", "Rua Teste", 25)
    }

}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 10).criarComValoresPadrao()
    var minhaClasse = MinhaClasse.criarComValoresPadrao()
}