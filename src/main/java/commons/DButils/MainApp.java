package commons.DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.testng.annotations.Test;

public class MainApp {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/emp";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "admin";

   public static void main(String[] args) throws SQLException {
      Connection conn = null;
      QueryRunner queryRunner = new QueryRunner();
      DbUtils.loadDriver(JDBC_DRIVER);       
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      try {
         int insertedRecords = queryRunner.update(conn, 
            "INSERT INTO employees(id,age,first,last)  VALUES (?,?,?,?)",
            104,30, "Sohan","Kumar");           
         System.out.println(insertedRecords + " record(s) inserted");
      } finally {
         DbUtils.close(conn);
      }  
   }

   @Test
   public void queryTest() throws SQLException {
      Connection conn = null;
      QueryRunner queryRunner = new QueryRunner();
      //Step 1: Register JDBC driver
      DbUtils.loadDriver(JDBC_DRIVER);

      //Step 2: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //Step 3: Create a ResultSet Handler to handle Employee Beans
      ResultSetHandler<Employee> resultHandler =
              new BeanHandler<Employee>(Employee.class);

      try {
         Employee emp = queryRunner.query(conn, "SELECT * FROM employees WHERE id=?",
                 resultHandler, 104);
         //Display values
         System.out.print("ID: " + emp.getId());
         System.out.print(", Age: " + emp.getAge());
         System.out.print(", First: " + emp.getFirst());
         System.out.println(", Last: " + emp.getLast());
      } finally {
         DbUtils.close(conn);
      }
   }

   @Test
   public void updateTest() throws SQLException {
      Connection conn = null;
      QueryRunner queryRunner = new QueryRunner();

      DbUtils.loadDriver(JDBC_DRIVER);
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      try {
         int updatedRecords = queryRunner.update(conn,
                 "UPDATE employees SET age=? WHERE id=?", 33,104);
         System.out.println(updatedRecords + " record(s) updated.");
      } finally {
         DbUtils.close(conn);
      }
   }

   @Test
   public void deleteTest() throws SQLException {
      Connection conn = null;
      QueryRunner queryRunner = new QueryRunner();

      DbUtils.loadDriver(JDBC_DRIVER);
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      try {
         int deletedRecords = queryRunner.update(conn,
                 "DELETE from employees WHERE id=?", 104);
         System.out.println(deletedRecords + " record(s) deleted.");
      } finally {
         DbUtils.close(conn);
      }
   }
}
