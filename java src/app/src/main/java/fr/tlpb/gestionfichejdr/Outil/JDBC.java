package fr.tlpb.gestionfichejdr.Outil;


import java.sql.Connection;
import java.sql.DriverManager;
import org.postgresql.*;

/**
 * Created by pierr_000 on 22/05/2017.
 */

public final class JDBC {

    public static Connection connexion() {
        Connection conn = null;
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());

            String url, user, passwd;
            url = "jdbc:postgresql://192.168.1.29:5432/tlpb_jdr";
            user = "postgres";
            passwd = "qnoq9ABCD8";
            conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");
        }catch(Exception e){
            e.printStackTrace();
        }

        return conn;
    }


}
