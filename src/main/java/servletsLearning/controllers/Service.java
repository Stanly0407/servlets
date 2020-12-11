package servletsLearning.controllers;

import servletsLearning.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Service {

    static final String URL = "jdbc:mysql://localhost:3306/belhard";
    static final String USERNAME = "root";
    static final String PASSWORD = "503911";

    public boolean checkUser(String emailOut) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                String sql = "SELECT * FROM user WHERE email=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, emailOut);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {
                        return true;}
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }

    public void addUser (String name, String emailOut, String password) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
                String sql = "INSERT INTO user value (null, ?, ?, ?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, emailOut);
                    preparedStatement.setString(3, password);
                    preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);}
    }


    public static List<User> getAllUsers () {
        List<User> users = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    String email = resultSet.getString(3);
                    String password = resultSet.getString(3);
                    User user = new User(id, name, email, password);
                    users.add(user);
                    System.out.println(users);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return users;

    }

}





 /*      public void deleteUser (String emailOut) {               ПЕРЕДЕЛАТЬ
        try{Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
                String sql = "DELETE FROM user WHERE email = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, emailOut);
                    preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);}
    }



 ЧЕРЕЗ КОЛЛЕКЦИЮ вместо JDBC
   public Service() {

      Model.users = new ArrayList<User>();
  }
  public static boolean checkUser(String name, String password) {

     for (User u : users) {
          if (u.getName().equals(name) && u.getPassword().equals(password)) {
             return true;
          }
     }
     return false;
    }



    public static User getUser(String name, String password) {
        for (User u : users) {
            if (u.getName().equals(name) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public static void deleteUser(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                users.remove(u);
                break;
            }
        }
    }

    public static ArrayList<User> getAllUsers() {
        return users;
    }


   Model model = new Model();
  public User addToModel(String name, String password, String useremail) {
        User user = new User(name, password, useremail);
        checkModel(user); //проверяем уникальность
        if (user.equals(null)) {
            return user;
        } else {
            model.Users.add(user);
            return user;}    }

    public User checkModel(User user) {
        if (model.Users.contains(user)) {
            user = null;
            return user;
        } else {
            return user;
        }}

     */






