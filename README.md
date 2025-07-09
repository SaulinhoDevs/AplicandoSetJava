# 📚 Sistema de Contagem de Alunos Distintos por Instrutor

Este projeto simula um cenário comum em plataformas de ensino online, onde um instrutor pode ter vários cursos e um mesmo aluno pode estar matriculado em mais de um deles.

## 💡 Objetivo

Calcular corretamente a **quantidade total de alunos distintos** de um professor, considerando que:

- Um mesmo aluno pode estar matriculado em vários cursos.
- Os alunos são identificados por um **código único (ID)**.
- O número total de alunos do professor **não deve contar duplicados**.

## 📦 Estrutura do Projeto

O projeto está dividido em pacotes e classes para seguir princípios básicos de programação orientada a objetos:

📦 entities
┣ 📄 Usuario.java
┣ 📄 Aluno.java
┣ 📄 Professor.java
┣ 📄 Curso.java
📄 Main.java

- `Usuario`: Classe abstrata com atributos comuns (ID e nome).
- `Aluno`: Herda de `Usuario` e representa os estudantes.
- `Professor`: Herda de `Usuario`, armazena e calcula os dados de seus cursos.
- `Curso`: Armazena os alunos matriculados e tem um nome identificador.
- `Main`: Classe principal onde ocorre a interação com o usuário (leitura dos dados e execução da lógica).

## ⚙️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/SaulinhoDevs/AplicandoSetJava.git
cd AplicandoSetJava
```

2. Compile e execute com sua IDE (como IntelliJ ou VS Code com extensão Java) ou via terminal:

```bash
javac Main.java entities/*.java
java Main
```

3. Siga as instruções no console para informar a quantidade de alunos em cada curso e seus respectivos códigos.

## 🧠 Conceitos Aplicados
* Set (HashSet) para evitar alunos duplicados.
* Sobrescrita de equals() e hashCode() para garantir unicidade por id.
* Herança e reutilização de código com Usuario abstrato.
* Stream API para contagem eficiente de alunos distintos.
* Validação de entrada com Scanner e tratamento de exceções.

## 🖼️ Exemplo de uso

```bash
Quantos alunos no curso A? 3
  > Digite o código do aluno #1: 101
  > Digite o código do aluno #2: 102
  > Digite o código do aluno #3: 103

Quantos alunos no curso B? 2
  > Digite o código do aluno #1: 102
  > Digite o código do aluno #2: 104

Quantos alunos no curso C? 2
  > Digite o código do aluno #1: 101
  > Digite o código do aluno #2: 105

Resumo dos cursos:
A [ID=101 | Nome=Aluno101, ID=102 | Nome=Aluno102, ID=103 | Nome=Aluno103]
B [ID=102 | Nome=Aluno102, ID=104 | Nome=Aluno104]
C [ID=101 | Nome=Aluno101, ID=105 | Nome=Aluno105]

Total de alunos distintos: 5
```

## 🚀 Possíveis melhorias

* Persistência de dados (salvar/alunos em arquivos).
* Interface gráfica ou interface web simples.
* Cadastro real com nomes personalizados.
* Exportação de relatório.

## 👨‍🏫 Autor

Desenvolvido por **Saulo Melo** — estudante de Análise e Desenvolvimento de Sistemas.

> “Não é só sobre escrever código que funciona, é sobre entender o problema e propor soluções reutilizáveis e escaláveis.”

📌 Me acompanhe por aqui:

- GitHub: [@SaulinhoDevs](https://github.com/SaulinhoDevs)
- LinkedIn: [Saulo Melo](https://www.linkedin.com/in/saulobmelo/)

Se esse projeto te ajudou ou te inspirou de alguma forma, sinta-se à vontade para deixar uma ⭐ ou me mandar um feedback. Vamos evoluir juntos! 🚀