package HotelManage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DeniedMonitor implements ActionListener {
    JButton button = new JButton("확인");
    JFrame frame = new JFrame("접속불가");
    public DeniedMonitor(){
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 150);

        JLabel label = new JLabel("권한이 없습니다.");

        button.addActionListener(this);

        label.setBounds(150, 10, 120, 30);
        button.setBounds(170, 50, 60, 30);
        frame.add(label);
        frame.add(button);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            frame.dispose();
        }
    }
}
