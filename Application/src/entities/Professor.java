package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Professor extends Usuario {
    private final List<Curso> cursos = new ArrayList<>();

    public Professor(int id, String nome) {
        super(id, nome);
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public int getTotalAlunos() {
        Set<Aluno> distintos = cursos.stream()
                .flatMap(c -> c.getAlunos().stream())
                .collect(Collectors.toCollection(HashSet::new));
        return distintos.size();
    }
}