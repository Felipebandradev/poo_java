package classes;

import enums.Modelo;
import interfaces.Pintura;
import interfaces.Veiculo;
import records.Documento;

import java.awt.*;

public class Carro implements Veiculo, Pintura {

    //Propriedades
    private Documento marca;
    private Color cor;
    private Modelo modelo;
    private String documentacao;

    //Contrutor


    public Carro(String documentacao, Color cor, Modelo modelo, Documento marca) {
        this.documentacao = documentacao;
        this.modelo = modelo;
        this.cor = definirCor(cor);
        this.marca = marca;
    }

    // Getters
    public Documento getMarca() {
        return marca;
    }

    public Color getCor() {
        return cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public String getDocumentacao() {
        return documentacao;
    }

    // Setters


    public void setMarca(Documento marca) {
        this.marca = marca;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    //Método da interface pintura
    @Override
    public Color definirCor(Color cor) {
        return cor;
    }

    //Métodos da interface veiculo
    @Override
    public void acelerar() {

    }


    @Override
    public void frear() {

    }
}
