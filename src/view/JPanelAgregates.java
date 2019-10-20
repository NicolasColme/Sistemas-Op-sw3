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
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nicolas
 */
public class JPanelAgregates extends JPanel{
    private JPanel panelHeader;
    public JPanel panelTable;
    private JScrollPane panelScrollTable;
    private JButton buttonStart;
    
    public JPanelAgregates(Control control) {
        this.setBackground(Color.white);
        this.setLayout(new BorderLayout());
        this.panelHeader=new JPanel(new FlowLayout(FlowLayout.LEFT,70,0));
        this.panelTable=new JPanel();
        this.panelTable.setLayout(new BoxLayout(this.panelTable, BoxLayout.Y_AXIS));
        this.panelTable.setBackground(Color.white);
        this.panelScrollTable=new JScrollPane(this.panelTable);
        this.panelScrollTable.setBackground(Color.white);
        this.buttonStart=new JButton("Iniciar");
        this.buttonStart.addActionListener(control);
        this.buttonStart.setActionCommand("START");
        this.init();
    }
    
    
    public void init(){
        //Header
        this.panelHeader.setBackground(new Color(255, 235, 80));
        this.panelHeader.setBorder(new LineBorder(Color.black,2));
        JLabel labelName = new JLabel("Nombre");
        labelName.setFont(new Font("Calibri",Font.BOLD,20));
        JLabel labelTime = new JLabel("Tiempo");
        labelTime.setFont(new Font("Calibri",Font.BOLD,20));
        JLabel labelBlock=new JLabel("   Bloqueo");
        labelBlock.setFont(new Font("Calibri",Font.BOLD,20));
        JLabel labelDisBlock=new JLabel("Suspender/Bloquear");
        labelDisBlock.setFont(new Font("Calibri",Font.BOLD,20));
        JLabel labelDisList=new JLabel("Suspender/Listo");
        labelDisList.setFont(new Font("Calibri",Font.BOLD,20));
        this.panelHeader.add(labelName);
        this.panelHeader.add(labelTime);
        this.panelHeader.add(labelBlock);
        this.panelHeader.add(labelDisBlock);
        this.panelHeader.add(labelDisList);
        this.setBorder(BorderFactory.createEmptyBorder(70, 40, 40, 40));
        this.add(this.panelHeader,BorderLayout.NORTH);
        //Table
        this.add(this.panelScrollTable,BorderLayout.CENTER);
        //Buttons
        JPanel panelButtons=new JPanel(new FlowLayout(FlowLayout.CENTER,100,20));
        this.buttonStart.setFont(new Font("Calibri",Font.BOLD,20));
        panelButtons.add(this.buttonStart);
        panelButtons.setBackground(Color.white);
        this.add(panelButtons,BorderLayout.SOUTH);
        
        
    }
    
    
    public void addProcess(String name,String time,String block,String disBlock,String disList,Control control){
        JPanelProcess panelProcess=new JPanelProcess(name, time, block,disBlock,disList,control);
        this.panelTable.add(panelProcess);
        this.panelTable.updateUI();
        this.panelScrollTable.updateUI();
        this.updateUI();
    }
}
