/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nicolas
 */
public class JPanelProcess extends JPanel implements ActionListener{
    private JLabel labelName;
    private JLabel labelTime;
    private JLabel labelBlock;
    private JButton buttonDelete;
    private Control control;
    private String name;
    
    public JPanelProcess(String name,String time,String block,String disBlock,String disList,Control control){
        this.name=name;
        this.control=control;
        this.setBackground(Color.white);
        this.setBorder(new LineBorder(Color.black,1));
        this.setLayout(new BorderLayout());
        JPanel p=new JPanel(new FlowLayout(FlowLayout.LEFT,110,10));
        p.setBackground(Color.white);
        this.labelName=new JLabel(name);
        this.labelTime=new JLabel(time);
        JLabel labelDisBlock=new JLabel(disBlock);
        this.labelBlock=new JLabel(block);
        JLabel labeldisList=new JLabel(disList);
        this.labelName.setFont(new Font("Calibri",Font.PLAIN,18));
        this.labelTime.setFont(new Font("Calibri",Font.PLAIN,18));
        labelDisBlock.setFont(new Font("Calibri",Font.PLAIN,18));
        this.labelBlock.setFont(new Font("Calibri",Font.PLAIN,18));
        labeldisList.setFont(new Font("Calibri",Font.PLAIN,18));
        this.buttonDelete=new JButton("Remover");
        this.buttonDelete.setFont(new Font("Calibri",Font.BOLD,16));
        this.buttonDelete.setBackground(Color.red);
        this.buttonDelete.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));
        this.buttonDelete.addActionListener(this);
        this.buttonDelete.setActionCommand("D");
        p.add(this.labelName);
        p.add(this.labelTime);
        p.add(this.labelBlock);
        p.add(labelDisBlock);
        p.add(labeldisList);
        this.add(p,BorderLayout.CENTER);
        JPanel panelbut =new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelbut.setBackground(Color.white);
        panelbut.add(this.buttonDelete);
        this.add(panelbut,BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("D")){
            this.control.removeProcess(this,name);
        }
    }
}
