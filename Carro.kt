class Carro {
    val marca = Renault
    val ano = 2017
    val modelo = Duster

    constructor(marca: String, ano: Int, modelo: String){
        this.marca = marca
        this.ano = ano
        this.modelo = modelo
    }
    fun medirCombustivel(){
        var combustivel: Float

        val gasolinamaxlitro = 10
        val gasolinaminlitro = 1

        if(combustivel == gasolinamaxlitro){
            println("Gasolina do $modelo está em $gasolinamaxlitro, tanque está cheio")
        }
        else if(combustivel <= gasolinaminlitro){
            println("O $modelo está com $gasolinaminlitro de gasolina, o tanque na reserva precisa abastecer!")
        }
    }
}