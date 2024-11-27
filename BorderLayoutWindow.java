import javax.swing.*;
import java.awt.*;
class LAyout extends JFrame{
    JButton btn1,thisbtn,btn2,exect;

    LAyout(){
        setSize(400,300);
        setTitle("Flow Layout Window");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        

        //Flow Layout
        //Left alignment
        setLayout(new FlowLayout((int) LEFT_ALIGNMENT));

        Font font=new Font("null",1,25);
        
        btn1=new JButton("Button1");
        btn1.setFont(font);
        add("Button1",btn1);

        thisbtn=new JButton("This is abutton");
        thisbtn.setFont(font);
        add("This is abutton",thisbtn);

        btn2=new JButton("Button2");
        btn2.setFont(font);
        add("Button2",btn2);

        exect=new JButton("Execute");
        exect.setFont(font);
        add("Execute",exect);

        setVisible(true);

    }
     

}class Example{
    public static void main(String[] args) {
        LAyout l1=new LAyout();
        
    }
}