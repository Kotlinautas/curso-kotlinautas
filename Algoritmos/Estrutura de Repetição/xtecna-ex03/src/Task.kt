fun main() {

    /*
        Nesse trecho de código está sendo impresso no console (linha 08) uma mensagem
        solicitando a entrada de um número e, em seguida, realiza a leitura do número (linha 09),
        converte o número de string para inteiro e o armazena uma variável.
     */
    print("Digite o número: ")
    val a = readLine()?.toInt() ?: 0

    println("O número invertido é ${reverse(a)}")

}

fun reverse(a: Int): Int {
    var number = a
    var b = 0

    while (number > 0) {
        b *= 10
        b += number % 10
        number /= 10
    }

    return b
}