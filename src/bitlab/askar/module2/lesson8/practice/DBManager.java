package bitlab.askar.module2.lesson8.practice;

import bitlab.askar.module2.lesson8.Database;
import bitlab.askar.module2.lesson8.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {

    private static DBManager db = new DBManager();
    private Connection connection;

    public static DBManager getDb(){
        return db;
    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bitlab_bd4?useUnicode=true&serverTimezone=UTC", "root", ""
            );
            System.out.println("CONNECTED");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Item> getAllItems(){
        ArrayList<Item> items = new ArrayList<>();

        try{
            PreparedStatement st = connection.prepareStatement("SELECT * FROM items");
            ResultSet rs = st.executeQuery();

            while (rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                items.add(new Item(id,name,price));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return items;
    }

    public void addItem(Item item){
        try {
            PreparedStatement st = connection.prepareStatement("INSERT INTO `items`( `name`, `price`) VALUES (?,?)");
            st.setString(1, item.getName());
            st.setDouble(2, item.getPrice());
            st.executeUpdate();
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteItem(int id){
        try{
            PreparedStatement st = connection.prepareStatement("DELETE FROM items where id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
