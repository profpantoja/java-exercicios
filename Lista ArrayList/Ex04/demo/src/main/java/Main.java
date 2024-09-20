// Faça o mesmo para todos os objetos cachorros e verifique:
// a. Quantos cachorros estão desnutridos;
// b. Quantos cachorros são vira latas;
// c. Quantos cachorros são da cor Amarela.

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Pet pet1 = new Pet("Kate", "Preta", 35, Raca.Vira_Lata, LocalDate.parse("12/06/2009", fmt), Especie.Cachorro);
        Pet pet2 = new Pet("Bob", "Preto", 22, Raca.Labrador, LocalDate.parse("09/10/2010", fmt), Especie.Cachorro);
        Pet pet3 = new Pet("Pitty", "Branco", 38, Raca.Pitbull, LocalDate.parse("02/03/2007", fmt), Especie.Cachorro);
        Pet pet4 = new Pet("Kelly", "Amarelo", 36, Raca.Labrador, LocalDate.parse("08/05/2001", fmt), Especie.Cachorro);
        Pet pet5 = new Pet("Peixe", "Amarelo", 20, Raca.Vira_Lata, LocalDate.parse("09/11/2008", fmt), Especie.Cachorro);
        Pet pet6 = new Pet("Grazi", "Amarelo", 18, Raca.Pastor, LocalDate.parse("12/12/2012", fmt), Especie.Cachorro);

        Pessoa p1 = new Pessoa("Diana","Rua Doutor Pio Borges, 2822", "(21)97564-4658", "diana@gmail.com", Sexo.Feminino );
        Pessoa p2 = new Pessoa("Louis","Rua Plinio Leite, 786", "(11)98567-4486", "louis@hotmail.com",Sexo.Feminino );
        Pessoa p3 = new Pessoa("Bruce","Rua Coronel Serrado, 28", "(21)8922-2282", "brucewayne@gmail.com", Sexo.Masculino);
        Pessoa p4 = new Pessoa("Clark", "Rua Alberto Torres, 10", "(21)96808-7564", "clarkent@gmail.com", Sexo.Masculino);

        Ficha f1 = new Ficha(LocalDate.parse("24/12/2010", fmt), pet1, p1);
        Ficha f2 = new Ficha(LocalDate.parse("20/03/2011", fmt), pet2, p2);
        Ficha f3 = new Ficha(LocalDate.parse("18/06/2007", fmt), pet3, p3);
        Ficha f4 = new Ficha(LocalDate.parse("01/09/2002", fmt), pet4, p4);
        Ficha f5 = new Ficha(LocalDate.parse("24/12/2005", fmt), pet5, p1);
        Ficha f6 = new Ficha(LocalDate.parse("24/12/2010", fmt), pet6, p2);

        ArrayList <Ficha> listaAdocoes = new ArrayList<>();

            listaAdocoes.add(f1);
            listaAdocoes.add(f2);
            listaAdocoes.add(f3);
            listaAdocoes.add(f4);
            listaAdocoes.add(f5);
            listaAdocoes.add(f6);

        f1.imprime();
        System.out.println("");
        f2.imprime();
        System.out.println("");
        f3.imprime();
        System.out.println("");
        f4.imprime();
        System.out.println("");
        f5.imprime();
        System.out.println("");
        f6.imprime();
        System.out.println("");

        System.out.println("----------Pet com mais tempo adotado-----------------");
        petMaisAntigo(listaAdocoes);
        System.out.println("");
        System.out.println("----------Quantidade de Vira Latas adotados----------");
        qtdViraLatasAdotados(listaAdocoes);
        System.out.println("");
        System.out.println("----------Quantidade de Vira Latas-------------------");
        qtdViraLatas(listaAdocoes);
        System.out.println("");
        System.out.println("----------Quantidade de Pets desnutridos-------------");
        qtdDesnutridos(listaAdocoes);
        System.out.println("");
        System.out.println("----------Quantidade de Pets amarelos----------------");
        qtdPetsAmarelos(listaAdocoes);
        System.out.println("");
        System.out.println("----------Procurando Pets por um nome-----------------");
        procurarPet(listaAdocoes, "Bob");
        System.out.println("");
        procurarPet(listaAdocoes, "Nelson");
        System.out.println("");
        
    }
    public static void procurarPet(ArrayList <Ficha> listaAdocoes, String nome){
        boolean petEncontrado = false;
        for(Ficha ficha: listaAdocoes){
            if(ficha.getPetAdotado().getNome().equals(nome)){
                petEncontrado = true;
                System.out.println("Pet encontrado!");
                System.out.println("Nome: "+ficha.getPetAdotado().getNome());
                System.out.println("Especie: "+ficha.getPetAdotado().getEspecie());
                System.out.println("Raca: "+ficha.getPetAdotado().getRaca());
                break;
            }
        }
        if(petEncontrado == false){
            System.out.println("Pet com o nome " + nome + " nao foi encontrado!");
        } 
    }

    public static void petMaisAntigo(ArrayList <Ficha> listaAdocoes){
        Ficha maisAntiga = null;
        LocalDate dataMaisAntiga = null;
        for(Ficha ficha: listaAdocoes){
            LocalDate dataAdocao = ficha.getDataAdocao();
            if(dataMaisAntiga == null || dataAdocao.isBefore(dataMaisAntiga)){
                maisAntiga = ficha;
                dataMaisAntiga = dataAdocao;
            }
        }
        if(maisAntiga != null){
            System.out.println("Nome: "+ maisAntiga.getPetAdotado().getNome());
            System.out.println("Especie: "+maisAntiga.getPetAdotado().getEspecie());
            System.out.println("Raca: "+maisAntiga.getPetAdotado().getRaca());
            maisAntiga.tempoAdotado();
        }
        else{
            System.out.println("Nao tem Pets adotados."); 
        }
    }

    public static void qtdViraLatasAdotados(ArrayList <Ficha> listaAdocoes){
        int qtd = 0;
        for(Ficha ficha: listaAdocoes){
            if(ficha.estaAdotado() && ficha.getPetAdotado().getRaca().equals(Raca.Vira_Lata)){
                qtd++;
            }
        }
        System.out.println("Total: "+qtd);
    }

    public static void qtdViraLatas(ArrayList <Ficha> listaAdocoes){
        int qtd2 = 0;
        for(Ficha ficha: listaAdocoes){
            if(ficha.getPetAdotado().getRaca().equals(Raca.Vira_Lata)){
                qtd2++;
            }
        }
        System.out.println("Total: "+qtd2);
    }

    public static void qtdDesnutridos(ArrayList <Ficha> listaAdocoes){
        int qtd3 = 0;
        for(Ficha ficha: listaAdocoes){
            double peso =  ficha.getPetAdotado().getPeso();
            if(peso >0 && peso<=20){
                qtd3++;
            }
        }
        System.out.println("Total: "+qtd3);
    }

    public static void qtdPetsAmarelos(ArrayList <Ficha> listaAdocoes){
        int qtd4 = 0;
        for(Ficha ficha: listaAdocoes){
            if(ficha.getPetAdotado().getCor().equals("Amarelo")){
                qtd4++;
            }
        }
        System.out.println("Total: "+qtd4);
    }
}