package university.management.system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Old_password implements ActionListener{
    JFrame f;
    JTextField t1;
    JPasswordField t2;
    JLabel l1,l2,l3;
    JButton b1,b2;
    
    Old_password(String text){
        f=new JFrame("Old Password");

        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,120,30);
        f.add(l1);
        
        l2 = new JLabel("Code");
        l2.setBounds(40,70,120,30);
        f.add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        f.add(t1);
        t1.setText(text);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        f.add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon5.png"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        f.add(l3);


        b1 = new JButton("Submit");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        b2 = new JButton("Login");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        f.add(b2);

        f.setVisible(true);
        f.setSize(600,300);
        f.setLocation(400,300);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        f.setVisible(true);
      
        try{
            //connecting to database and retreving password from database
            conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
            String password = "";
            
            String q = "select password from login where username='"+u+"' and Code='"+v+"'";
            ResultSet rs = c1.s.executeQuery(q); 
            while(rs.next()){
                password = rs.getString("password"); //storing password in String named password
                JOptionPane.showMessageDialog(null,"password: "+password);
            }
            //displaying password
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            //connecting to database and retreving password from database
            conn c2 = new conn();
            String u2 = t1.getText();
            String v2 = t2.getText();
            String password = "";
            
            String q2 = "select password from f_login where name='"+u2+"' and emp_id='"+v2+"'";
            ResultSet rs2 = c2.s.executeQuery(q2); 
            while(rs2.next()){
                password = rs2.getString("password"); //storing password in String named password
                JOptionPane.showMessageDialog(null,"password: "+password);
            }
            //displaying password
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new Login();
        }
}  
    
    public static void main(String args[]){
        Old_password n = new Old_password("");
    }
}