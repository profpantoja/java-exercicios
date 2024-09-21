package org.example3;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Coordenador coordenador = new Coordenador("Dr. João", "joao@example.com", "Universidade X", "Rua Y, 123", "Professor");


        Pesquisa pesquisa = new Pesquisa("Pesquisa em IA", "Descrição da pesquisa em IA", new Date(), new Date(), AreaPesquisa.INTELIGENCIA_ARTIFICIAL, coordenador, null);


        ArtigoRevista artigoRevista = new ArtigoRevista("Título do Artigo de Revista", 2023, Arrays.asList("Autor 1", "Autor 2"), "Inteligência Artificial", pesquisa);
        artigoRevista.setNomePeriodico("Revista de IA");
        artigoRevista.setVolume(10);
        artigoRevista.setNumero(2);

        ArtigoConferencia artigoConferencia = new ArtigoConferencia("Título do Artigo de Conferência", 2023, Arrays.asList("Autor 1", "Autor 2"), "Inteligência Artificial", pesquisa);
        artigoConferencia.setNomeConferencia("Conferência de IA");


        pesquisa.setPublicacoes(Arrays.asList(artigoRevista, artigoConferencia));


        artigoRevista.imprimirInformacoes();
        artigoConferencia.imprimirInformacoes();
    }
}