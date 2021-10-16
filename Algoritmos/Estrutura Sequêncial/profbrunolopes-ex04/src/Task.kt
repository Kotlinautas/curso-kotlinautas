fun main() {

    /*
        Nesse trecho de código está sendo impresso no console (linha 08) uma mensagem solicitando a entrada de um número e, em seguida, realiza a leitura do número (linha 09), converte o número de string para inteiro e o armazena uma variável.
     */
    print("Digite a primeira nota: ")
    val a = readLine()?.toDouble() ?: 0.0

    print("Digite a segunda nota: ")
    val b = readLine()?.toDouble() ?: 0.0

    println("A média ponderada é ${mediaPonderada(a, b)}")

}

fun mediaPonderada(a: Double, b: Double): Double {
    return (2 * a + 3 * b) / 5
}