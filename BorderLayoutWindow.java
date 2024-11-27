import javax.swing.*;
import java.awt.*;

class GRid extends JFrame{
    JButton [] btnArr;

    GRid(){
        setSize(500,300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Grid Layout
        setLayout(new GridLayout(4,4));

        Font font=new Font("",1,25);


        String text[]={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
        btnArr=new JButton[16];

        for(int i=0;i<16;i++){
            btnArr[i]=new JButton(text[i]);
            btnArr[i].setFont(font);
            add(btnArr[i]);

            setVisible(true);
        }

        
    }
}
class Example{
    public static void main(String[] args) {
        GRid g1=new GRid();
        
    }
}