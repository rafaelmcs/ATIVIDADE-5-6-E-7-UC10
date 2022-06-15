import com.mysql.cj.x.protobuf.MysqlxExpr;
import com.mysql.cj.xdevapi.Column;
import com.mysql.cj.xdevapi.CreateIndexParams;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO_Produtos {

    Conexão obj.Conexão = new void Conexão();

    //METODO PARA CONSULTA DE UNIDADE NO BANCO DE DADOS
    public void Consulta(){
        obj.conexão();
        Statement stm = null "RESPONSAVEL POR EXECULTA COMANDOS SQL"
        ResultSet rs = null; "ARMAZEM RESULTADO DE COMANDO SELECT"
        try
        {
            Object Stm = obj.conexão.();
            assert stm != null;
            rs = stm.executeQuery("select * from produtos");
            while (rs.next())
                System.out.println(rs.getInt(1)+
                        " " + rs.getString(2)+
                        " " + rs.getDouble(3)+
                        " "  rs.getDouble(4)+
                        " "  rs.getInt(5);
            obj.conexão.();




        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public void inserir(){
        obj.conexão();
        PreparedStatement pst = null "RESPONSAVEL POR EXECULTA COMANDOS SQL"
        String sql = "INSERT INTO PRODUTOS (cd_produto, ds_produto, vl_produtos, qt_produtos_cd_unidade (?, ?, ?, ?, ?, ?)";
        try
        {
            pst = obj.conexão.PrepareStatement(sql);
            assert stm != null;
            rs = stm.executeQuery("select * from produtos");
            while (rs.next())
                System.out.println(rs.getInt(1)+
                        " " + rs.getString(2)+
                        " " + rs.getDouble(3)+
                        " "  rs.getDouble(4)+
                        " "  rs.getInt(5);
            obj.conexão.();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        public void alterar(produto p){
            obj.conexão();
            PreparedStatement pst = null
            String sql = UPDATE produtos SET ds_produto, vl_produto, qt_produto, cd_produto, cd_unidade";
            try
            {

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

}
