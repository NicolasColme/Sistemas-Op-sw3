/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import model.Proceso;

/**
 *
 * @author Nicolas
 */
public class JPanelReports extends JPanel{
    private JPanel panelR1;
    private JPanel panelR2;
    private JPanel panelR3;
    private JPanel panelC1;
    private JPanel panelC2;
    private JPanel panelC3;
    private JPanel panelC4;
    private JPanel panelC5;
    private JPanel panelC6;
    private JPanel panelC7;
    private JPanel panelC8;
    private JPanel panelC9;
    private JPanel panelC10;
    private JButton buttonBack;
    
    public JPanelReports(Control control,ArrayList<Proceso> cListos,ArrayList<Proceso> cEjecucion,ArrayList<Proceso> cBloqueados,ArrayList<Proceso> cSalida,ArrayList<Proceso> cDespachar,ArrayList<Proceso> cExpTiempo,ArrayList<Proceso> cBloquear,ArrayList<Proceso> cDespertar,ArrayList<Proceso> cComunica,ArrayList<Proceso> cDestruido){
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.panelR1=new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelR1.setBackground(Color.white);
        this.panelR2=new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelR2.setBackground(Color.white);
        this.panelR3=new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelR3.setBackground(Color.white);
        this.panelC1=new JPanel();
        this.panelC1.setLayout(new BoxLayout(this.panelC1,BoxLayout.Y_AXIS));
        this.panelC2=new JPanel();
        this.panelC2.setLayout(new BoxLayout(this.panelC2,BoxLayout.Y_AXIS));
        this.panelC3=new JPanel();
        this.panelC3.setLayout(new BoxLayout(this.panelC3,BoxLayout.Y_AXIS));
        this.panelC4=new JPanel();
        this.panelC4.setLayout(new BoxLayout(this.panelC4,BoxLayout.Y_AXIS));
        this.panelC5=new JPanel();
        this.panelC5.setLayout(new BoxLayout(this.panelC5,BoxLayout.Y_AXIS));
        this.panelC6=new JPanel();
        this.panelC6.setLayout(new BoxLayout(this.panelC6,BoxLayout.Y_AXIS));
        this.panelC7=new JPanel();
        this.panelC7.setLayout(new BoxLayout(this.panelC7,BoxLayout.Y_AXIS));
        this.panelC8=new JPanel();
        this.panelC8.setLayout(new BoxLayout(this.panelC8,BoxLayout.Y_AXIS));
        this.panelC9=new JPanel();
        this.panelC9.setLayout(new BoxLayout(this.panelC9,BoxLayout.Y_AXIS));
        this.panelC10=new JPanel();
        this.panelC10.setLayout(new BoxLayout(this.panelC10,BoxLayout.Y_AXIS));
        this.buttonBack=new JButton("Volver");
        this.buttonBack.setFont(new Font("Calibri",Font.BOLD,20));
        this.buttonBack.addActionListener(control);
        this.buttonBack.setActionCommand("RSTART");
        
        this.init(cListos,cEjecucion,cBloqueados,cSalida,cDespachar,cExpTiempo,cBloquear,cDespertar,cComunica,cDestruido);
    }
    
    public void init(ArrayList<Proceso> cListos,ArrayList<Proceso> cEjecucion,ArrayList<Proceso> cBloqueados,ArrayList<Proceso> cSalida,ArrayList<Proceso> cDespachar,ArrayList<Proceso> cExpTiempo,ArrayList<Proceso> cBloquear,ArrayList<Proceso> cDespertar,ArrayList<Proceso> cComunica,ArrayList<Proceso> cDestruido){
        //Cola Listos
        JPanel panelT1=new JPanel(new BorderLayout());
        panelT1.setBorder(new LineBorder(Color.black,1));
        JLabel labelT1=new JLabel("Cola Listos",SwingConstants.CENTER);
        labelT1.setFont(new Font("Calibri",Font.BOLD,22));
        panelT1.add(labelT1,BorderLayout.CENTER);
        panelT1.setBackground(new Color(255, 235, 80));
        JPanel panel1=new JPanel(new BorderLayout());
        panel1.add(panelT1,BorderLayout.NORTH);
        
        this.fillReports("CL", cListos);
        JScrollPane scrollPane1=new JScrollPane(this.panelC1);
        scrollPane1.setPreferredSize(new Dimension(200,200));
        panel1.add(scrollPane1,BorderLayout.CENTER);
        
        //Cola en Ejecucion
        JPanel panelT2=new JPanel(new BorderLayout());
        panelT2.setBorder(new LineBorder(Color.black,1));
        JLabel labelT2=new JLabel("Cola en Ejecución",SwingConstants.CENTER);
        labelT2.setFont(new Font("Calibri",Font.BOLD,22));
        panelT2.add(labelT2,BorderLayout.CENTER);
        panelT2.setBackground(new Color(255, 235, 80));
        JPanel panel2=new JPanel(new BorderLayout());
        panel2.add(panelT2,BorderLayout.NORTH);
        
        this.fillReports("CE", cEjecucion);
        JScrollPane scrollPane2=new JScrollPane(this.panelC2);
        scrollPane2.setPreferredSize(new Dimension(200,200));
        panel2.add(scrollPane2,BorderLayout.CENTER);
        
        //Cola Bloqueados
        JPanel panelT3=new JPanel(new BorderLayout());
        panelT3.setBorder(new LineBorder(Color.black,1));
        JLabel labelT3=new JLabel("Cola Bloqueados",SwingConstants.CENTER);
        labelT3.setFont(new Font("Calibri",Font.BOLD,22));
        panelT3.add(labelT3,BorderLayout.CENTER);
        panelT3.setBackground(new Color(255, 235, 80));
        JPanel panel3=new JPanel(new BorderLayout());
        panel3.add(panelT3,BorderLayout.NORTH);
        
        this.fillReports("CB", cBloqueados);
        JScrollPane scrollPane3=new JScrollPane(this.panelC3);
        scrollPane3.setPreferredSize(new Dimension(200,200));
        panel3.add(scrollPane3,BorderLayout.CENTER);
        
        //Cola Salida
        JPanel panelT4=new JPanel(new BorderLayout());
        panelT4.setBorder(new LineBorder(Color.black,1));
        JLabel labelT4=new JLabel("Cola Salida",SwingConstants.CENTER);
        labelT4.setFont(new Font("Calibri",Font.BOLD,22));
        panelT4.add(labelT4,BorderLayout.CENTER);
        panelT4.setBackground(new Color(255, 235, 80));
        JPanel panel4=new JPanel(new BorderLayout());
        panel4.add(panelT4,BorderLayout.NORTH);
        
        this.fillReports("CS", cSalida);
        JScrollPane scrollPane4=new JScrollPane(this.panelC4);
        scrollPane4.setPreferredSize(new Dimension(200,200));
        panel4.add(scrollPane4,BorderLayout.CENTER);
        
        //Cola Despachar
        JPanel panelT5=new JPanel(new BorderLayout());
        panelT5.setBorder(new LineBorder(Color.black,1));
        JLabel labelT5=new JLabel("Cola Despachar",SwingConstants.CENTER);
        labelT5.setFont(new Font("Calibri",Font.BOLD,22));
        panelT5.add(labelT5,BorderLayout.CENTER);
        panelT5.setBackground(new Color(255, 235, 80));
        JPanel panel5=new JPanel(new BorderLayout());
        panel5.add(panelT5,BorderLayout.NORTH);
        
        this.fillReports("CDSP", cDespachar);
        JScrollPane scrollPane5=new JScrollPane(this.panelC5);
        scrollPane5.setPreferredSize(new Dimension(200,200));
        panel5.add(scrollPane5,BorderLayout.CENTER);
        
        //Cola ex tiempo
        JPanel panelT6=new JPanel(new BorderLayout());
        panelT6.setBorder(new LineBorder(Color.black,1));
        JLabel labelT6=new JLabel("Cola expira tiempo",SwingConstants.CENTER);
        labelT6.setFont(new Font("Calibri",Font.BOLD,22));
        panelT6.add(labelT6,BorderLayout.CENTER);
        panelT6.setBackground(new Color(255, 235, 80));
        JPanel panel6=new JPanel(new BorderLayout());
        panel6.add(panelT6,BorderLayout.NORTH);
        
        this.fillReports("CEX", cExpTiempo);
        JScrollPane scrollPane6=new JScrollPane(this.panelC6);
        scrollPane6.setPreferredSize(new Dimension(200,200));
        panel6.add(scrollPane6,BorderLayout.CENTER);
        
        //Cola bloquear
        JPanel panelT7=new JPanel(new BorderLayout());
        panelT7.setBorder(new LineBorder(Color.black,1));
        JLabel labelT7=new JLabel("Cola bloquear",SwingConstants.CENTER);
        labelT7.setFont(new Font("Calibri",Font.BOLD,22));
        panelT7.add(labelT7,BorderLayout.CENTER);
        panelT7.setBackground(new Color(255, 235, 80));
        JPanel panel7=new JPanel(new BorderLayout());
        panel7.add(panelT7,BorderLayout.NORTH);
        
        this.fillReports("CBR", cBloquear);
        JScrollPane scrollPane7=new JScrollPane(this.panelC7);
        scrollPane7.setPreferredSize(new Dimension(200,200));
        panel7.add(scrollPane7,BorderLayout.CENTER);
        
        //Cola despertar
        JPanel panelT8=new JPanel(new BorderLayout());
        panelT8.setBorder(new LineBorder(Color.black,1));
        JLabel labelT8=new JLabel("Cola despertar",SwingConstants.CENTER);
        labelT8.setFont(new Font("Calibri",Font.BOLD,22));
        panelT8.add(labelT8,BorderLayout.CENTER);
        panelT8.setBackground(new Color(255, 235, 80));
        JPanel panel8=new JPanel(new BorderLayout());
        panel8.add(panelT8,BorderLayout.NORTH);
        
        this.fillReports("CDSR", cDespertar);
        JScrollPane scrollPane8=new JScrollPane(this.panelC8);
        scrollPane8.setPreferredSize(new Dimension(200,200));
        panel8.add(scrollPane8,BorderLayout.CENTER);
        
        //Cola comunica
        JPanel panelT9=new JPanel(new BorderLayout());
        panelT9.setBorder(new LineBorder(Color.black,1));
        JLabel labelT9=new JLabel("Reanudar Susp/Bloq",SwingConstants.CENTER);
        labelT9.setFont(new Font("Calibri",Font.BOLD,21));
        panelT9.add(labelT9,BorderLayout.CENTER);
        panelT9.setBackground(new Color(255, 235, 80));
        JPanel panel9=new JPanel(new BorderLayout());
        panel9.add(panelT9,BorderLayout.NORTH);
        
        this.fillReports("CCOM", cComunica);
        JScrollPane scrollPane9=new JScrollPane(this.panelC9);
        scrollPane9.setPreferredSize(new Dimension(200,200));
        panel9.add(scrollPane9,BorderLayout.CENTER);
        
        //Cola destruidos
        JPanel panelT10=new JPanel(new BorderLayout());
        panelT10.setBorder(new LineBorder(Color.black,1));
        JLabel labelT10=new JLabel("Cola destruidos",SwingConstants.CENTER);
        labelT10.setFont(new Font("Calibri",Font.BOLD,21));
        panelT10.add(labelT10,BorderLayout.CENTER);
        panelT10.setBackground(new Color(255, 235, 80));
        JPanel panel10=new JPanel(new BorderLayout());
        panel10.add(panelT10,BorderLayout.NORTH);
        
        this.fillReports("CDES", cDestruido);
        JScrollPane scrollPane10=new JScrollPane(this.panelC10);
        scrollPane10.setPreferredSize(new Dimension(200,200));
        panel10.add(scrollPane10,BorderLayout.CENTER);
        
        
        
        
        this.panelR1.add(panel1);
        this.panelR1.add(panel2);
        this.panelR1.add(panel3);
        this.panelR1.add(panel4);
        this.panelR1.add(panel9);
        this.panelR2.add(panel5);
        this.panelR2.add(panel6);
        this.panelR2.add(panel7);
        this.panelR2.add(panel8);
        this.panelR2.add(panel10);
        this.panelR3.add(this.buttonBack);
        this.add(this.panelR1);
        this.add(this.panelR2);
        this.add(this.panelR3);
    }
    
    public JPanel createProcess(String name,String time){
        JPanel panelProcess=new JPanel(new FlowLayout(FlowLayout.CENTER,20,5));
        panelProcess.setBackground(Color.white);
        panelProcess.setBorder(new LineBorder(Color.black,1));
        JLabel labelName=new JLabel(name);
        JLabel labelTime=new JLabel(time);
        labelName.setFont(new Font("Calibri",Font.PLAIN,18));
        labelTime.setFont(new Font("Calibri",Font.PLAIN,18));
        panelProcess.add(labelName);
        panelProcess.add(labelTime);
        
        return panelProcess;
    }
    
    public void fillReports(String rep,ArrayList<Proceso> process){
        switch(rep){
            case "CL":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC1.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CE":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC2.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CB":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC3.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CS":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC4.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CDSP":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC5.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CEX":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC6.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CBR":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC7.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CDSR":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC8.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CCOM":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC9.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CDES":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC10.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;    
        }
    }
    
}
