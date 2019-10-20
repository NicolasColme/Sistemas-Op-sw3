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
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Nicolas
 */
public class JPanelHeader extends JPanel{
    private JPanel panelLogo;
    private JLabel labelLogo;
    private JPanel panelTitle;
    private JPanel panelContent;
    private JButton buttonExit;    
    
    public JPanelHeader(Control control){
        this.setLayout(new BorderLayout());
        this.setBorder(new LineBorder(Color.black,1));
        this.panelContent=new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelContent.setBackground(new Color(242, 185, 12));
        this.panelLogo=new JPanel(new BorderLayout());
        this.panelTitle=new JPanel();
        this.panelTitle.setLayout(new BoxLayout(this.panelTitle,BoxLayout.Y_AXIS));
        this.setBackground(new Color(242, 185, 12));
        this.labelLogo=new JLabel(new ImageIcon("resources/logo.png"));
        this.buttonExit=new JButton("    Salir    ");
        this.buttonExit.setBackground(Color.red);
        this.buttonExit.setBorder(new MatteBorder(10,0,110,4,new Color(242, 185, 12)));
        this.buttonExit.setFont(new Font("Calibri",Font.BOLD,24));
        this.buttonExit.setVerticalTextPosition(SwingConstants.CENTER);
        this.buttonExit.setForeground(Color.white);
        this.buttonExit.setVerticalAlignment(SwingConstants.NORTH);
        this.buttonExit.addActionListener(control);
        this.buttonExit.setActionCommand("EXIT");
        this.init();
    }
    
    
    public void init(){
        this.panelLogo.add(labelLogo,BorderLayout.CENTER);
        this.panelLogo.setBackground(new Color(242, 185, 12));
        this.panelContent.add(this.panelLogo);
        
        this.panelTitle.setBackground(new Color(242, 185, 12));
        
        JLabel labelTitle1=new JLabel("Universidad Pedagógica y Tecnológica de Colombia",SwingConstants.CENTER);
        labelTitle1.setFont(new Font("Calibri",Font.BOLD,18));
        JLabel labelTitle2=new JLabel("Escuela de Ingeniería de Sistemas y Computación",SwingConstants.CENTER);
        labelTitle2.setFont(new Font("Calibri",Font.BOLD,18));
        JLabel labelTitle3=new JLabel("Simulador de Estados de Procesos 2",SwingConstants.CENTER);
        labelTitle3.setFont(new Font("Calibri",Font.BOLD,28));
        this.panelTitle.add(labelTitle1);
        this.panelTitle.add(labelTitle2);
        this.panelTitle.add(labelTitle3);
        
        this.panelContent.add(this.panelTitle);
        
        
        this.add(this.panelContent,BorderLayout.CENTER);
        this.add(this.buttonExit,BorderLayout.EAST);
    }
}
