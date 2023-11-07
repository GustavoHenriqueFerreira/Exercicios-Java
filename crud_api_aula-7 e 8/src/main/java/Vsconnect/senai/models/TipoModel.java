package Vsconnect.senai.models;

public enum TipoModel {
    ADMIN("admin"),
    DESENVOLVEDOR("dev"),
    CLIENTE("cliente");

    private String tipo;

    TipoModel(String tipoRecebido){
        this.tipo = tipoRecebido;  // método construtor para sempre que for chamado, terá que ter o tipo
    }

    public String getRole(){
        return tipo; // método utilizando encapsulamento para só ele acessar
    }
}
