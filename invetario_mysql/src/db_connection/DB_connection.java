/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Fuentes <luisfuau10@gmail.com>
 */
public class DB_connection {
    private static final String DRIVER = "java.sql.Driver";
    private static final String SSL = "?useTimezone=true&serverTimezone=UTC"
                                   + "&useSSL=false"
                                   + "&verifyServerCertificate=false"
                                   + "&autoReconnect=true";
    private final  String HEAD = "jdbc:mysql://";
    private Connection con;
    private String username;
    private String password;
    private String host;
    private String puerto;
    private String bd_name;
    private String url;
    
    
    //Constructor
    public DB_connection(String host, String puerto, String bd_name, String username, String password){
        this.username = username;
        this.password = password;
        this.host = host;
        this.puerto = puerto;
        this.bd_name = bd_name;
        this.con = null;        
        url = HEAD + this.host + ":" + this.puerto +"/"+ this.bd_name + SSL;
        
        try{
            
            Class.forName(DRIVER);
            con = DriverManager.getConnection(url, this.username, this.password);
            
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar " + e);
        }
        
    }
    
    //Este método nos retorna la conexión a la base de datos
    public Connection getConnection(){
        return this.con;
    }
    
    //Este método desconecta la base de dato
    public void desconectar() throws SQLException{
        con=null;
        
        if(con==null){
            JOptionPane.showMessageDialog(null, "Conexión terminada");
        }
    }
}
