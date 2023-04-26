import java.sql.*;
import java.util.Scanner;


public class db {
    public static void main(String[] args)throws Exception {
        Scanner in =new Scanner(System.in);
        Scanner sin =new Scanner(System.in);

//        connection
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
//        create statement quary
         Statement statement=con.createStatement();

         String use="use javadb";
//         String table=" CREATE TABLE user (\n" +
//                 "                id INT NOT NULL,\n" +
//                 "                name VARCHAR(255) NOT NULL,\n" +
//                 "                roll INT(11) NOT NULL\n" +
//                 "        );";
//        String insert="INSERT INTO user (id, name, roll) VALUES (7, 'John Does', 10001);";
        System.out.println("Enter id");
        int id = in.nextInt();
        System.out.println("Enter roll");
        int roll=in.nextInt();
        System.out.println("Enter name");
        String name=sin.nextLine();

        String insert="INSERT INTO user (id, name, roll) VALUES (?,?,?);";

        PreparedStatement pr = con.prepareStatement(insert);
        pr.setInt(1,id);
        pr.setString(2,name);
        pr.setInt(3,roll);

        statement.executeUpdate(use);

        pr.executeUpdate();









//        statement.executeUpdate(insert);

        System.out.println("Db created");
    }
}
