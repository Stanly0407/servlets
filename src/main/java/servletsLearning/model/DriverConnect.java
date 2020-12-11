package servletsLearning.model;/* package Model.JDBC;

import Project.*;
import java.sql.*;

public final class DriverConnect {
  static final String USERNAME = "root";
  static final String PASSWORD = "503911";
  static final String URL = "jdbc:mysql://localhost:3306/belhard";
  //   public Connection connection;

  public static String getUSERNAME() {
      return USERNAME;
  }

  public static String getPASSWORD() {
      return PASSWORD;
  }

  public static String getURL() {
      return URL;
  }

  public DriverConnect() {
  }
}

  /*   public Connection getConnn() {
      return connection;
  }



  Connection connection = null;
  Driver driver;

      try {
          driver = new com.mysql.cj.jdbc.Driver();
          DriverManager.registerDriver(driver);
      } catch (SQLException ex) {
          System.out.println("Прозошла ошибка установки драйвера.");
          return;}

      }

      finally {
          if (connection != null) {
              try {
                  connection.close();
              } catch (SQLException e) {
                  System.err.println("Не удалось закрыть соединение: " + e);
              }
          }
      }
  }*/



