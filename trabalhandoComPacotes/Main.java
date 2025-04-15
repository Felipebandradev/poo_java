import classes.Carro;
import enums.Modelo;
import records.Documento;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Criando um carro
        Carro carro1 = new Carro(
                "VW",
                Color.blue,
                Modelo.HATCH,
                new Documento("0000000", "000000000")
                );
        System.out.println(carro1.toString());
    }
}