//Pascaline Shimwa 2305000057
package question1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GUIEmployee extends JFrame implements ActionListener {
	private TextField id_tf = new TextField();
    private TextField name_tf = new TextField();
    private TextField position_tf = new TextField();
    private Button insert_btn = new Button("Insert");
    private Button view_btn = new Button("View");
    private Button update_btn = new Button("Update");
    private Button delete_btn = new Button("Delete");
    private Connection connection;

    public GUIEmployee() {
        setTitle("Employee System");
        setLayout(null);
        setBounds(450, 200, 350, 300);
        setVisible(true);

        Label id_lb = new Label("ID:");
        Label name_lb = new Label("Name:");
        Label position_lb = new Label("Position:");

        id_lb.setBounds(30, 50, 80, 20);
        name_lb.setBounds(30, 80, 80, 20);
        position_lb.setBounds(30, 110, 80, 20);
        id_tf.setBounds(120, 50, 150, 20);
       name_tf.setBounds(120, 80, 150, 20);
        position_tf.setBounds(120, 110, 150, 20);
        insert_btn.setBounds(30, 150, 80, 30);
        view_btn.setBounds(120, 150, 80, 30);
        update_btn.setBounds(210, 150, 80, 30);
        delete_btn.setBounds(300, 150, 80, 30);

        add(id_lb);
        add(name_lb);
        add(position_lb);
        add(id_tf);
        add(name_tf);
        add(position_tf);
        add(insert_btn);
        add(view_btn);
        add(update_btn);
        add(delete_btn);

        insert_btn.addActionListener(this);
        view_btn.addActionListener(this);
        update_btn.addActionListener(this);
        delete_btn.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insert_btn) {
            insertRecord();
        } else if (e.getSource() == view_btn) {
            viewRecord();
        } else if (e.getSource() == update_btn) {
            updateRecord();
        } else if (e.getSource() == delete_btn) {
            deleteRecord();
        }
    }

    private void insertRecord() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "username", "password");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO employees (id, name, position) VALUES (?, ?, ?)");
            stmt.setInt(1, Integer.parseInt(id_tf.getText()));
            stmt.setString(2,name_tf.getText());
            stmt.setString(3, position_tf.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Inserted Successfully");
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void viewRecord() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "username", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees WHERE id=" + id_tf.getText());
            if (rs.next()) {
               name_tf.setText(rs.getString(2));
                position_tf.setText(rs.getString(3));
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found");
            }
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void updateRecord() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "username", "password");
            PreparedStatement stmt = con.prepareStatement("UPDATE employees SET name=?, position=? WHERE id=?");
            stmt.setString(1,name_tf.getText());
            stmt.setString(2, position_tf.getText());
            stmt.setInt(3, Integer.parseInt(id_tf.getText()));
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Record Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found");
            }
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void deleteRecord() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "username", "password");
            PreparedStatement stmt = con.prepareStatement("DELETE FROM employees WHERE id=?");
            stmt.setInt(1, Integer.parseInt(id_tf.getText()));
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
                id_tf.setText("");
               name_tf.setText("");
                position_tf.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found");
            }
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }


    public static void main(String[] args) {
        GUIEmployee emp= new GUIEmployee();
    }


		
	
    }