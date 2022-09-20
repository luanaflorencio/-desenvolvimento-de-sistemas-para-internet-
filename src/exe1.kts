//noinspection ALL
fun main() {
    var N1: Double = 2.0
    var N2: Double = 3.0
    var N3: Double = 4.0
    var N4: Double = 1.0
    var calculo: Double = (N1 + N2 + N3 + N4) / 4
    var NE: Double = 6.5

    println("Média: " + calculo)
    if(calculo >= 7.0){
        println("Aluno aprovado")
    }
    else if(calculo < 5.0){
        println("Aluno reprovado")
    }
    else if(calculo >= 5.0 && calculo <= 6.9){
        println("Aluno em exame")
        println("Nota do exame: $NE")
        var nfinal = (NE + calculo)/2
        if(nfinal >= 5.0){
            println("Aluno aprovado")
        }
        else if(nfinal <= 4.9){
            ("Aluno reprovado")
        }
        println("Média final: $nfinal")

    }

}