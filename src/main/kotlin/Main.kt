fun main(args: Array<String>) {
    print("Digite a nota do 1º bimestre: ")
    var notaUm = readLine()!!.toDouble()
    print("Digite a nota do 2º bimestre: ")
    var notaDois = readLine()!!.toDouble()
    print("Digite a nota do 3º bimestre: ")
    var notatTrês = readLine()!!.toDouble()
    print("Digite a nota do 4º bimestre: ")
    var notaQuatro = readLine()!!.toDouble()

    var media = (notaUm + notaDois + notatTrês + notaQuatro) / 4
    println("\nMédia: $media")

    if(media <= 4.0) {
        println("Reprovado")
    }else if(media > 4.0 && media <= 5.0){
        println("Regular")
    }else if(media > 5.0 && media <= 8.0){
        println("Boa")
    }else if(media > 8.0 && media <= 10.0) {
        println("Excelente")
    }else{
        println("Média Inválida")

    }

}
