import javax.swing.*;
import java.awt.*;

class GRid extends JFrame{
    JButton btn7,btn8,btn9,btnstr,btn4,btn5,btn6,btndiv,btn1,btn2,btn3,btnadd,btn0,btnf,btneq,btnmi;

    GRid(){
        setSize(500,300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Grid Layout
        setLayout(new GridLayout(4,4));

        Font font=new Font("",1,25);

        btn7=new JButton("7");
        btn7.setFont(font);
        add(btn7);

        btn8=new JButton("8");
        btn8.setFont(font);
        add(btn8);

        btn9=new JButton("9");
        btn9.setFont(font);
        add(btn9);

        btnstr=new JButton("*");
        btnstr.setFont(font);
        add(btnstr);

        btn4=new JButton("4");
        btn4.setFont(font);
        add(btn4);

        btn5=new JButton("5");
        btn5.setFont(font);
        add(btn5);

        btn6=new JButton("6");
        btn6.setFont(font);
        add(btn6);

        btndiv=new JButton("/");
        btndiv.setFont(font);
        add(btndiv);

        btn1=new JButton("1");
        btn1.setFont(font);
        add(btn1);

        btn2=new JButton("2");
        btn2.setFont(font);
        add(btn2);

        btn3=new JButton("3");
        btn3.setFont(font);
        add(btn3);

        btnadd=new JButton("+");
        btnadd.setFont(font);
        add(btnadd);

        btn0=new JButton("0");
        btn0.setFont(font);
        add(btn0);

        btnf=new JButton(".");
        btnf.setFont(font);
        add(btnf);

        btneq=new JButton("=");
        btneq.setFont(font);
        add(btneq);

        btnmi=new JButton("-");
        btnmi.setFont(font);
        add(btnmi);

        setVisible(true);
    }
}
class Example{
    public static void main(String[] args) {
        GRid g1=new GRid();
        
    }
}