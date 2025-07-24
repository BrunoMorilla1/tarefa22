package br.com;

import br.com.pessoa.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class FiltroDePessoas {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", "F"),
                new Pessoa("Carlos", "M"),
                new Pessoa("Beatriz", "F"),
                new Pessoa("Daniel", "M"),
                new Pessoa("Fernanda", "F"),
                new Pessoa("Lucas", "M")
        );

        System.out.println("Lista completa:");
        pessoas.forEach(System.out::println);

        // Lista filtrada: apenas mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        System.out.println("\nApenas mulheres:");
        mulheres.forEach(System.out::println);
    }
}
