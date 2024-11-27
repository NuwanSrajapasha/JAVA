import javax.swing.*;
import java.awt.*;
class DLayout extends JFrame{
    JButton btnNorth,btnSouth,btnWest,btnEast,btn1,btn2,btn3,btn4;

    DLayout(){
        setSize(500,400);
        setTitle("JPanel is a Container");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Font font=new Font("null",1,25);

        setLayout(new BorderLayout());

        btnNorth=new JButton("North");
        btnNorth.setFont(font);
        add("North",btnNorth);

        btnSouth=new JButton("South");
        btnSouth.setFont(font);
        add("South",btnSouth);

        btnEast=new JButton("East");
        btnEast.setFont(font);
        add("East",btnEast);

        btnWest=new JButton("West");
        btnWest.setFont(font);
        add("West",btnWest);

        JPanel centerPanel=new JPanel();
        centerPanel.setLayout(new GridLayout(2,2));

        btn1=new JButton("1");
        btn1.setFont(font);
        centerPanel.add(btn1);

        btn2=new JButton("2");
        btn2.setFont(font);
        centerPanel.add(btn2);

        btn3=new JButton("3");
        btn3.setFont(font);
        centerPanel.add(btn3);

        btn4=new JButton("4");
        btn4.setFont(font);
        centerPanel.add(btn4);
        
        add("Center",centerPanel);





        setVisible(true);


    }

}class Example{
    public static void main(String[] args) {
        DLayout d1=new DLayout();
        
    }
}