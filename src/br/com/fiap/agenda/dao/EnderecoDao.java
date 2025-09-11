package br.com.fiap.agenda.dao;

import br.com.fiap.agenda.model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class EnderecoDao {
        private Connection conexao;

        public void cadastrarEndereco(Endereco endereco) {
            conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = null;
            try {
                String sql = "insert into Endereco (codigo, lofradouro, cep, bairro, cidade, estado, uf, numero,complemento)"+
                        "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                ps = conexao.prepareStatement(sql);
                ps.setInt(1, endereco.getCodigo());
                ps.setString(2, endereco.getLogradouro());
                ps.setString(3, endereco.getCep());
                ps.setString(4, endereco.getBairro());
                ps.setString(5, endereco.getCidade());
                ps.setString(6, endereco.getEstado());
                ps.setString(7, endereco.getUf());
                ps.setInt(8, endereco.getNumero());
                ps.setString(9, endereco.getComplemento());
                ps.executeUpdate();
                ps.close();
                conexao.close();
            }catch (SQLException e ){
                e.printStackTrace();
            }
        }

        public Endereco BuscarPorCodigo(int codigo) {
            conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = null;
            Endereco endereco = new Endereco();
            try{
                ResultSet rs = ps.executeQuery();
                ps = conexao.prepareStatement("select * from Endereco" +
                        " where condigo = ?");
                if (rs.next()){
                    endereco.setCodigo(rs.getInt("codigo"));
                    endereco.setLogradouro(rs.getString("logradouro"));
                    endereco.setCep(rs.getString("cep"));
                    endereco.setBairro(rs.getString("bairro"));
                    endereco.setCidade(rs.getString("cidade"));
                    endereco.setEstado(rs.getString("estado"));
                    endereco.setUf(rs.getString("uf"));
                    endereco.setNumero(rs.getInt("numero"));
                    endereco.setComplemento(rs.getString("complemento"));

                }
                ps.close();
                conexao.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return endereco;
        }

        public List<Endereco> listarEnderecos() {
            List<Endereco> enderecos = new ArrayList<>();
            conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = null;
            Endereco endereco = new Endereco();
            try{
                ResultSet rs = ps.executeQuery();
                ps = conexao.prepareStatement("select * from Endereco");
                while(rs.next()){
                    endereco.setCodigo(rs.getInt(1));
                    endereco.setLogradouro(rs.getString(2));
                    endereco.setCep(rs.getString(3));
                    endereco.setBairro(rs.getString(4));
                    endereco.setCidade(rs.getString(5));
                    endereco.setEstado(rs.getString(6));
                    endereco.setUf(rs.getString(7));
                    endereco.setNumero(rs.getInt(8));
                    endereco.setComplemento(rs.getString(9));
                    enderecos.add(endereco);


                }
                ps.close();
                conexao.close();


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return enderecos;
        }

        public void alterarEndereco(Endereco endereco) {
            conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = null;
            try{
                String sql = "UPDATE Endereco SET  = ?, logradouro = ?," +
                        " cep = ?, bairro  = ?, cidade = ?, estado = ?, uf = ?, numero = ?, complemento = ?" +
                        "where codigo= ?";
                ps = conexao.prepareStatement(sql);

                ps.setString(1, endereco.getLogradouro());
                ps.setString(2, endereco.getCep());
                ps.setString(3, endereco.getBairro());
                ps.setString(4, endereco.getCidade());
                ps.setString(5, endereco.getEstado());
                ps.setString(6, endereco.getUf());
                ps.setInt(7, endereco.getNumero());
                ps.setString(8, endereco.getComplemento());
                ps.setInt(9, endereco.getCodigo());
                ps.executeUpdate();
                ps.close();
                conexao.close();

            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
        public void excluirEndereco(int codigo){
            conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = null;
            try{
                ps = conexao.prepareStatement("delete from Endereco where codigo= ?");
                ps.setInt(1, codigo);
                ps.executeUpdate();
                ps.close();
                conexao.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }


