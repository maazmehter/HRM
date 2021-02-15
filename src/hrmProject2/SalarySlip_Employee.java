package hrmProject2;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;



public class SalarySlip_Employee implements ActionListener,ItemListener{
	JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
    static JComboBox c1;
    static String i;

    SalarySlip_Employee(int i){}
   
    SalarySlip_Employee(){
        f = new JFrame("Salary Slips");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img=new ImageIcon("add employee.jpg");
        id15.setIcon(img);

        id8 = new JLabel("Generate Employee Salary Slip");
        id8.setBounds(320,30,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);


        id1 = new JLabel("Employee ID");
        id1.setBounds(50,150,150,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id15.add(t1);

        id2 = new JLabel("Month");
        id2.setBounds(50,200,100,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        //t2=new JTextField();
        //t2.setBounds(200,200,150,30);
        //id15.add(t2);
        
        String title[]  = { "January", "February", "March", "April","May", "June", "July", "August", "September", "October", "November", "December"};
        
        c1 = new JComboBox(title);
        c1.setBounds(200,200,150,30);
        //c1.setBounds(200,350,150,30);
        c1.setVisible(true);
        c1.setSelectedIndex(0);
        c1.addItemListener(this);   
        id15.add(c1);

        
        b = new JButton("Generate Slip");

        b.setBounds(250,400,150,40);
       
        id15.add(b);

        b1=new JButton("Cancel");  

        b1.setBounds(450,400,150,40);
       
        id15.add(b1);
       
        b.addActionListener(this);
        b1.addActionListener(this);
       
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            SalarySlipDetails p=new SalarySlipDetails(t1.getText(),c1.getSelectedItem().toString());
        }

    }
    public void itemStateChanged(ItemEvent e) 
    { 
        // if the state combobox is changed 
    	if(e.getSource()==c1) {
    		i = c1.getSelectedItem().toString();
        }
    }
    public static void main(String[ ] arg){
        new SalarySlip_Employee();
    }
}
