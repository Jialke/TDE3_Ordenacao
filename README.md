<h1>Teste de algoritmos de ordenação</h1>
<p>Esse trabalho tem o intuito de implementar 6 algoritmos de ordenação - BubbleSort, SelectionSort, CocktailSort, CombSort, GnomeSort e BucketSort - e testar a quantia de iterações e trocas de elementos feitas por cada um deles, afim de analisar o desempenho destes.</p>
<p>Para os testes foram usados 3 vetores de inteiros de 20 posições, em que o primeiro trata de um dados desordenados, o segundo, de dados já ordenados e o terceiro, de dados em ordem decrescente.</p>

<h2>Cenário 1: Vetor desordenado</h2>
<p>Vetor usado para os testes: {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28}</p>

<div align="center">
  <table>
  <thead>
    <tr>
      <th>Algoritmo</th>
      <th>Iterações</th>
      <th>Trocas</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>BubbleSort</td>
      <td>210</td>
      <td>78</td>
    </tr>
    <tr>
      <td>BubbleSort com flag de parada</td>
      <td>195</td>
      <td>78</td>
    </tr>
    <tr>
      <th>SelectionSort</th>
      <th>210</th>
      <th>18</th>
    </tr>
    <tr>
      <th>CocktailSort</th>
      <th>154</th>
      <th>78</th>
    </tr>
    <tr>
      <th>CombSort</th>
      <th>129</th>
      <th>22</th>
    </tr>
    <tr>
      <td>GnomeSort</td>
      <td>176</td>
      <td>78</td>
    </tr>
    <tr>
      <th>BucketSort</th>
      <th>116</th>
      <th>52</th>
    </tr>
  </tbody>
</table>
</div>

<p>Como podemos ver, em termos de iteração, o BucketSort foi quem melhor realizou a tarefa, terminando a ordenação em 116 iterações, seguido do CombSort, com 129 iterações, e do CocktailSort, com 154 iterações. Em termos de trocas, porém, o SelectionSort foi o melhor, terminando a ordenação com apenas 18 trocas, seguido do CombSort, com 22 trocas, e do BucketSort, com 52 trocas.</p>

<h2>Cenário 2: Vetor ordenado</h2>
<p>Vetor usado para os testes: {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32}</p>

<div align="center">
  <table>
  <thead>
    <tr>
      <th>Algoritmo</th>
      <th>Iterações</th>
      <th>Trocas</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>BubbleSort</td>
      <td>210</td>
      <td>0</td>
    </tr>
    <tr>
      <th>BubbleSort com flag de parada</th>
      <th>20</th>
      <th>0</th>
    </tr>
    <tr>
      <td>SelectionSort</td>
      <td>210</td>
      <td>0</td>
    </tr>
    <tr>
      <th>CocktailSort</th>
      <th>19</th>
      <th>0</th>
    </tr>
    <tr>
      <td>CombSort</td>
      <td>110</td>
      <td>0</td>
    </tr>
    <tr>
      <th>GnomeSort</th>
      <th>20</th>
      <th>0</th>
    </tr>
    <tr>
      <td>BucketSort</td>
      <td>116</td>
      <td>52</td>
    </tr>
  </tbody>
</table>
</div>

<p>Como podemos ver, em termos de iteração, o CocktailSort foi quem melhor realizou a tarefa, terminando de executar em 19 iterações, seguido do BubbleSort com flag de parada e do GnomeSort, ambos terminando em 20 iterações. Em termos de trocas, a maioria não realizou nenhuma troca, visto que o vetor já esta ordenado, o destaque vai para o BucketSort, que realiza trocas mesmo já estando ordenado.</p>

<h2>Cenário 3: Vetor decrescente</h2>
<p>Vetor usado para os testes: {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32}</p>

<div align="center">
  <table>
  <thead>
    <tr>
      <th>Algoritmo</th>
      <th>Iterações</th>
      <th>Trocas</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>BubbleSort</td>
      <td>210</td>
      <td>190</td>
    </tr>
    <tr>
      <td>BubbleSort com flag de parada</td>
      <td>210</td>
      <td>190</td>
    </tr>
    <tr>
      <th>SelectionSort</th>
      <th>210</th>
      <th>10</th>
    </tr>
    <tr>
      <td>CocktailSort</td>
      <td>190</td>
      <td>190</td>
    </tr>
    <tr>
      <th>CombSort</th>
      <th>129</th>
      <th>18</th>
    </tr>
    <tr>
      <td>GnomeSort</td>
      <td>400</td>
      <td>190</td>
    </tr>
    <tr>
      <th>BucketSort</th>
      <th>140</th>
      <th>70</th>
    </tr>
  </tbody>
</table>
</div>

<p>Como podemos ver, em termos de iteração, o CombSort foi quem melhor realizou a tarefa, terminando de executar em 129 iterações, seguido do BucketSort, com 140 iterações. Em termos de trocas, o SelectionSort foi o melhor, realizando apenas 10 trocas, metade do número de elementos no vetor, seguido do CombSort, com 18 trocas.</p>

<h2>Conclusão</h2>
<p>Após a execução deste trabalho, podemos identificar o comportamento dos métodos de ordenação nos 3 diferentes cenários, mostrando que cada um destes possuem seus pontos fortes e fracos que devem ser levados em consideração antes de implementações em projetos reais.</p>
