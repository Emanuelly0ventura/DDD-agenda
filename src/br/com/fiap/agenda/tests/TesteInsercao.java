package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ContatoDao;
import br.com.fiap.agenda.enums.TipoContatoEnum;
import br.com.fiap.agenda.model.Contato;
import br.com.fiap.agenda.model.Endereco;

import java.util.Scanner;

public class TesteInsercao {

    public static void main(String[] args) {
        Contato contato = new Contato();
        ContatoDao dao = new ContatoDao();
        Endereco endereco = new Endereco();

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        System.out.println("Digite o código do contato: ");
        contato.setId(leitor.nextInt());
        System.out.println("Digite o nome do contato: ");
        contato.setNome(leitorTexto.nextLine());
        System.out.println("Digite o celular do contato: ");
        contato.setCelular(leitorTexto.nextLine());
        System.out.println("Digite o email do contato: ");
        contato.setEmail(leitorTexto.nextLine());
        System.out.println("Digite o instagram do contato: ");
        contato.setInstagram(leitorTexto.nextLine());
        System.out.println("Selecione o tipo do contato: " +
                "1 - Amigo\t2 - Familiar\t3 - Profissional");
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1: contato.setTipo(TipoContatoEnum.AMIGO);break;
            case 2: contato.setTipo(TipoContatoEnum.FAMILIAR);break;
            case 3: contato.setTipo(TipoContatoEnum.PROFISSIONAL);break;
        }
        System.out.println("Digite o codigo do endereco: ");
        int cod = leitor.nextInt();


        contato.setEndereco(contato);
        dao.cadastrarContato(contato);
        System.out.println("Contato foi adicionado com sucesso!");


    }

}
