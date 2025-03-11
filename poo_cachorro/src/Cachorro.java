// Arquivo Cachorro.java
public class Cachorro {
    int Id;
    String Nome;
    Racas Raca;
    String Cor;
    int Idade;

    public void  lerNome(){
        System.out.println(Nome);
    }

}

enum Racas{
    VIRA_lATA,
    DALMATA,
    GOLDEN_RETRIVER,
    PINSCHER
}