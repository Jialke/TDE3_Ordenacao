public class Ordenacao {

    static void bubbleSort(int tamanho, int[] vetor) {
        int temp = 0;
        int iteracoes = 0;
        int trocas = 0;

        for (int i = 0; i < tamanho; i++) {
            iteracoes++;

            for (int j = 1; j < tamanho - i; j++) {
                iteracoes++;
                if (vetor[j-1] > vetor[j]) {
                    // trocar elementos
                    trocas++;

                    temp = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        System.out.println("Iterações: " + iteracoes);
        System.out.println("Trocas: " + trocas);
    }

    static void bubbleSortOtimizado(int tamanho, int[] vetor) {
        int temp = 0;
        int iteracoes = 0;
        int trocas = 0;

        boolean trocou;

        for (int i = 0; i < tamanho; i++) {
            iteracoes++;
            trocou = false;

            for (int j = 1; j < tamanho - i; j++) {
                iteracoes++;
                if (vetor[j-1] > vetor[j]) {
                    // trocar elementos
                    trocas++;

                    temp = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;

                    trocou = true;
                }
            }
            // se n tiver trocado, esta ordenado
            if (!trocou) {
                break;
            }
        }

        System.out.println("Iterações: " + iteracoes);
        System.out.println("Trocas: " + trocas);
    }

    static void selectionSort(int tamanho, int[] vetor) {
        int trocas = 0;
        int iteracoes = 0;

        for (int i = 0; i < tamanho; i++) {
            iteracoes++;

            int minIndex = i;
            for (int j = i+1; j < tamanho; j++) {
                iteracoes++;

                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                // troca elemento
                trocas++;

                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
            }
        }

        System.out.println("Iterações: " + iteracoes);
        System.out.println("Trocas: " + trocas);
    }

    static void cocktailSort(int tamanho, int[] vetor) {
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;

        int iteracoes = 0;
        int trocas = 0;

        while (trocou) {
            trocou=false;

            // passagem da esquerda pra direita

            for (int i = inicio; i < fim; i++) {
                iteracoes++;

                if (vetor[i] > vetor[i+1]) {
                    // troca
                    trocas++;

                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;

                    trocou = true;
                }
            }

            if (!trocou) {
                break; // vetor ordenado
            }

            trocou = false;
            fim--; // ultimo elemento ja esta na posição correta

            // passagem da direita para a esquerda
            for (int i = fim; i > inicio; i--) {
                iteracoes++;

                if (vetor[i] < vetor[i - 1]) {
                    // troca
                    trocas++;

                    temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;

                    trocou = true;
                }
            }

            inicio++; // primeiro elemento ja esta na posição correta

        }

        System.out.println("Iterações: " + iteracoes);
        System.out.println("Trocas: " + trocas);
    }

    static void combSort(int tamanho, int[] vetor) {
        int intervalo = tamanho;
        boolean trocou = true;

        int iteracoes = 0;
        int trocas = 0;

        while (intervalo > 1 || trocou) {

            intervalo = (int) (intervalo / 1.3);
            if (intervalo < 1) intervalo = 1;

            trocou = false;

            for (int i = 0; i < tamanho - intervalo; i++) {
                iteracoes++;

                if (vetor[i] > vetor[i + intervalo]) {
                    // troca
                    trocas++;

                    int temp = vetor[i + intervalo];
                    vetor[i + intervalo] = vetor[i];
                    vetor[i] = temp;

                    trocou = true;
                }
            }
        }

        System.out.println("Iterações: " + iteracoes);
        System.out.println("Trocas: " + trocas);

    }

    static void gnomeSort(int tamanho, int[] vetor) {
        int posicao = 0;

        int trocas = 0;
        int iteracoes = 0;

        while (posicao < tamanho) {
            iteracoes++;

            if(posicao == 0 || vetor[posicao] >= vetor[posicao - 1]) {
                posicao++;
            }
            else {
                // troca
                trocas++;

                int temp = vetor[posicao];
                vetor[posicao] = vetor[posicao - 1];
                vetor[posicao - 1] = temp;

                posicao--;
            }
        }

        System.out.println("Iterações: " + iteracoes);
        System.out.println("Trocas: " + trocas);
    }

    static void bucketSort(int tamanho, int[] vetor) {
        int[] trocasIteracoes = new int[2]; // [0] = iteracoes, [1] = trocas
        bucketSortRecursivo(tamanho, vetor, tamanho, trocasIteracoes);
        System.out.println("Iterações: " + trocasIteracoes[0]);
        System.out.println("Trocas: " + trocasIteracoes[1]);
    }

    static void bucketSortRecursivo(int tamanho, int[] vetor, int numeroBaldes, int[] trocasIteracoes) {
        // calcular maximo e minimo
        int maximo = vetor[0];
        int minimo = vetor[0];
        for (int i = 0; i < tamanho; i++) {
            trocasIteracoes[0]++;

            if (vetor[i] > maximo) maximo = vetor[i];
            if (vetor[i] < minimo) minimo = vetor[i];
        }

        // criar baldes
        int[][] baldes = new int[numeroBaldes][tamanho];
        int[] tamanhoBaldes = new int[numeroBaldes];

        double div = (double) (maximo - minimo + 1) / numeroBaldes;

        for (int i = 0; i < tamanho; i++) {
            trocasIteracoes[0]++;

            int indiceBalde = (int) ((vetor[i] - minimo) / div);
            if (indiceBalde >= numeroBaldes) indiceBalde = numeroBaldes - 1;

            baldes[indiceBalde][tamanhoBaldes[indiceBalde]++] = vetor[i];
            trocasIteracoes[1]++;
        }

        // Ordenar cada balde distribuindo em sub-baldes
        int posicao = 0;
        for (int i = 0; i < numeroBaldes; i++) {
            trocasIteracoes[0]++;

            if (tamanhoBaldes[i] > 1) {
                // Recursão apenas se o balde tiver mais de 1 elemento
                int[] subBalde = new int[tamanhoBaldes[i]];
                for (int j = 0; j < tamanhoBaldes[i]; j++) {
                    trocasIteracoes[0]++;

                    subBalde[j] = baldes[i][j];

                    trocasIteracoes[1]++;
                }
                bucketSortRecursivo(tamanhoBaldes[i], subBalde, numeroBaldes, trocasIteracoes);
                // Copiar de volta
                for (int j = 0; j < tamanhoBaldes[i]; j++) {
                    trocasIteracoes[0]++;

                    vetor[posicao++] = subBalde[j];

                    trocasIteracoes[1]++;
                }
            } else if (tamanhoBaldes[i] == 1) {
                // Apenas copiar se tiver 1 elemento
                vetor[posicao++] = baldes[i][0];
                trocasIteracoes[1]++;
            }
        }
    }

    static void imprimirVetor(int tamanho, int[] vetor) {
        System.out.print("Vetor: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // vetores
        int[] vetor1_1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_2 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_3 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_4 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_5 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_6 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_7 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

        int[] vetor2_1 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_3 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_4 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_5 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_6 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_7 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

        int[] vetor3_1 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_2 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_4 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_5 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_6 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_7 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};


        System.out.println("-------------------------------------------------------------------");
        System.out.println("TESTES DE ALGORITMOS DE ORDENAÇÃO: TROCAS E ITERAÇÕES");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Vetor 1: Não ordenado");
        imprimirVetor(20, vetor1_1);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("BubbleSort:");
        bubbleSort(20, vetor1_1);
        imprimirVetor(20, vetor1_1);

        System.out.println("\nBubbleSort Otimizado:");
        bubbleSortOtimizado(20, vetor1_2);
        imprimirVetor(20, vetor1_2);

        System.out.println("\nSelectionSort:");
        selectionSort(20, vetor1_3);
        imprimirVetor(20, vetor1_3);

        System.out.println("\nCocktailSort: ");
        cocktailSort(20, vetor1_4);
        imprimirVetor(20, vetor1_4);

        System.out.println("\nCombSort:");
        combSort(20, vetor1_5);
        imprimirVetor(20, vetor1_5);

        System.out.println("\nGnomeSort:");
        gnomeSort(20, vetor1_6);
        imprimirVetor(20, vetor1_6);

        System.out.println("\nBucketSort:");
        bucketSort(20, vetor1_7);
        imprimirVetor(20, vetor1_7);

        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("Vetor 2: Já ordenado");
        imprimirVetor(20, vetor2_1);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("BubbleSort:");
        bubbleSort(20, vetor2_1);
        imprimirVetor(20, vetor2_1);

        System.out.println("\nBubbleSort Otimizado:");
        bubbleSortOtimizado(20, vetor2_2);
        imprimirVetor(20, vetor2_2);

        System.out.println("\nSelectionSort:");
        selectionSort(20, vetor2_3);
        imprimirVetor(20, vetor2_3);

        System.out.println("\nCocktailSort: ");
        cocktailSort(20, vetor2_4);
        imprimirVetor(20, vetor2_4);

        System.out.println("\nCombSort:");
        combSort(20, vetor2_5);
        imprimirVetor(20, vetor2_5);

        System.out.println("\nGnomeSort:");
        gnomeSort(20, vetor2_6);
        imprimirVetor(20, vetor2_6);

        System.out.println("\nBucketSort:");
        bucketSort(20, vetor2_7);
        imprimirVetor(20, vetor2_7);

        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("Vetor 3: Ordenado de forma decrescente");
        imprimirVetor(20, vetor3_1);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("BubbleSort:");
        bubbleSort(20, vetor3_1);
        imprimirVetor(20, vetor3_1);

        System.out.println("\nBubbleSort Otimizado:");
        bubbleSortOtimizado(20, vetor3_2);
        imprimirVetor(20, vetor3_2);

        System.out.println("\nSelectionSort:");
        selectionSort(20, vetor3_3);
        imprimirVetor(20, vetor3_3);

        System.out.println("\nCocktailSort: ");
        cocktailSort(20, vetor3_4);
        imprimirVetor(20, vetor3_4);

        System.out.println("\nCombSort:");
        combSort(20, vetor3_5);
        imprimirVetor(20, vetor3_5);

        System.out.println("\nGnomeSort:");
        gnomeSort(20, vetor3_6);
        imprimirVetor(20, vetor3_6);

        System.out.println("\nBucketSort:");
        bucketSort(20, vetor3_7);
        imprimirVetor(20, vetor3_7);

    }
}
