/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nicolas
 */
public class JDialogAlert extends JDialog{
    private JButton buttonAcept;
    
    
    public JDialogAlert(Control control){
        this.setSize(500, 200);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        
        JPanel panelBg=new JPanel(new BorderLayout());
        panelBg.setBackground(Color.white);
        panelBg.setBorder(new LineBorder(Color.yellow, 2));
        JLabel labelAlert = new JLabel("Por favor complete los campos restantes");
        labelAlert.setFont(new Font("Calibri",Font.BOLD,22));
        labelAlert.setForeground(Color.red);
        JLabel labelIcon = new JLabel(new ImageIcon("resources/alert.png"));
        this.buttonAcept = new JButton("Aceptar");
        this.buttonAcept.addActionListener(control);
        this.buttonAcept.setActionCommand("ACPALERT");
        labelAlert.setFont(new Font("Calibri",Font.BOLD,18));
        
        panelBg.add(labelAlert,BorderLayout.CENTER);
        panelBg.add(labelIcon,BorderLayout.WEST);
        panelBg.add(this.buttonAcept,BorderLayout.SOUTH);
        
        this.add(panelBg,BorderLayout.CENTER);
        
    }
}
