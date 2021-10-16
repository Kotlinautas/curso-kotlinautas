# O que é algoritmo?

## Objetivos de aprendizagem
Ao final deste curso, você deve ser capaz de:
  * Explicar o conceito de algoritmo;
  * Distinguir linguagens de programação de algoritmos; 
  * Discutir o uso de algoritmos na resolução de problemas computacionais;


## Introdução
Inicialmente iremos tratar sobre a definição de algoritmos, de linguagens de programação e a relação existente entre ambas.

Ao longo deste curso será utilizada a linguagem de programação **Kotlin** para representarmos os algoritmos aqui apresentados de forma a serem executados por um computador.


## O que é um Algoritmo?
O entendimento do conceito de _algoritmo_ é fundamental importância para a programação de computadores, assim nós devemos começar com uma análise cuidadosa desse conceito.

O significado moderno da palavra algoritmo é bastante similar ao de uma _receita_, _processo_, _método_, _técnica_, _procedimento_, _rotina_ exceto pelo fato da palavra "algoritmo" conota algo um pouco diferente (KNUTH, 1997).

Ascencio (2012) define algoritmo como uma _descrição de uma sequência de passos que deve ser seguida para realização de uma tarefa_. Cormen (2014) já apresenta um conceito mais abrangente, sendo _um conjunto de etapas para executar uma tarefa_. Junior et. al. (2019) apresenta o conceito de algoritmos como _um conjunto de passos que resolve um determinado problema_.

Além de ser meramente um conjunto finito de regras que fornece uma sequência de operações para resolver um tipo específico de problema, Knuth (1997) atesta que um algoritmo possui cinco características importantes:

1. **Finitude**: um algoritmo deve sempre terminar após um número **finito** de passos.

2. **Definição**: cada passo de um algoritmo deve ser **precisamente definido**, ou seja, a ação a ser realizada deve ser rigorosa e inequivocamente especificada para cada caso.

3. **Entrada**: um algoritmo possui **zero ou mais entradas** como, por exemplo, quantidades que são dadas a ele inicialmente antes do algoritmo começar ou dinâmicamente quando um algoritmo está em execução.

4. **Saída**: um algoritmo possui **uma ou mais saídas**, sendo quantidades que possui em alguma relação com as entradas.

5. **Eficácia**: geralmente espera-se que um algoritmo seja eficaz, no sentido de que as suas operações devem ser todas suficientemente básicas para que possam, em princípio, ser feitas de maneira exata e num período finito por alguém usando lápis e papel.

Pode-se perceber que executamos cotidianamente algoritmos para, por exemplo, escovar os dentes, para pegar um ônibus ou metrô, ir trabalhar e assim pro diante (CORMEN, 2014).

Contudo, ao longo deste curso serão projetados algoritmos que serão executados por um computador ou, de modo mais geral, dispositivos de computação. 

O que distingue um algoritmo executado num computador de um algoritmo que um humano executa? Um humano pode tolerar quando um algoritmo não é bem descrito com precisão, mas um computador não pode (CORMEN, 2014).

Tomemos, como exemplo, uma situação onde quer-se viajar de carro a trabalho e, durante a viagem, utilizar um aparelho GPS de forma a auxiliar em alcançar o destino. O algoritmo de ir de carro para o trabalho poderia dizer "se o **tráfego estiver ruim**, pegue uma rota alternativa". Embora um humano saiba o que quer dizer "**tráfego ruim**", um computador não sabe.

Portanto, um algoritmo de computador é um conjunto de etapas para executar uma tarefa descrita com precisão suficiente para que um computador possa executar (CORMEN, 2014).
 
### Kotlin

Kotlin é uma linguagem de programação de propósito geral voltava para a Java Virtual Machine (JVM) apresentada publicamente em 2011 pela JetBrains. Uma das premissas iniciais do Kotlin era de corrigir alguns dos problemas que desenvolvedores enfrentam no Java, onde os recursos da linguagem visam simplificar o processo de desenvolvimento de aplicações complexas ao mesmo tempo que coloca mais poder em cada linha de código escrita (KRILL, 2011).

Segundo Jeremov e Isakova (2017) o Kotlin é uma linguagem de programação concisa, segura, pragmática e focada na interoperabilidade com código Java. O Kotlin pode ser utilizado em quase qualquer ambiente onde emprega-se Java.

Por conta da interoperabilidade do Kotlin com o Java, pode-se utilizar a miríade de bibliotecas e frameworks Java disponíveis em projetos com Kotlin, executando com o quase o mesmo nível de desempenho obtido com Java (JEREMOV;ISAKOVA, 2017).

A versão Kotlin 1.0 foi lançada em 2016 com foco para JVM e Android, combinando a Orientação a Objetos com recursos do paradigma funcional (BRESLAV, 2016). Nessa versão já era possível fazer um mix de código Java com código Kotlin dentro do mesmo projeto, permitindo uma transição gradual entre código Java para código Kotlin.

Em 2017 durante o Google I/O, conferência anual organizada pela Google que tem como um de seus objetivos anunciar novos produtos e versões do sistema operacional Android, foi anunciado o suporte oficial do Kotlin no desenvolvimento de aplicações Android (SHAFIROV, 2017).

Desde então o Kotlin vem sendo largamente utilizada no desenvolvimento Android ou para a própria JVM, conforme relatório apresentado pela própria JetBrains (JETBRAINS, 2020).


## Referências

ASCENCIO, A. F. G; CAMPOS, E. A. V. **Fundamentos da Programação de Computadores**: Algoritmos, Pascal, C/C++ (Padrão ANSI) e Java, 3. ed., São Paulo, 2012, ISBN: 9788564574168

CORMEN, T. **Desmistificando Algoritmos**, 1. ed., Rio de Janeiro, Elsevier, 2014, ISBN: 9788535271775

KNUTH, D. E. **The Art of Computer Programming**: fundamental Algorithms, 3. ed., Addison Wesley Logman, 1997, ISBN: 0201896834

JUNIOR, D. P. et al. **Algoritmos e Programação de Computadores**, 2. ed., Rio de Janeiro, Elsevier, 2019, ISBN: 9788595150508