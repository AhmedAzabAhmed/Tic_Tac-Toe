package design;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AyaFathy
 */
public class DB {

    Connection con;
    PreparedStatement stmt, stmt3;
    //PreparedStatement stmt2;
    String queryString;
    PreparedStatement st;
    String query, getIdfromDB, id;
    ResultSet rs, res;
    String strDate;
    String[] db = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public DB() {
    }

    void OpenConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "root");
            queryString = "INSERT INTO reply (cell1,cell2 ,cell3 ,cell4 ,cell5 ,cell6 ,"
                    + "cell7 ,cell8 ,cell9 ,fkid ,Date_Time ) " + "VALUES (? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?);";
            stmt = con.prepareStatement(queryString);
            //stmt2 = con.prepareStatement(queryString);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void FillStmt(String[] db, String s) {

        try {
            for (int i = 0; i < 9; i++) {
                stmt.setString(i + 1, db[i]);
                // stmt2.setString(i + 1, db[i]);
            }
            ///////to get the date and time now                
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            strDate = formatter.format(date);
            stmt.setString(11, strDate);
            stmt.setInt(10, getId(s));
            //stmt2.setString(11, strDate);
            //stmt2.setInt(10, getId(s));
            System.out.println(strDate);
            stmt.execute();
            //stmt2.execute();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int getId(String s) {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "root");
            query = "SELECT id from game.player "
                    + "where username='" + s + "';";
            st = con.prepareStatement(query);
            rs = st.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        int z = 0;
        try {
            if (rs.next()) {
                z = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return z;
    }

    String[] Retrieve(String usr, String myDate) {
        int z = getId(usr);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "root");
            query = "SELECT cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8,cell9 "
                    + "from reply where Date_Time='" + myDate + "' and fkid = "+z+";";
            st = con.prepareStatement(query);
            rs = st.executeQuery(query);
            while (rs.next()) {
                db[0] = rs.getString("cell1");
                db[1] = rs.getString("cell2");
                db[2] = rs.getString("cell3");

                db[3] = rs.getString("cell4");
                db[4] = rs.getString("cell5");
                db[5] = rs.getString("cell6");

                db[6] = rs.getString("cell7");
                db[7] = rs.getString("cell8");
                db[8] = rs.getString("cell9");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return db;
    }
    //retrieve Dates
    ArrayList<String> retrieveDates(String user) {
        int z = getId(user);
        ArrayList<String> dates = new ArrayList<>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "root");
            query = "SELECT Date_Time "
                    + "from reply where fkid='" + z + "';";
            st = con.prepareStatement(query);
            rs = st.executeQuery(query);
            while (rs.next()) {
                dates.add(rs.getString("Date_Time"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dates;
    }
}
