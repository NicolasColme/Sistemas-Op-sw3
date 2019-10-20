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
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nicolas
 */
public class JPanelMenu extends JPanel{
    
    private JTextField tfName;
    private JTextField tfTime;
    public JRadioButton rbBlocked;
    public JRadioButton rbDisBlock;
    private JRadioButton rbDisList;
    private JButton buttonAdd;
    
    public JPanelMenu(Control control){
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setBorder(new LineBorder(Color.black,1));
        this.tfName=new JTextField(10);
        this.tfName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                if(tfName.getText().length()>8){
                    e.consume();
                }
            }
        });
        this.tfTime=new JTextField(10);
        this.tfTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                if(tfTime.getText().length()>2){
                    e.consume();
                }
                char caracter = e.getKeyChar();
                 if(((caracter < '0') ||
                    (caracter > '9')) &&
                    (caracter != '\b'))
                    {
                    e.consume();
                    }
            }
        });
        
        
        this.rbBlocked=new JRadioButton("Bloquear");
        this.rbBlocked.addActionListener(control);
        this.rbBlocked.setActionCommand("ENABLE");
        this.rbDisBlock=new JRadioButton("Suspendido/Bloqueado");
        this.rbDisBlock.setEnabled(false);
        this.rbDisList=new JRadioButton("Suspendido/Listo");
        this.buttonAdd=new JButton("Agregar");
        this.buttonAdd.addActionListener(control);
        this.buttonAdd.setActionCommand("ADD");
        this.setBackground(new Color(255, 235, 80));
        this.tfName.requestFocus();
        this.init();
    }
    
    public boolean validateFields(){
        boolean v = true;
        
        if(this.tfName.getText().equals("")){
            v = false;
        }else if(this.tfTime.getText().equals("")){
            v = false;
        }
        
        return v;
    }
    
    public void enableDisBlock(){
        this.rbDisBlock.setEnabled(true);
    }
    
    
    public void init(){
        JPanel panelName=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelName=new JLabel("Nombre: ");
        labelName.setFont(new Font("Calibri",Font.BOLD,22));
        panelName.add(labelName);
        panelName.add(this.tfName);
        panelName.setBackground(new Color(255, 235, 80));
        panelName.setBorder(BorderFactory.createEmptyBorder(20, 5, 5, 5));
        this.add(panelName);
        
        JPanel panelTime=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTime=new JLabel("Tiempo: ");
        labelTime.setFont(new Font("Calibri",Font.BOLD,22));
        panelTime.add(labelTime);
        panelTime.add(this.tfTime);
        panelTime.setBackground(new Color(255, 235, 80));
        this.add(panelTime);
        
        
        JPanel panelBlocked=new JPanel(new FlowLayout(FlowLayout.CENTER));
        rbBlocked.setFont(new Font("Calibri",Font.BOLD,22));
        rbBlocked.setBackground((new Color(255, 235, 80)));
        panelBlocked.add(rbBlocked);
        panelBlocked.setBackground(new Color(255, 235, 80));
        this.add(panelBlocked);
        
        JPanel panelDisBlock=new JPanel(new FlowLayout(FlowLayout.CENTER));
        rbDisBlock.setFont(new Font("Calibri",Font.BOLD,22));
        rbDisBlock.setBackground((new Color(255, 235, 80)));
        panelDisBlock.add(rbDisBlock);
        panelDisBlock.setBackground(new Color(255, 235, 80));
        this.add(panelDisBlock);
        
        JPanel panelDisList=new JPanel(new FlowLayout(FlowLayout.CENTER));
        rbDisList.setFont(new Font("Calibri",Font.BOLD,22));
        rbDisList.setBackground((new Color(255, 235, 80)));
        panelDisList.add(rbDisList);
        panelDisList.setBackground(new Color(255, 235, 80));
        this.add(panelDisList);
        
        
        
        
        JPanel panelAdd=new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.buttonAdd.setFont(new Font("Calibri",Font.BOLD,22));
        panelAdd.add(this.buttonAdd);
        panelAdd.setBackground(new Color(255, 235, 80));
        this.add(panelAdd);
        
    }
    
    
    public String[] getInfo(){
        String[] info=new String[5];
        info[0]=this.tfName.getText();
        info[1]=this.tfTime.getText();
        if(rbBlocked.isSelected()){
        info[2]="Sí";
        }else{
        info[2]="No";
        }
        if(rbDisBlock.isSelected()){
            info[3]="                Sí";
        }else{
            info[3]="                No";
        }
        if(rbDisList.isSelected()){
            info[4]="                    Sí";
        }else{
            info[4]="                    No";
        }
        
        
        this.tfName.setText("");
        this.tfTime.setText("");
        this.rbBlocked.setSelected(false);
        this.rbDisBlock.setSelected(false);
        this.rbDisList.setSelected(false);
        return info;
    }
}
