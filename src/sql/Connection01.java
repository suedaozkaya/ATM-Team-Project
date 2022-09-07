package sql;

import java.sql.DriverManager;

public class Connection01 {
    public static java.sql.Connection connectToDb(String dbName, String user, String password){
        java.sql.Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName,user,password);
            if (con!=null){
                System.out.println("Baglanti saglandi");
            }else {
                System.out.println("Baglanti saglanamadi");
                connectToDb("bankaProjesi","postgres","15080373");
            }

        }catch(Exception e){
            System.out.println(e);
        }

        return con;
    }
}
