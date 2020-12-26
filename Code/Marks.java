package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

   String code;
    JLabel l1,l2,l10,l11,l12,l13,l14;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5;
    String sub1,sub2,sub3,sub4,sub5,mar1,mar2,mar3,mar4,mar5;
    JButton button;
    
   
  // Marks(){}
   Marks(String roll){
       mark(roll);
       
       setSize(500,600);
        setLocation(100,100);
        setLayout(null);
        
        i1 = new JLabel("RESULT");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setBounds(125,10,300,70);
        add(i1);
        
        l1 = new JLabel("Subjects");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        add(l1);
        
        l2 = new JLabel("Marks");
        l2.setBounds(280,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,26));
        add(l2);
        
        l10 = new JLabel(sub1);
        l10.setBounds(80,170,150,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        add(l10);
        
        l11 = new JLabel(sub2);
        l11.setBounds(80,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        add(l11);
        
        l12 = new JLabel(sub3);
        l12.setBounds(80,310,150,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        add(l12);
        
        l13 = new JLabel(sub4);
        l13.setBounds(80,380,150,40);
        l13.setFont(new Font("serif",Font.BOLD,26));
        add(l13);
        
        l14 = new JLabel(sub5);
        l14.setBounds(80,450,150,40);
        l14.setFont(new Font("serif",Font.BOLD,26));
        add(l14);
        
        b1 = new JLabel(mar1);
        b1.setBounds(280,170,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,26));
        add(b1);
        
        b2 = new JLabel(mar2);
        b2.setBounds(280,240,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,26));
        add(b2);
        
        b3 = new JLabel(mar3);
        b3.setBounds(280,310,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,26));
        add(b3);
        
        b4 = new JLabel(mar4);
        b4.setBounds(280,380,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,26));
        add(b4);
        
        b5 = new JLabel(mar5);
        b5.setBounds(280,450,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,26));
        add(b5);
        
        
        
        button = new JButton("Print");
        button.setBounds(180,520,100,40);
        button.setFont(new Font("serif",Font.PLAIN,26));
        add(button,"South");
        
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
       
   }
   
   
   
   
   
   void getCode(String roll){
       try{
           conn c =new conn();
           String Query3 ="select s_code from student where rollno='"+roll+"'";
           ResultSet rs3 = c.s.executeQuery(Query3);
           while(rs3.next()){
                code = rs3.getString("s_code");
           }
           
       }
       catch(Exception ee){
           ee.printStackTrace();
       }
       
   }
 
   public void mark(String roll){
    try{
        
           conn c = new conn();
           getCode(roll);
           String Query ="select * from subject where s_code='"+code+"'";
           ResultSet rs1 = c.s.executeQuery(Query);
           if(rs1.next()){
               sub1=rs1.getString("subject1");
               sub2=rs1.getString("subject2");
               sub3=rs1.getString("subject3");
               sub4=rs1.getString("subject4");
               sub5=rs1.getString("subject5");
               
           }
            String Query2 ="select * from marks where rollno='"+roll+"'";
           ResultSet rs2 = c.s.executeQuery(Query2);
           
           if(rs2.next()){
               mar1=rs2.getString("marks1");
               mar2=rs2.getString("marks2");
               mar3=rs2.getString("marks3");
               mar4=rs2.getString("marks4");
               mar5=rs2.getString("marks5");
               
           }
         
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   

   public static void main(String[] args){
       new Marks("String").setVisible(true);
   }
}