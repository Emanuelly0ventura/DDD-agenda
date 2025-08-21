package br.com.fiap.agenda.dao;
import br.com.fiap.agenda.model.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;

//Toda classe DAO é responsavel pelo CRUD
public class ContatoDao {
    private Connection conexao;
    public void cadastrarContato(Contato contato){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        try {
            String sql = "INSERT INTO TBL_CONTATO (ID_CONTATO, nome_contato, celular_contato, email_contato, instagram, tipo)" +
                    "values (?, ?, ?, ?, ?, ?);";

        }catch (Exception e){

        }
    }

}
