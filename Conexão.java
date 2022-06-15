import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.jdi.event.ClassPrepareEvent;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*CLASSE QUE REALIZA A CONEXÃO COM O BANCO DE DADOS*/
public class Conexão {
    static Object conexão;
    public Object getConexão;
    private String caminho = "jdbc:mysql://localhost:3306" //ENDEREÇO DO BANCO DE DADOS
    private String usuario = "root"; //USUARIO DO BANCO DE DADOS
    private String senha = "Complicado123"; //SENHA DO USUARIO DO BANCO DE DADOS
    public Connection conn; //ATRIBUTO PARA CONEXÃO

    public void conexão() //METODO PARA ABRIR A CONEXAO COM O BANCO DE DADOS
    {
        try //BLOCO PARA REALZACAO CASO NAO OCORRA ERROS
        {
            conn=DriverManager.getConnection(caminho,usuario, senha);
            System.out.println("CONEXAO BEM SUCEDIDA!!");
        }
        catch (SQLException exception) //BLOCO PARA EXECUÇÃO CASO OCORRA ERRO NO TRY
        {
            Logger.getLogger(Conexão.class.getName()).log(Level.SEVERE, null, exception);

        }

        public void desconectado() //METODO PARA FECHA A CONEXAO COM BANCO
        {
            try //BLOCO PARA REALZACAO CASO NAO OCORRA ERROS
            {
                conn.close();
                System.out.println("SAIDA DA CONEXAO BEM SUCEDIDA!!");
            }
            catch (SQLException exception) //BLOCO PARA EXECUÇÃO CASO OCORRA ERRO NO TRY
            {
                Logger.getLogger(Conexão.class.getName()).log(Level.SEVERE, null, exception);
                System.out.println("FALHA NA CONEXAO AO SAIR!!");
            }
        }
    }

    //METODO USADO APENAS PARA TESTA DA CLASSE CONEXAO
    public static void main(String[] args) {
        Conexão obj.conexão - new conexão();
        obj.conexão();

    }
}

