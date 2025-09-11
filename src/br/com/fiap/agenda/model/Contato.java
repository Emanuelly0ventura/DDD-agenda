package br.com.fiap.agenda.model;

import br.com.fiap.agenda.enums.TipoContatoEnum;

public class Contato {
    private int  id;
    private String nome;
    private String celular;
    private String email;
    private String instagram;
    private String tipo;
    private String endereco;

    @Override
    public String toString() {
        return "\nContato: " + id +
                "\nNome:" + nome +
                "\nCelular: " + celular +
                "\nEmail: " + email +
                "\nInstagram: " + instagram  +
                "\nTipo do Contato: " + tipo +
                "\nEndereco: " + endereco +
                "\n===================================";
    }

    public String getInstagram() {
        return instagram;
    }
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nomeContato) {
        this.nome = nomeContato;
    }

    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTipo(TipoContatoEnum tipoContatoEnum) {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
