fun main() {

    /*
        Nesse trecho de código está sendo impresso no console (linha 08) uma mensagem
        solicitando a entrada de diversos números inteiros separados por vírgula e,
        em seguida, converte tais números de string para inteiro e os armazena em uma lista.
     */
    print("Digite números inteiros separados por vírgula: ")
    val numbers = readLine()?.split(',')?.map{ it.toInt() } ?: emptyList()

    println("O número de inteiros positivos digitados é ${positives(numbers)}")

}

fun positives(numbers: List<Int>): Int {
    var answer = 0

    for (number in numbers) {
        if (number > 0) answer += 1
    }

    return answer
}