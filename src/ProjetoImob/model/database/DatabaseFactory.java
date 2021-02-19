package ProjetoImob.model.database;

public class DatabaseFactory {
 public static Database getDatabase(String nome){
     if (nome.equals("postgresql")){
         return  (Database) new DatabasePostgreSQL();
     } else if (nome.equals("mysql")){
                  return (Database) new DatabaseMySQL();
     }

     return null;
 }

}
