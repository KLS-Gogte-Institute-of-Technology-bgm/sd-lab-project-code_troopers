package university.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class StudentFeeForm extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;
    Choice c1;
    String name,fname,course,branch;

    public static void main(String[] args) {
        new StudentFeeForm().setVisible(true);
    }


    public StudentFeeForm() {
        super("Student Fee Form");
	setBounds(700, 200, 550, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
	c1 = new Choice();
        c1.setForeground(new Color(47, 79, 79));
	c1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon7.png"));
        Image i2 = i1.getImage().getScaledInstance(75,150,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(370,100,150,150);
        add(l10);
        
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                c1.add(rs.getString("rollno"));
            }
        }catch(Exception e) { }
        
	JLabel l1 = new JLabel("Select Roll No");
	l1.setForeground(new Color(25, 25, 112));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(64, 63, 102, 22);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(25, 25, 112));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(64, 97, 102, 22);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Father's Name");
	l3.setForeground(new Color(25, 25, 112));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(64, 130, 102, 22);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Branch");
	l4.setForeground(new Color(25, 25, 112));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(64, 209, 102, 22);
	contentPane.add(l4);

        JLabel l5 = new JLabel("Semester");
	l5.setForeground(new Color(25, 25, 112));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(64, 242, 102, 22);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Total Payable");
	l6.setForeground(new Color(25, 25, 112));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(64, 275, 102, 22);
	contentPane.add(l6);

	c1.setBounds(174, 66, 156, 20);
	contentPane.add(c1);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(174, 100, 156, 20);
	contentPane.add(t2);

	t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(174, 133, 156, 20);
	contentPane.add(t3);
        
        
        t4 = new JTextField();
        t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(176, 211, 156, 20);
	contentPane.add(t4);

        
        

	comboBox_2 = new JComboBox();
	comboBox_2.setModel(
			new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
	comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox_2.setForeground(new Color(47, 79, 79));
	comboBox_2.setBounds(176, 244, 154, 20);
	contentPane.add(comboBox_2);
        
        t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setColumns(10);
	t1.setBounds(176, 275, 154, 20);
        add(t1);
        
	b1 = new JButton("Set Details");
	b1.addActionListener(this);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Pay");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	JLabel l7 = new JLabel("Course");
	l7.setForeground(new Color(25, 25, 112));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(64, 173, 102, 22);
	contentPane.add(l7);


        t5 = new JTextField();
        t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(176, 176, 156, 20);
	contentPane.add(t5);

        
	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Fee-Form",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
	panel.setBackground(new Color(211, 211, 211));
	panel.setBounds(10, 38, 358, 348);
        
        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        
	contentPane.add(panel);

    }
    
    void setDetails(){
        try{
        conn co = new conn();
        String Query = "select Name,fathers_name,course,branch from student where rollno='"+c1.getSelectedItem()+"'";
        ResultSet result = co.s.executeQuery(Query);
        while(result.next()){
            name = result.getString("name");
            fname = result.getString("fathers_name");
            course = result.getString("course");
            branch = result.getString("branch");
            
            t3.setText(fname);
            t2.setText(name);
            t4.setText(course);
            t5.setText(branch);
            
        }
        
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b2){
                try{
                conn con = new conn();
                String sql = "insert into fee(rollno, name, fathers_name, course, branch, semester, fee_paid) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, c1.getSelectedItem());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, (String) t4.getText());
		st.setString(5, (String) t5.getText());
		st.setString(6, (String) comboBox_2.getSelectedItem());
		st.setString(7, t1.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Paid");
                    this.setVisible(false);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == b1){
               // this.setVisible(false);
                setDetails();
            }
        }catch(Exception e){
            
        }
    }
}

