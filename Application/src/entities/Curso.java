package entities;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Curso {
    private final String nome;
    private final Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    @Override
    public String toString() {
        return nome + " " + alunos;
    }
}