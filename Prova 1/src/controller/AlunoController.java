package controller;

import model.Aluno;

import java.util.*;


public class AlunoController {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(3 , 382626200);
        Aluno aluno4 = new Aluno(4 , 852547210);
        Aluno aluno5 = new Aluno(5, 428469330, "Lukas Raphael", "Lourencon", "lukas.rmdl@gmail.com");
        Aluno aluno6 = new Aluno(6, 236185830, "Eduardo", "Teixeira", "eduardo.2014@hotmail.com");


        //impressoes

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);

        //aluno 1

        aluno1.setId(1);
        aluno1.setCpf(932541030);
        aluno1.setNome("Carlos");
        aluno1.setSobrenome("Beluga");
        aluno1.setEmail("carlos.b@gmail.com");

        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());


        //aluno 2

        aluno2.setId(2);
        aluno2.setCpf(758985820);
        aluno2.setNome("Jessica");
        aluno2.setSobrenome("Santos");
        aluno2.setEmail("JessSantos2011@gmail.com");

        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        // coleções

        // List
        List<Aluno> alunosList = new ArrayList<>();
        alunosList.add(aluno1);
        alunosList.add(aluno2);
        alunosList.add(aluno3);
        alunosList.add(aluno4);
        alunosList.add(aluno5);
        alunosList.add(aluno6);

        System.out.println(alunosList);

        // Pesquisando o quinto

        System.out.print("Localizando o Aluno de Id 5 na list...");
        Aluno encontraAluno = alunosList.stream().filter(c -> c.getId() == 5).findAny().orElse(null);
        System.out.println(encontraAluno);

        // Ordenando a list

        alunosList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("\n List em ordem decrescente baseado na chave id");
        System.out.println(alunosList);

        // Map

        Map<Integer, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(aluno1.getId(), aluno1);
        alunosMap.put(aluno2.getId(), aluno2);
        alunosMap.put(aluno3.getId(), aluno3);
        alunosMap.put(aluno4.getId(), aluno4);
        alunosMap.put(aluno5.getId(), aluno5);
        alunosMap.put(aluno6.getId(), aluno6);

        System.out.println(alunosMap);

        // Pesquisando o quinto

        System.out.print("Localizando o Aluno de Id 5 no map...");
        System.out.println(alunosMap.get(5));

        // Ordenar a coleção do tipo map mudaria o conteúdo indexado pela função hash

        System.out.print("Não foi possivel alterar a ordem da coleção do tipo map!");

    }
}