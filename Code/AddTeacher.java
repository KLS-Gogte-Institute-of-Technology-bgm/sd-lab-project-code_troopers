package university.management.system;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.*;

class AddTeacher implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1,b2,b3;
    JComboBox c1,c2;

    
      
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
    
    String dt = new java.util.Date().toString();
    String lt = dt.substring(dt.length()-2);

    AddTeacher(){
        f = new JFrame("Add Teacher");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/fifth.jpg"));
        Image i3 = img.getImage().getScaledInstance(920, 600,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);

        id8 = new JLabel("New Teacher Details");
        id8.setBounds(320,5,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        id15.add(t7);

        id8= new JLabel("Class X(%)");
        id8.setBounds(400,300,130,30);
        id8.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id8);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        id15.add(t8);

        id9= new JLabel("Class XII(%)");
        id9.setBounds(50,350,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id9);

        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        id15.add(t9);


        id10= new JLabel("Aadhar No");
        id10.setBounds(400,350,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        id15.add(t10);

        
        lab=new JLabel("Education");
        lab.setBounds(50,400,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab);
            
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200,400,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Department");
        lab2.setBounds(400,400,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(600,400,150,30);
        id15.add(c2);
        
        id11= new JLabel("Faculty id");
        id11.setBounds(400,450,150,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t11=new JTextField();
        t11.setText(lt+"F"+first);
        t11.setBounds(600,450,150,30);
        id15.add(t11);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        b2=new JButton("Get Password");   
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(350,600,150,40);
        b2.setVisible(false);
        id15.add(b2);
        
        b2.addActionListener(this);
        
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
        f.getContentPane().setBackground(Color.WHITE);
    }
    
    //method to generate password randomly
 public static String generateRandomPassword(int len) {
	String chars ="jklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
 
 //method to generate login details n insert it into database
    void generatelogindetails(){
        try{
            conn cc= new conn();
            String username = t1.getText();
            String emp_id = t11.getText();
            String password = generateRandomPassword(5);
            
            String Query = "insert into f_login values('"+username+"','"+emp_id+"','"+password+"')";
            cc.s.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"password"+password);

        }
        catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    //creating file with f_id as filename
    void create (){
        try {
      File my = new File("C:\\Users\\D Deepak Prasanna\\Desktop\\Faculty Details\\"+t11.getText()+".txt");
      if(my.createNewFile()){
          String n1 = my.getAbsolutePath();
          copy(n1);
      }else{
          System.out.println("File exists");
      }    
      }
        catch(Exception e2){
            e2.printStackTrace();
    }
}
    
   //to copy faculty details in file
   void copy(String n11){
        try{
        FileWriter f2 = new FileWriter(n11);
        String a1=t1.getText();
        String bb1 = t2.getText();
        String cccc = t3.getText();
        String d1 = t4.getText();
        String e1 = t5.getText();
        String ff1 = t6.getText();
        String g1 = t7.getText();
        String h1 = t8.getText();
        String i1 = t9.getText();
        String j1 = t10.getText();
        String k1 = (String)c1.getSelectedItem();;
        String l1 = (String)c2.getSelectedItem();;
        //String m1 = t12.getText();
        String n1 = t11.getText();
        f2.write("Name: "+a1);f2.append("\n");
        f2.write("Father Name: "+bb1);f2.append("\n");
        f2.write("Age: "+cccc);f2.append("\n");
        f2.write("Date of Birth: "+d1);f2.append("\n");
        f2.write("Address: "+e1);f2.append("\n");
        f2.write("Phone: "+ff1);f2.append("\n");
        f2.write("Email: "+g1);f2.append("\n");
        f2.write("Class X: "+h1);f2.append("\n");
        f2.write("Class Xii: "+i1);f2.append("\n");
        f2.write("Adhaar Number: "+j1);f2.append("\n");
        f2.write("Education: "+k1);f2.append("\n");
        f2.write("Department: "+l1);f2.append("\n");
        //f2.write("USN: "+m1);f2.append("\n");
        f2.write("f_id: "+n1);f2.append("\n");
        
        f2.close();
        }catch(Exception e3){
            e3.printStackTrace();
        }
    }
    
    
    
    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = (String)c1.getSelectedItem();
        String l = t11.getText();
        String m = (String)c2.getSelectedItem();
        
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into faculty values('"+l+"','"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+m+"')";
                cc.s.executeUpdate(q);
                create();
                JOptionPane.showMessageDialog(null,"Teacher Details Inserted Successfully");
                f.setVisible(true);
                b2.setVisible(true);
                
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource()==b2){
         try{
            conn cc= new conn();
            String username = t1.getText();
            String f_id = t11.getText();
            String password = generateRandomPassword(5);
            String un = username.substring(0,5);
            String em = f_id.substring(3,7);
            String Query = "insert into f_login values('"+un+"','"+em+"','"+password+"')";
            cc.s.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"password: "+password);

        }
        catch(Exception eee){
            eee.printStackTrace();
        }   
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new Project().setVisible(true);
        }
    }
    public static void main(String[] arg){
        new AddTeacher().f.setVisible(true);
    }
}