import entities.Aluno;
import entities.Curso;
import entities.Professor;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Professor professor1 = new Professor(1, "Alex");

        Curso cursoA = new Curso("A");
        Curso cursoB = new Curso("B");
        Curso cursoC = new Curso("C");
        professor1.addCurso(cursoA);
        professor1.addCurso(cursoB);
        professor1.addCurso(cursoC);

        lerAlunosParaCurso(cursoA);
        lerAlunosParaCurso(cursoB);
        lerAlunosParaCurso(cursoC);

        System.out.println("\nResumo dos cursos:");
        professor1.getCursos().forEach(System.out::println);

        System.out.println("\nTotal de alunos distintos: " + professor1.getTotalAlunos());
    }

    private static void lerAlunosParaCurso(Curso curso) {
        System.out.print("Quantos alunos no curso " + curso.getNome() + "? ");
        int quantidade = lerIntPositivo();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("  > Digite o código do aluno #" + i + ": ");
            int codigo = lerIntPositivo();
            curso.addAluno(new Aluno(codigo, "Aluno" + codigo));
        }
    }

    private static int lerIntPositivo() {
        while (true) {
            String linha = sc.nextLine();
            try {
                int valor = Integer.parseInt(linha.trim());
                if (valor <= 0) throw new NumberFormatException();
                return valor;
            } catch (NumberFormatException e) {
                System.out.print("  Valor inválido. Digite um inteiro positivo: ");
            }
        }
    }
}