fun main() {

    /*
        Nesse trecho de código está sendo impresso no console (linha 08) uma mensagem solicitando a entrada de um número e, em seguida, realiza a leitura do número (linha 09), converte o número de string para inteiro e o armazena uma variável.
     */
    print("Digite um tempo em segundos: ")
    val tempoSegundos = readLine()?.toInt() ?: 0

    println("O tempo de duração do evento será:  ${calculaTempo(tempoSegundos)}")

}

fun calculaTempo(tempoSegundos: Int): String {
    val tempoHoras = tempoSegundos / 3600;
    val restoTempo = tempoSegundos % 3600;
    val tempoMinutos = restoTempo / 60;
    val tempoSegundos = restoTempo % 60;

    val tempoHorasString = "${if (tempoHoras < 10) "0$tempoHoras" else tempoHoras }"
    val tempoMinutosString = "${if (tempoMinutos < 10) "0$tempoMinutos" else tempoMinutos }"
    val tempoSegundosString = "${if (tempoSegundos < 10) "0$tempoSegundos" else tempoSegundos }"

    return "$tempoHorasString:$tempoMinutosString:$tempoSegundosString";
}