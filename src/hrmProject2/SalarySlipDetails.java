package hrmProject2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SalarySlipDetails implements ActionListener{
	JFrame f;
    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,aid8,aid9,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
    String emp_id,name,position,month,basic,hra,conveyance,deduction,netsalary,issuedate,education,post;
    JButton b1,b2;
    ImageIcon icon;

    SalarySlipDetails(String e_id, String mon){
        try{
            connect con = new connect();
            String str = "select * from salarydetails s,employee e where s.emp_id=e.emp_id and s.emp_id= '"+e_id+"' and s.month='"+mon+"'";
            ResultSet rs= con.s.executeQuery(str);
    
            while(rs.next()){

              
                name = rs.getString("name");
                post = rs.getString("post");
                month = rs.getString("month");
                basic = rs.getString("basic");
                hra = rs.getString("hra");
                conveyance = rs.getString("conveyance");
                deduction = rs.getString("deduction");
                netsalary = rs.getString("netsalary");
                issuedate = rs.getString("issuedate");
                education = rs.getString("education");
                post = rs.getString("post");
                emp_id = rs.getString("emp_id");
                
            }
            con.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }

        f=new JFrame("Print Data");
        f.setVisible(true);
        f.setSize(595,642);
        f.setLocation(450,200);
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        id9=new JLabel();
        id9.setBounds(0,0,700,642);    
        id9.setLayout(null);
        ImageIcon img=new ImageIcon("add employee.jpg");
        id9.setIcon(img);

        id8 = new JLabel("Auto Generated Salary Details");
        id8.setBounds(50,10,350,30);
        f.add(id8);
        id8.setFont(new Font("serif",Font.BOLD,25));
        id9.add(id8);
        f.add(id9);

        id = new JLabel("Employee Id:");
        id.setBounds(50,70,120,30);
        id.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id);

        aid = new JLabel(emp_id);
        aid.setBounds(200,70,200,30);
        aid.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid);

        id1 = new JLabel("Name:");
        id1.setBounds(50,120,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id1);

        aid1 = new JLabel(name);
        aid1.setBounds(200,120,300,30);
        aid1.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid1);

 
        id2 = new JLabel("Position:");
        id2.setBounds(50,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id2);

        aid2 = new JLabel(post);
        aid2.setBounds(200,170,300,30);
        aid2.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid2);

        id3= new JLabel("Salary Month:");
        id3.setBounds(50,220,150,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id3);

        aid3= new JLabel(month);
        aid3.setBounds(200,220,300,30);
        aid3.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid3);


        id4= new JLabel("Basic:"); 
        id4.setBounds(50,270,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id4);

        aid4= new JLabel(basic);
        aid4.setBounds(200,270,300,30);
        aid4.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid4);

       
        id5= new JLabel("HRA:");
        id5.setBounds(50,320,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id5);

        aid5= new JLabel(hra);
        aid5.setBounds(200,320,300,30);
        aid5.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid5);

       
        id6= new JLabel("Conveyance:");
        id6.setBounds(50,370,150,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id6);

        aid6= new JLabel(conveyance);
        aid6.setBounds(200,370,300,30);
        aid6.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid6);


        id7= new JLabel("Deduction:");
        id7.setBounds(50,420,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id7);

        aid7= new JLabel(deduction);
        aid7.setBounds(200,420,300,30);
        aid7.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid7);
        
        id8= new JLabel("Net Salary:");
        id8.setBounds(400,150,150,30);
        id8.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id8);

        aid8= new JLabel(netsalary);
        aid8.setBounds(500,150,150,30);
        aid8.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid8);
        
        id10= new JLabel("Issue Date:");
        id10.setBounds(400,200,150,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id10);

        aid9= new JLabel(issuedate);
        aid9.setBounds(500,200,150,30);
        aid9.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid9);

       
        b1=new JButton("Print");
        b1.setBounds(100,520,100,30);
        b1.addActionListener(this);
        id9.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(250,520,100,30);
        b2.addActionListener(this);
        id9.add(b2);


    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
            
        }
    }
    public static void main(String[] args){
        new SalarySlipDetails("Salary Slip Details","Salary Slip Details");
    }

}
