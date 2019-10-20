/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Nicolas
 */
public class JFrameMain extends JFrame{
    public JPanelMain panelMain;
    private GridBagConstraints gbc;
    
    
    public JFrameMain(Control control){
        this.setLayout(new BorderLayout());
        this.panelMain=new JPanelMain(control);
        this.add(this.panelMain,BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
    }
    
    
    
    
    public void initLayout(){
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.gridheight = 1;
        gbc.weighty = 1;
        gbc.gridwidth=1;
        for (int i = 0; i < 12; i++) {
            gbc.gridx = i;
            add(new JLabel(""), gbc);
        }
    }
}
