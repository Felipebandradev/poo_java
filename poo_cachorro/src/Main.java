public class Main {
    public static void main(String[] args) {

        //Criando o objetos - classe Cachorro()
        Cachorro dogA = new Cachorro();
        Cachorro dogB = new Cachorro();
        Cachorro dogC = new Cachorro();
        Cachorro dogD = new Cachorro();

        // Definindo os atributos do dogA
        dogA.Id = 1;
        dogA.Nome = "Caramelo";
        dogA.Raca = Racas.VIRA_lATA;
        dogA.Cor = "Amarela";
        dogA.Idade = 8;

        //Definindo os atributos do dogB
        dogB.Id = 2;
        dogB.Nome = "Bolinha";
        dogB.Raca = Racas.PINSCHER;
        dogB.Cor = "Preta";
        dogB.Idade = 12;

        //Definindo os atributos do dogC
        dogC.Id = 3;
        dogC.Nome = "Lola";
        dogC.Raca = Racas.GOLDEN_RETRIVER;
        dogC.Cor = "Amarela";
        dogC.Idade = 4;

        //Definindo os atributos do dogD
        dogD.Id = 4;
        dogD.Nome = "Xuxa";
        dogD.Raca = Racas.DALMATA;
        dogD.Cor = "Branca";
        dogD.Idade = 3;

        //Chamando a função lerNome
        dogA.lerNome();
        dogB.lerNome();
        dogC.lerNome();
        dogD.lerNome();

        //4ºSemestre
        // Felipe Barbosa
        // João Pedro Viana
        // Isadelly Freitas
        // VANESSA Barbosa
        // Rhuam Gomes de Araujo



    }
}