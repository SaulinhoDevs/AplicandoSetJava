import entities.Student;
import entities.Teacher;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Teacher professor = new Teacher(ThreadLocalRandom.current().nextInt(1, 11), "Alex");

        Student aluno1 = new Student(ThreadLocalRandom.current().nextInt(100, 201), "João");
        Student aluno2 = new Student(ThreadLocalRandom.current().nextInt(100, 201), "Maria");
        Student aluno3 = new Student(ThreadLocalRandom.current().nextInt(100, 201), "Carlos");
        Student aluno4 = new Student(ThreadLocalRandom.current().nextInt(100, 201), "Ana");
        Student aluno5 = new Student(ThreadLocalRandom.current().nextInt(100, 201), "Luiz");
        Student aluno6 = new Student(ThreadLocalRandom.current().nextInt(100, 201), "Beatriz");

        Set<Student> cursoA = new HashSet<>();
        Set<Student> cursoB = new HashSet<>();
        Set<Student> cursoC = new HashSet<>();

        Student[] alunos = {aluno1, aluno2, aluno3, aluno4, aluno5, aluno6};

        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (Student a : alunos) {
            if (rand.nextBoolean()) cursoA.add(a);
            if (rand.nextBoolean()) cursoB.add(a);
            if (rand.nextBoolean()) cursoC.add(a);
        }
        if (cursoA.isEmpty()) cursoA.add(alunos[rand.nextInt(alunos.length)]);
        if (cursoB.isEmpty()) cursoB.add(alunos[rand.nextInt(alunos.length)]);
        if (cursoC.isEmpty()) cursoC.add(alunos[rand.nextInt(alunos.length)]);

        System.out.println("Curso A: " + cursoA);
        System.out.println("Curso B: " + cursoB);
        System.out.println("Curso C: " + cursoC);

        System.out.println("");

        System.out.println("How many students for course A? " + cursoA.size());
        for (Student a : cursoA) {
            System.out.println(a.getId());
        }

        System.out.println("");
        System.out.println("How many students for course B? " + cursoB.size());
        for (Student b : cursoB) {
            System.out.println(b.getId());
        }

        System.out.println("");
        System.out.println("How many students for course C? " + cursoC.size());
        for (Student c : cursoC) {
            System.out.println(c.getId());
        }

        System.out.println("");
        Set<Student> todosOsAlunos = new HashSet<>();
        todosOsAlunos.addAll(cursoA);
        todosOsAlunos.addAll(cursoB);
        todosOsAlunos.addAll(cursoC);
        int totalAlunos = todosOsAlunos.size();
        System.out.println("Total students: " + totalAlunos);
    }
}