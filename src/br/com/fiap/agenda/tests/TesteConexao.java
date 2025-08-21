package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ConnectionFactory;

import java.net.ConnectException;

public class TesteConexao {
    public static void main(String[] args) {
        System.out.println("Teste de conexão!");
        if(ConnectionFactory.obterConexao()==null){
            System.out.println("Erro ao estabelecer conexão");
        }else{
            System.out.println("Conexão foi estabelecida!");
        }
    }
}
