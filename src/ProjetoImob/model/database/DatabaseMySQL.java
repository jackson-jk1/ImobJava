package ProjetoImob.model.database;

import com.mysql.jdbc.Driver;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMySQL {
    private Connection connection;

    public  Connection conectar(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
          this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","123456");
          return this.connection;
        } catch (SQLException | ClassNotFoundException ex){

            JOptionPane.showMessageDialog(null, "nao foi possivel conectar ao banco MySQL");
            return null;
        }
    }
    public  Connection desconectar(Connection connection){
        try{
           connection.close();
        } catch (SQLException ex){

            JOptionPane.showMessageDialog(null, "nao foi possiveldesconectar ao banco MySQL");
            return null;
        }
        return null;
    }
}
