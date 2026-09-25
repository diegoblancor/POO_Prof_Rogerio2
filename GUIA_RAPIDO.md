# 📖 Guia Rápido de Java para Iniciantes

## 🏗️ Estrutura Básica de um Programa

```java
public class NomeClasse {
    public static void main(String[] args) {
        // Código aqui
    }
}
```

## 📊 Tipos de Dados Principais

| Tipo | Exemplo | Uso |
|------|---------|-----|
| `int` | `int numero = 10;` | Números inteiros |
| `double` | `double preco = 19.90;` | Números com decimais |
| `String` | `String nome = "João";` | Texto |
| `char` | `char letra = 'A';` | Um caractere |
| `boolean` | `boolean ativo = true;` | Verdadeiro ou falso |

## ⌨️ Entrada de Dados com Scanner

```java
import java.util.Scanner;

Scanner entrada = new Scanner(System.in);

int numero = entrada.nextInt();        // Ler número inteiro
double decimal = entrada.nextDouble(); // Ler número com decimais
String texto = entrada.nextLine();     // Ler linha de texto

entrada.close(); // SEMPRE fechar!
```

## 🖨️ Saída com System.out

```java
System.out.println("Olá!");            // Com quebra de linha
System.out.print("Ola!");              // Sem quebra de linha

// Concatenar (juntar) strings
System.out.println("Resultado: " + numero);

// Múltiplas concatenações
System.out.println("A: " + valor1 + ", B: " + valor2);
```

## ➕ Operadores

### Aritméticos
```java
int soma = 5 + 3;      // 8
int diferenca = 5 - 3; // 2
int produto = 5 * 3;   // 15
int quociente = 15 / 3; // 5
int resto = 15 % 4;    // 3 (módulo/resto)
```

### Comparação
```java
5 > 3      // true (maior)
5 < 3      // false (menor)
5 >= 5     // true (maior ou igual)
5 <= 5     // true (menor ou igual)
5 == 5     // true (igual)
5 != 3     // true (diferente)
```

### Lógicos
```java
true && true   // true (E)
true || false  // true (OU)
!true          // false (NÃO)
```

## 🔀 Estruturas Condicionais

### IF simples
```java
if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

### IF-ELSE
```java
if (numero > 0) {
    System.out.println("Positivo");
} else {
    System.out.println("Não positivo");
}
```

### IF-ELSE IF-ELSE
```java
if (nota >= 9) {
    System.out.println("A");
} else if (nota >= 8) {
    System.out.println("B");
} else if (nota >= 7) {
    System.out.println("C");
} else {
    System.out.println("D");
}
```

### SWITCH
```java
switch (opcao) {
    case 1:
        System.out.println("Opção 1");
        break;
    case 2:
        System.out.println("Opção 2");
        break;
    default:
        System.out.println("Inválido!");
}
```

## 🔁 Estruturas de Repetição

### FOR (quando sabe quantas vezes)
```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

### WHILE (enquanto uma condição é verdadeira)
```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}
```

### DO-WHILE (executa ao menos uma vez)
```java
int opcao;
do {
    System.out.println("Menu");
    opcao = entrada.nextInt();
} while (opcao != 0);
```

## 📦 Vetores (Arrays)

### Declarar e Usar
```java
// Criar um vetor com 5 elementos
int[] numeros = new int[5];

// Colocar valor em uma posição
numeros[0] = 10;
numeros[1] = 20;

// Acessar um valor
System.out.println(numeros[0]); // 10

// Percorrer o vetor
for (int i = 0; i < 5; i++) {
    System.out.println(numeros[i]);
}

// Ou com FOR enhanced
for (int numero : numeros) {
    System.out.println(numero);
}

// Tamanho do vetor
int tamanho = numeros.length;
```

### Matriz (Array 2D)
```java
// Criar uma matriz 3x3
int[][] matriz = new int[3][3];

// Colocar valor
matriz[0][0] = 5;

// Acessar
System.out.println(matriz[0][0]);

// Percorrer
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.println(matriz[i][j]);
    }
}
```

## 🔧 Métodos (Funções)

### Método simples
```java
public static void saudacao() {
    System.out.println("Olá!");
}

// Usar:
saudacao();
```

### Método com parâmetros
```java
public static void saudacao(String nome) {
    System.out.println("Olá " + nome);
}

// Usar:
saudacao("João");
```

### Método com retorno
```java
public static int somar(int a, int b) {
    return a + b;
}

// Usar:
int resultado = somar(5, 3); // resultado = 8
```

### Método com parâmetros e retorno
```java
public static double calcularMedia(double nota1, double nota2) {
    return (nota1 + nota2) / 2;
}

// Usar:
double media = calcularMedia(8.5, 9.0);
```

## 🧵 String (Texto)

```java
String texto = "Olá Mundo";

// Tamanho
int tamanho = texto.length();  // 10

// Caractere na posição
char letra = texto.charAt(0);  // 'O'

// Converter para maiúscula
String maiuscula = texto.toUpperCase(); // "OLÁ MUNDO"

// Converter para minúscula
String minuscula = texto.toLowerCase(); // "olá mundo"

// Procurar substring
boolean contem = texto.contains("Mundo"); // true

// Comparar strings
boolean igual = texto.equals("Olá Mundo"); // true
```

## 🔢 Math (Operações Matemáticas)

```java
Math.abs(-5);       // 5 (valor absoluto)
Math.ceil(4.2);     // 5 (arredondar para cima)
Math.floor(4.8);    // 4 (arredondar para baixo)
Math.round(4.5);    // 5 (arredondar)
Math.max(5, 3);     // 5 (máximo)
Math.min(5, 3);     // 3 (mínimo)
Math.pow(2, 3);     // 8 (2 elevado a 3)
Math.sqrt(9);       // 3 (raiz quadrada)
```

## ❌ Erros Comuns

| Erro | Solução |
|------|---------|
| Sem ponto-vírgula no final | Adicione `;` |
| Nome da classe incorreto | Arquivo deve ser `Classe.java` |
| Scanner não fechado | Use `entrada.close();` |
| Índice fora do vetor | Vetor de tamanho 5 tem índices 0-4 |
| `NullPointerException` | Inicialize a variável antes de usar |
| Variável não declarada | Declare: `int numero;` |

## 💡 Exemplo Completo

```java
import java.util.Scanner;

public class Calculadora {
    
    public static double somar(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();
        
        double resultado = somar(numero1, numero2);
        
        System.out.println("Resultado: " + resultado);
        
        entrada.close();
    }
}
```

---

**Dúvidas? Consulte o arquivo ESTRUCTURA.md ou procure pela pasta do conceito!** 🎯
