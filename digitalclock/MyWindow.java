package digitalclock;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyWindow extends JFrame{
    private JLabel heading;
    private JLabel clockLabel;
    private Font font=new Font ("", Font.BOLD, 35);

    MyWindow()
    {
        super.setTitle("My Clock");
        super.setSize(500,400);
        super.setLocation(300,300);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }
    public void createGUI(){
        //gui
        heading = new JLabel("Digital Clock");
        clockLabel=new JLabel("clock");
        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }
    /**
     * 
     */
    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener()
        { 
            
            

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub
                String dateTime =new Date().toLocaleString();
                
                clockLabel.setText(dateTime);
            }

        });
        timer.start();
    }
    
}
