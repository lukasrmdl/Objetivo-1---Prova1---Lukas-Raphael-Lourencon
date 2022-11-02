package controller;

import model.Aluno;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    }
}