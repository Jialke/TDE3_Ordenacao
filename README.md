<h2>Teste de algoritmos de ordenação</h2>
<p>Esse trabalho tem o intuito de implementar 6 algoritmos de ordenação - BubbleSort, SelectionSort, CocktailSort, CombSort, GnomeSort e BucketSort - e testar a quantia de iterações e trocas de elementos feitas por cada um deles, afim de analisar o desempenho destes.</p>
<p>Para os testes foram usados 3 vetores de inteiros de 20 posições, em que o primeiro trata de um dados desordenados, o segundo, de dados já ordenados e o terceiro, de dados em ordem decrescente.</p>

<h3>Vetor 1</h3>
<p>Vetor usado para os testes: {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28}</p>

<table style=width:100%;>
  <thead>
    <tr>
      <th>Algoritmo</th>
      <th>Iterações</th>
      <th>Trocas</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>BubbleSort</th>
      <th>210</th>
      <th>78</th>
    </tr>
    <tr>
      <th>BubbleSort com flag de parada</th>
      <th>195</th>
      <th>78</th>
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
      <th>GnomeSort</th>
      <th>176</th>
      <th>78</th>
    </tr>
    <tr>
      <th>BucketSort</th>
      <th>116</th>
      <th>52</th>
    </tr>
  </tbody>
</table>

<p>Como podemos ver, em termos de iteração, o BucketSort foi quem melhor realizou a tarefa, terminando a ordenação em 116 iterações. Em termos de trocas, porém, o SelectionSort foi o melhor, terminando a ordenação com apenas 18 trocas.</p>
