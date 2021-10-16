fun main() {

    /*
        Nesse trecho de código está sendo impresso no console (linha 08) uma mensagem solicitando a entrada de um número e, em seguida, realiza a leitura do número (linha 09), converte o número de string para inteiro e o armazena uma variável.
     */
    print("Digite o primeiro número: ")
    val a = readLine()?.toInt() ?: 0

    print("Digite o segundo número: ")
    val b = readLine()?.toInt() ?: 0

    println("A divisão dos números é ${div(a, b)}")

}

fun div(a: Int, b: Int): Int {
    return a / b
}