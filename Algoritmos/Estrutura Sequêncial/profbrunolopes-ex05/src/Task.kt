fun main() {

    /*
        Nesse trecho de código está sendo impresso no console (linha 08) uma mensagem solicitando a entrada de um número e, em seguida, realiza a leitura do número (linha 09), converte o número de string para inteiro e o armazena uma variável.
     */
    print("Digite o preço do produto: ")
    val preco = readLine()?.toDouble() ?: 0.0

    println("A média ponderada é ${calculaPreco(preco)}")

}

fun calculaPreco(preco: Double): Double {
    return preco * 0.9
}