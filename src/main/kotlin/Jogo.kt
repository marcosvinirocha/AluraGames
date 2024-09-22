package org.example



data class Jogo( var titulo: String, var capa: String) {

    var descricao: String = ""
    override fun toString(): String {
        return "Meu Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }


}