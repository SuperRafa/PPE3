/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafac
 */
public class SdzConnection {

    private static String url = "jdbc:mysql://localhost:3333/employee";
    private static String user = "employee";
    private static String passwd = "Tchoin";
    private static Connection connect;

    public static Connection getInstance() {
        if (connect == null) {
            try {
                connect = DriverManager.getConnection(url, user, passwd);
            
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}
