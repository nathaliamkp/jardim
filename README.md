# O projeto:
Esse projeto se refere  ao desenvolvimento do seguinte desafio:

 Uma certa pessoa mora numa casa que tem um jardim e ela quer manter a contagem atualizada do número de árvores plantadas naquele jardim. 

Testes:
Descreva quais classes, atributos e métodos você criaria para realizar a modelagem deste problema
Escreva um programa que modele esse problema utilizando o paradigma orientado a objetos e Java como linguagem. 

O funcionamento do programa deve ser demonstrado via método main. É esperado uma sequência de chamadas que demonstra algumas árvores sendo adicionadas no jardim e que no final exiba o número total de plantações.

Para realizar o desafio foi pensado em um programa que o usuário insere os dados iniciais do seu jardim, as dimensões e quantas árvores esse jardim já possui, caso já possua alguma. O sistema calcula quanto de espaço o usuário possui isponível em seu jardim, quantas árvores ele possui e trás uma lista das especies que o jardim possui. 

## Classes:
O programa possui as seguintes classes: 

 - Arvore
Essa classe possui dois atributos , String especie e int ocupacao, e dois métodos, o construtor e o getOcupacao.
 - Espaco
 Essa classe possui um atributo, int dimensãom2, e possui dois métodos, um construtor, getDimensaom2, setDimensaom2 e diminuirEspaco
-  Jardim
Essa classe possui três atributos, List<Arvore> arvores, Espaco espacoTotal e Espaco espacoDisponível. Além dos stributos possui os seguintes métodos: O metodo construtor, criarListaDeArvores, escolherArvoreParaOJardim, plantarArvoreNoJardim, jardimStatus, contarArvoresNoJardim, contarEspacoDisponivel e listarEspecies.
-  Verificacao
Essa classe não possui atributos e possui os seguintes métodos: verificarDados, verificarConfirmacao, tratamentoDeString e compararString. 
-  Main
Essa classe não possui nenhum atributo, só o método main que inicia o programa, chamando os métodos das outras classes.


