package com.company;

import java.awt.event.*;
import java.awt.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.Timer;

class Layout implements ActionListener {

    JFrame fr;
    private JLabel title,id,pass,warning;
    private JButton li,regis;
    private JTextField tid,tpass;
    private Container c;

    Layout()
    {
        fr = new JFrame("LogIn Page ");
        fr.setFont(new Font("Cambria", Font.PLAIN, 15));
        fr.setResizable(false);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setBackground(Color.lightGray);

        c = fr.getContentPane();
        c.setLayout(null);

        c = fr.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        title = new JLabel("Sign UP  ");
        title.setFont(new Font("Cambria",Font.PLAIN,30));
        title.setSize(300,50);
        title.setLocation(330,75);
        c.add(title);

        id = new JLabel("UNIQUE ID :");
        id.setFont(new Font("Cambria",Font.PLAIN,17));
        id.setSize(90,50);
        id.setLocation(210,170);
        c.add(id);

        tid = new JTextField();
        tid.setFont(new Font("Cambria",Font.PLAIN,14));
        tid.setSize(130,20);
        tid.setLocation(325,188);
        c.add(tid);

        pass = new JLabel("PASSWORD :");
        pass.setFont(new Font("Cambria",Font.PLAIN,17));
        pass.setSize(100,50);
        pass.setLocation(210,210);
        c.add(pass);

        tpass = new JTextField();
        tpass.setFont(new Font("Cambria",Font.PLAIN,14));
        tpass.setSize(130,20);
        tpass.setLocation(325,228);
        c.add(tpass);

        li = new JButton("Sign In");
        li.setSize(80,25);
        li.setFont(new Font("Cambria",Font.PLAIN,15));
        li.setLocation(410,300);
        li.addActionListener(this);
        c.add(li);

        regis = new JButton("Register Here");
        regis.setSize(150,25);
        regis.setFont(new Font("Cambria",Font.PLAIN,15));
        regis.setLocation(220,300);
        regis.addActionListener(this);
        c.add(regis);

        fr.setVisible(true);
        fr.setSize(870, 650);
        fr.setLayout(null);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s1,s2;
        if(e.getSource()==li)
        {

        }
        else if(e.getSource()==regis)
        {
            new Registration();
        }
    }

    class Registration extends JFrame implements ActionListener{

        JFrame rf;
        private JLabel title1,shname,owname,id,pass,cpass,line,line1,line2,line3,stype,output,alert1,alert2,alert3;
        private JTextField tshname,towname,tid,tpass,tcpass;
        private JTextArea taoutput;
        private JButton re,next;
        private String[] optionToChoose = {"NONE","Grocery Store","Retail Store","Medical Store"};
        private JCheckBox tnc;
        private JComboBox bxstype;
        private Container c;
        String data;

        Registration()
        {
            rf = new JFrame("Registration Page");
            rf.setFont(new Font("Cambria", Font.PLAIN, 15));
            rf.setResizable(false);
            rf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            rf.setBackground(Color.lightGray);

            c = rf.getContentPane();
            c.setLayout(null);

            c = rf.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.cyan);

            line = new JLabel("--------------------------------------------------------------------------------------");
            line.setFont(new Font("Verdana", Font.PLAIN, 30));
            line.setSize(2200,10);
            line.setLocation(0,50);
            c.add(line);

            line1 = new JLabel("--------------------------------------------------------------------------------------");
            line1.setFont(new Font("Verdana", Font.PLAIN, 30));
            line1.setSize(2200,10);
            line1.setLocation(0,65);
            c.add(line1);

            line2 = new JLabel("--------------------------------------------------------------------------------------");
            line2.setFont(new Font("Verdana", Font.PLAIN, 30));
            line2.setSize(2200,10);
            line2.setLocation(0,120);
            c.add(line2);

            line3 = new JLabel("--------------------------------------------------------------------------------------");
            line3.setFont(new Font("Verdana", Font.PLAIN, 30));
            line3.setSize(2200,10);
            line3.setLocation(0,135);
            c.add(line3);

            title1  = new JLabel("Shop Registration Details");
            title1.setFont(new Font("Cambria",Font.PLAIN,30));
            title1.setSize(350,50);
            title1.setLocation(265,75);
            c.add(title1);

            shname = new JLabel("Shop Name :");
            shname.setFont(new Font("Cambria",Font.PLAIN,16));
            shname.setSize(90,20);
            shname.setLocation(48,210);
            c.add(shname);

            tshname = new JTextField();
            tshname.setFont(new Font("Cambria",Font.PLAIN,15));
            tshname.setSize(175,20);
            tshname.setLocation(195,212);
            c.add(tshname);

            owname = new JLabel("Owner Name :");
            owname.setFont(new Font("Cambria",Font.PLAIN,16));
            owname.setSize(97,20);
            owname.setLocation(48,250);
            c.add(owname);

            towname = new JTextField();
            towname.setFont(new Font("Cambria",Font.PLAIN,15));
            towname.setSize(175,20);
            towname.setLocation(195,252);
            c.add(towname);

            id = new JLabel("Unique ID :");
            id.setFont(new Font("Cambria",Font.PLAIN,16));
            id.setSize(97,20);
            id.setLocation(48,290);
            c.add(id);

            tid = new JTextField();
            tid.setFont(new Font("Cambria",Font.PLAIN,15));
            tid.setSize(175,20);
            tid.setLocation(195,292);
            c.add(tid);

            pass = new JLabel("Password :");
            pass.setFont(new Font("Cambria",Font.PLAIN,16));
            pass.setSize(97,20);
            pass.setLocation(48,330);
            c.add(pass);

            tpass = new JTextField();
            tpass.setFont(new Font("Cambria",Font.PLAIN,15));
            tpass.setSize(175,20);
            tpass.setLocation(195,332);
            c.add(tpass);

            cpass = new JLabel("Conform Password :");
            cpass.setFont(new Font("Cambria",Font.PLAIN,16));
            cpass.setSize(140,20);
            cpass.setLocation(48,370);
            c.add(cpass);

            tcpass = new JTextField();
            tcpass.setFont(new Font("Cambria",Font.PLAIN,15));
            tcpass.setSize(175,20);
            tcpass.setLocation(195,372);
            c.add(tcpass);

            stype = new JLabel("Shop Type :");
            stype.setFont(new Font("Cambria",Font.PLAIN,16));
            stype.setSize(80,20);
            stype.setLocation(48,410);
            c.add(stype);

            bxstype = new JComboBox(optionToChoose);
            bxstype.setBounds(195,412,120,20);
            bxstype.setFont(new Font("Cambria",Font.PLAIN,15));
            c.add(bxstype);

            tnc = new JCheckBox("I here by, Accept The Terms and Conditions.");
            tnc.setFont(new Font("Slab Serif",Font.PLAIN,14));
            tnc.setSize(310,20);
            tnc.setLocation(60,470);
            c.add(tnc);

            re = new JButton("Register");
            re.setFont(new Font("Cambria",Font.PLAIN,16));
            re.setSize(100,19);
            re.setLocation(58,500);
            re.addActionListener(this);
            c.add(re);

            output = new JLabel("Details Conformation");
            output.setFont(new Font("Cambria",Font.BOLD,17));
            output.setSize(180,20);
            output.setLocation(543,190);
            c.add(output);

            taoutput = new JTextArea();
            taoutput.setFont(new Font("Cambria",Font.BOLD,17));
            taoutput.setSize(300,350);
            taoutput.setLocation(483,225);
            taoutput.setLineWrap(true);
            taoutput.setEditable(false);
            c.add(taoutput);

            next = new JButton("NEXT");
            next.setFont(new Font("Cambria",Font.PLAIN,14));
            next.setSize(80,18);
            next.setLocation(690,583);
            next.addActionListener(this);
            c.add(next);

            alert1 = new JLabel("");
            alert1.setFont(new Font("Cambria",Font.BOLD,17));
            alert1.setSize(270,20);
            alert1.setLocation(70,550);
            c.add(alert1);

            alert2 = new JLabel("");
            alert2.setFont(new Font("Cambria",Font.BOLD,17));
            alert2.setSize(270,20);
            alert2.setLocation(70,550);
            c.add(alert2);

            alert3 = new JLabel("");
            alert3.setFont(new Font("Cambria",Font.BOLD,17));
            alert3.setSize(270,20);
            alert3.setLocation(70,550);
            c.add(alert3);

            rf.setVisible(true);
            rf.setSize(870, 650);
            rf.setLayout(null);
        }
        public void actionPerformed(ActionEvent e)
        {
            String temp1 , temp2;

            temp1 = tpass.getText();
            temp2 = tcpass.getText();

            if(e.getSource()==re) {
                if (tnc.isSelected()) {
                    if (Objects.equals(temp1,temp2))
                    {
                        data = "Shop Name : " + tshname.getText() + "\nOwner Name : " + towname.getText() + "\nUnique ID : " + tid.getText() + "\nShop Type : " + bxstype.getSelectedItem();
                        alert1.setText("Registration Successful !");
                    }
                    else
                    {
                        alert2.setText("Please Check The Password");
                    }
                }
                else
                    alert3.setText("Please Accept the Terms & Condition.");
                taoutput.setText(data);
            }

        }
    }


    public static void main(String[] args) {
        new Layout();
    }
}