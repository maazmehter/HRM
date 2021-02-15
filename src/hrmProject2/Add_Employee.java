package hrmProject2;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.text.JTextComponent;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.sqlite.core.DB;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.JCalendarDemo;

import org.jdatepicker.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Add_Employee extends JFrame implements ActionListener,ItemListener{

	JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    JButton b,b1,b2,b3;
    static JComboBox c1;
    static String i;
    JDateChooser date_chooser;

    Add_Employee(int i){}
   
    Add_Employee(){

        f = new JFrame("Add Employee");
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon("add employee.jpg");
        id15.setIcon(img);

        id8 = new JLabel("New Employee Details");
        id8.setBounds(320,30,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);


        id1 = new JLabel("Name*");
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

        id3= new JLabel("Age*");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        id15.add(t3);

        id4= new JLabel("Date Of Birth*"); 
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        date_chooser=new JDateChooser(); //Change Number 2
        date_chooser.setFont(new Font("serif",Font.PLAIN,20)); //Change Number 3
        date_chooser.setBounds(600,200,150,30); //Change Number 4
        date_chooser.setDateFormatString("yyyy-MM-dd"); //Change Number 5
        id15.add(date_chooser); //Change Number 6

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

        id9= new JLabel("Education");
        id9.setBounds(400,300,100,30);
        id9.setFont(new Font("serif",Font.BOLD,20));   
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        id15.add(t8);

        
        id10= new JLabel("Job Post");
        id10.setBounds(50,350,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);

		/*
		 * t9=new JTextField(); t9.setBounds(200,350,150,30); id15.add(t9);
		 */
        String title[]  = {null,"Manager", "Senior Staff", "Junior Staff", "Intern"};
        
        c1 = new JComboBox(title);
        c1.setBounds(200,350,150,30);
        c1.setVisible(true);
        c1.setSelectedIndex(0);
        c1.addItemListener(this);        
        id15.add(c1);
        
        

		
		/*
		 * id11= new JLabel("Work hours"); id11.setBounds(400,350,100,30);
		 * id11.setFont(new Font("serif",Font.BOLD,20)); id15.add(id11);
		 * 
		 * 
		 * 
		 * t10=new JTextField(); t10.setBounds(600,350,150,30); id15.add(t10);
		 */
		 

        id12= new JLabel("Employee Id*");
        id12.setBounds(400,350,140,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();  
        t11.setBounds(600,350,150,30);
        id15.add(t11);

//New code starts

        id8 = new JLabel("Employee Salary Details");
        id8.setBounds(50,400,500,50);
        id8.setFont(new Font("serif",Font.BOLD,20));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);
        
        id16= new JLabel("Basic");
        id16.setBounds(50,470,150,30);
        id16.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id16);

        t15=new JTextField();
        t15.setBounds(200,470,150,30);
        id15.add(t15);
        
        id13= new JLabel("HRA");
        id13.setBounds(400,470,150,30);
        id13.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id13);

        t12=new JTextField();  
        t12.setBounds(600,470,150,30);
        id15.add(t12);


        id14= new JLabel("Conveyance");
        id14.setBounds(50,530,150,30);
        id14.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id14);

        t13=new JTextField();
        t13.setBounds(200,530,150,30);
        id15.add(t13);
        
        id12= new JLabel("Deduction");
        id12.setBounds(400,530,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t14=new JTextField();  
        t14.setBounds(600,530,150,30);
        id15.add(t14);

        
  //ends here     

        lab=new JLabel();
        lab.setBounds(200,450,250,200);
        id15.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        id15.add(lab1);

        b = new JButton("Submit");
        b.setBounds(250,600,150,40);
        b.setFont(new Font("serif",Font.BOLD,15));
       
        id15.add(b);

        b1=new JButton("Cancel");  
        b1.setBounds(450,600,150,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
       
        id15.add(b1);
       
        b.addActionListener(this);
        b1.addActionListener(this);
       
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
       
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd"); //Change Number 7
        String d=df.format(date_chooser.getDate()); //Change Number 8
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        //String i = t9.getText();
        String j = t11.getText(); 
        String k = t15.getText();
        String l = t12.getText();
        String m = t13.getText();
        String n = t14.getText();
        int o =Integer.parseInt(t15.getText())+Integer.parseInt(t12.getText())+Integer.parseInt(t13.getText())-Integer.parseInt(t14.getText());   
        if(ae.getSource() == b){
        	if(a.isEmpty() || c.isEmpty() || k.isEmpty() || d.isBlank())
        	{
        		JOptionPane.showMessageDialog(null,"Enter the mandatory fields","Error",JOptionPane.ERROR_MESSAGE);
        	}
        	else {
            try{
                connect cc = new connect();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            	LocalDate localDate = LocalDate.now();
            	
                String q = "insert into employee values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"')";
                String r1 = "insert into salarydetails values('"+j+"','January','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r2 = "insert into salarydetails values('"+j+"','February','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r3 = "insert into salarydetails values('"+j+"','March','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r4 = "insert into salarydetails values('"+j+"','April','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r5 = "insert into salarydetails values('"+j+"','May','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r6 = "insert into salarydetails values('"+j+"','June','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r7 = "insert into salarydetails values('"+j+"','July','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r8 = "insert into salarydetails values('"+j+"','Aug','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r9 = "insert into salarydetails values('"+j+"','September','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r10 = "insert into salarydetails values('"+j+"','October','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r11 = "insert into salarydetails values('"+j+"','November','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";
                String r12 = "insert into salarydetails values('"+j+"','December','"+k+"','"+n+"','"+o+"','"+dtf.format(localDate)+"','"+l+"','"+m+"')";                  
          
               
                cc.s.executeUpdate(q);
                cc.s.executeUpdate(r1);
                cc.s.executeUpdate(r2);
                cc.s.executeUpdate(r3);
                cc.s.executeUpdate(r4);
                cc.s.executeUpdate(r5);
                cc.s.executeUpdate(r6);
                cc.s.executeUpdate(r7);
                cc.s.executeUpdate(r8);
                cc.s.executeUpdate(r9);
                cc.s.executeUpdate(r10);
                cc.s.executeUpdate(r11);
                cc.s.executeUpdate(r12);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
 //cc.s.executeUpdate(r12);   
 //JOptionPane.showMessageDialog(null,"Details Successfully Inserted");                
f.setVisible(false);
                new details();
                cc.disconnect();
            }catch(SQLException ee){
            	JOptionPane.showMessageDialog(null,ee.getMessage());
            }
        	}
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new details();
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
        new Add_Employee();
    }
}
