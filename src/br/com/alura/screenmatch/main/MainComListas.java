package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComListas {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("O poderoso chefão", 1970);
        Movie outroFilme = new Movie("Avatar", 2023 );
        Movie filmedoPaulo = new Movie("DogVille", 2003);

        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmedoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());

            if (item instanceof Movie filme) {
                System.out.println(filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println(buscaPorArtista);

        System.out.println("Lista de Titulos ordenados");
        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por ano:");
        System.out.println(lista);
    }
}
