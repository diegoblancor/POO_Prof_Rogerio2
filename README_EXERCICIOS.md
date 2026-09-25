# POO Professor Rogério - Exercícios de Java

## 📚 Bem-vindo!

Este é um **projeto de estudo de Java para iniciantes**, baseado no material e estilo de código do **Professor Rogério**.

Todos os exercícios foram desenvolvidos usando **SOMENTE** os conceitos e técnicas mencionadas no material do professor, seguindo o padrão de codificação dele.

## 🎯 O Que Tem Aqui?

### 📝 32 Arquivos Java Organizados

```
✅ 25 Exercícios Temáticos (Conceitos Básicos)
   - 2 × Entrada e Saída
   - 4 × Estruturas Condicionais
   - 5 × Estruturas de Repetição
   - 5 × Vetores e Matrizes
   - 5 × Funções e Métodos

✅ 5 Exercícios da Lista 01 (Integrados)
   - Autenticação
   - Quadrantes
   - Soma de Vetor
   - Ordem Crescente
   - Cálculo de Estacionamento

✅ 2 Projetos Completos
   - Jogo da Velha (2 Jogadores)
   - Gerenciador de Jogos (CRUD)
```

## 🗂️ Estrutura do Projeto

```
POO_ProfRogerio/
│
├── README_EXERCICIOS.md      ← Você está aqui!
├── ESTRUCTURA.md             ← Guia de pastas e progressão
├── GUIA_RAPIDO.md           ← Referência rápida de Java
│
└── src/
    ├── conceitos_basicos/    ← Aprenda passo a passo
    │   ├── entrada_saida/
    │   ├── estruturas_condicionais/
    │   ├── estruturas_repeticao/
    │   ├── vetores_matrizes/
    │   └── funcoes_metodos/
    │
    ├── exercicios/           ← Exercícios da Lista 01
    │   └── lista_01/
    │
    └── projetos/             ← Projetos integrados
        ├── jogo_velha/
        └── gerenciador_jogos/
```

## 🚀 Como Usar

### Opção 1: VS Code (Recomendado) ⭐

1. **Abra a pasta** do projeto no VS Code
2. **Instale** "Extension Pack for Java" (Microsoft)
3. **Clique com botão direito** em qualquer arquivo `.java`
4. **Selecione "Run Java"** ou "Debug Java"

### Opção 2: Terminal

```bash
# Navegue até a pasta do projeto
cd C:\seu-caminho\POO_ProfRogerio

# Compile (exemplo)
javac src/conceitos_basicos/entrada_saida/Saudacao.java

# Execute
java -cp src conceitos_basicos.entrada_saida.Saudacao
```

## 📚 Progressão de Aprendizado

### 1️⃣ **Nível 1: Entrada e Saída** (30 min)
Arquivos: `Saudacao.java`, `SomaNumeros.java`
- Scanner para ler dados
- System.out.println para exibir

### 2️⃣ **Nível 2: Condicionais** (1-2 horas)
Arquivos: `MaiorNumero.java`, `VerificarIdade.java`, `VerificarQuadrante.java`, `MenuSwitch.java`
- if-else
- if-else if-else
- switch-case

### 3️⃣ **Nível 3: Repetição** (2-3 horas)
Arquivos: `Contagem.java`, `SomaSequencia.java`, `Tabuada.java`, `Autenticacao.java`, `MenuRepetido.java`
- for loops
- while loops
- do-while loops

### 4️⃣ **Nível 4: Vetores e Matrizes** (2-3 horas)
Arquivos: `SomaVetor.java`, `OrdenCrescente.java`, `MaiorMenor.java`, `LetraPosicao.java`, `Matriz.java`
- Arrays 1D (Vetores)
- Arrays 2D (Matrizes)
- Operações e buscas

### 5️⃣ **Nível 5: Funções e Métodos** (2-3 horas)
Arquivos: `CalculoDesconto.java`, `Tarifas.java`, `MediaNotas.java`, `Fatorial.java`, `ContarVogais.java`
- Criar métodos estáticos
- Parâmetros e retorno
- Reutilização de código

### 6️⃣ **Lista 01: Exercícios Integrados** (2-3 horas)
Arquivos: `Autenticacao.java`, `Quadrantes.java`, `SomaVetor.java`, `OrdenCrescente.java`, `CalculoEstacionamento.java`
- Combinam múltiplos conceitos
- Desafios maiores

### 7️⃣ **Projetos Completos** (3-4 horas cada)
- **Jogo da Velha**: Lógica de jogo, matrizes, validações
- **Gerenciador de Jogos**: CRUD básico, arrays, busca e manipulação

## 📖 Conceitos Cobertos

✅ **Entrada/Saída**
- Scanner (nextInt, nextDouble, nextLine)
- System.out.println, System.out.print

✅ **Tipos de Dados**
- int, double, String, char, boolean

✅ **Operadores**
- Aritméticos: +, -, *, /, %
- Comparação: >, <, >=, <=, ==, !=
- Lógicos: &&, ||, !

✅ **Estruturas Condicionais**
- if, if-else, if-else if-else
- switch-case, break, default

✅ **Loops**
- for (com incremento)
- while
- do-while
- break e continue

✅ **Arrays**
- Vetores (1D): declaração, acesso, iteração
- Matrizes (2D): declaração, acesso, iteração aninhada
- Array.length

✅ **Métodos**
- Declaração de método estático
- Parâmetros
- Retorno (return)
- Chamada de método

✅ **String**
- length()
- charAt()
- toUpperCase(), toLowerCase()
- contains()
- equals()

✅ **Math**
- Math.abs(), Math.ceil(), Math.floor()
- Math.max(), Math.min()

## 💡 Dicas de Estudo

1. **Comece do Nível 1** - Não pule nada
2. **Execute cada arquivo** - Ver funcionando ajuda a entender
3. **Modifique o código** - Experimente mudar valores e ver o resultado
4. **Teste edge cases** - O que acontece com números negativos? Vetores vazios?
5. **Combine conceitos** - Tente criar suas próprias versões dos exercícios
6. **Não memorize** - **Entenda por que** funciona assim

## 🎓 Próximos Passos

Quando terminar todos esses exercícios, estude:
1. **Programação Orientada a Objetos** - Classes e Objetos
2. **ArrayList** - Vetores dinâmicos
3. **Tratamento de Exceções** - try-catch-finally
4. **Leitura/Escrita de Arquivos** - FileReader, FileWriter
5. **Interfaces Gráficas** - Swing ou JavaFX

## 📌 Importante

### ✅ Sempre:
- Feche o Scanner com `entrada.close()`
- Teste seu código com valores diferentes
- Use nomes claros para variáveis
- Entenda cada linha do código

### ❌ Nunca:
- Copie código sem entender
- Deixe o Scanner aberto
- Use nomes genéricos como `a`, `b`, `x`, `y`
- Esqueça de validar entrada do usuário

## 🔗 Arquivos de Referência

- **ESTRUCTURA.md** - Mapa detalhado do projeto
- **GUIA_RAPIDO.md** - Referência rápida de sintaxe Java

## 📧 Dúvidas?

Se tiver dúvidas:
1. Releia o código comentado do Professor
2. Consulte o GUIA_RAPIDO.md
3. Compare com exemplos similares na pasta do conceito
4. Teste diferentes valores de entrada

---

## ✨ Bom Estudo!

**Lembre-se**: O objetivo é **entender**, não memorizar. 
Quanto mais você **praticar**, melhor ficará! 🚀

**Tempo total estimado**: 15-20 horas para completar tudo e entender bem.

---

*Exercícios baseados no material do Professor Rogério.*
*Código desenvolvido seguindo seu estilo e padrões de ensino.*
