package pizzashop;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


// RUYA BOZCAN
// COMPUTER ENGINEERING
// ABU


public class PizzaShop implements ActionListener {
    JButton b;
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    JRadioButton rb1,rb2,rb3;
    JRadioButton rb4,rb5,rb6;
    JTextArea tx1;
    PizzaShop() {
        JFrame f =new JFrame("Pizza Shop");
        JLabel l=new JLabel("Welcome To Home Style Pizza Shop");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(500,80);
        l.setForeground(Color.ORANGE);
        l.setFont(new Font("Verdana", Font.PLAIN, 25));

        cb1=new JCheckBox("Tomato");
        cb1.setBounds(50,100,150,50);

        cb2=new JCheckBox("Green pepper");
        cb2.setBounds(50,135,150,50);

        cb3=new JCheckBox("Black Olives");
        cb3.setBounds(50,170,150,50);

        cb4=new JCheckBox("Mushrooms");
        cb4.setBounds(50,205,150,50);

        cb5=new JCheckBox("Extra Cheese");
        cb5.setBounds(50,240,150,50);


        cb6=new JCheckBox("Pepproni");
        cb6.setBounds(50,275,150,50);

        cb7=new JCheckBox("Sausage");
        cb7.setBounds(50,310,150,50);

        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(""));
        panel.setBounds(40,80,200,300);
        panel.setBorder(BorderFactory.createLineBorder(Color.orange));

        JLabel l2=new JLabel("Each Topping $1.50");
        l2.setBounds(45,55,500,70);
        l2.setFont(new Font("Verdana", Font.PLAIN, 15));
        l2.setForeground(Color.orange);

        JLabel l3=new JLabel("Pizza Size");
        l3.setBounds(300,40,100,100);
        l3.setFont(new Font("Verdana", Font.PLAIN, 15));
        l3.setForeground(Color.orange);

        rb1=new JRadioButton("Small: $6.50");
        rb1.setBounds(310,100,150,50);

        rb2=new JRadioButton("Medium: $8.50");
        rb2.setBounds(310,140,150,50);

        rb3=new JRadioButton("Large: $10.00");
        rb3.setBounds(310,180,150,50);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        JPanel panel2=new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder(""));
        panel2.setBounds(280,80,185,180);
        panel2.setBorder(BorderFactory.createLineBorder(Color.orange));

        JLabel l4=new JLabel("Pizza Type");
        l4.setBounds(520,40,100,100);
        l4.setFont(new Font("Verdana", Font.PLAIN, 15));
        l4.setForeground(Color.orange);

        rb4=new JRadioButton("Thin Crust");
        rb4.setBounds(520,100,150,50);

        rb5=new JRadioButton("Medium Crust");
        rb5.setBounds(520,140,150,50);

        rb6=new JRadioButton("Pan");
        rb6.setBounds(520,180,150,50);

        ButtonGroup bg2=new ButtonGroup();
        bg2.add(rb4);
        bg2.add(rb5);
        bg2.add(rb6);

        JPanel panel3=new JPanel();
        panel3.setBorder(BorderFactory.createTitledBorder(""));
        panel3.setBounds(500,80,185,180);
        panel3.setBorder(BorderFactory.createLineBorder(Color.orange));

        b=new JButton("Process Selection");
        b.setBounds(280,300,250,40);
        b.addActionListener(this);

        JLabel l5=new JLabel("Your order: ");
        l5.setBounds(50,350,100,100);

        tx1=new JTextArea();
        tx1.setBounds(50,420,500,150);

        f.add(l);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        f.add(cb6);
        f.add(cb7);
        f.add(l2);
        f.add(l3);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(l4);
        f.add(rb4);
        f.add(rb5);
        f.add(rb6);
        f.add(b);
        f.add(l5);


        f.add(panel);
        f.add(panel2);
        f.add(panel3);
        f.add(tx1);


        f.setSize(750,650);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        double amount=0;
        String text="";

        if(rb4.isSelected()){
            text="Pizza Type: Thin Crust\n";

        }
        else if(rb5.isSelected()){
            text="Pizza Type: Medium Crust\n";
        }
        else if(rb6.isSelected()){

            text="Pizza Type: Pan\n";
        }



        if(rb1.isSelected()){
            amount+=6.50;
            text+="Pizza Size: Small\n";
        }
        else if(rb2.isSelected()){
            amount+=8.50;
            text+="Pizza Size: Medium\n";
        }
        else if(rb3.isSelected()){
            amount+=10.00;
            text+="Pizza Size: Large\n";
        }


        text+="Toppings: ";
        if(cb1.isSelected()){
            amount+=1.50;
            text+="tomato,";
        }
        if(cb2.isSelected()){
            amount+=1.50;
            text+="green pepper,";
        }
        if(cb3.isSelected()){
            amount+=1.50;
            text+="black olives,";
        }
        if(cb4.isSelected()){
            amount+=1.50;
            text+="mushrooms,";
        }
        if(cb5.isSelected()){
            amount+=1.50;
            text+="extra cheese";
        }
        if(cb6.isSelected()){
            amount+=1.50;
            text+="pepproni,";
        }
        if(cb7.isSelected()){
            amount+=1.50;
            text+="sausage,";
        }
        text+="\n";
        text+="Amount due: "+amount;
        tx1.setText(text);

    }



    public static void main(String[] args) {
        new PizzaShop();
    }

}

// RUYA BOZCAN
// COMPUTER ENGINEERING
// ABU