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
    private JPanel panelC11;
    private JPanel panelC12;
    private JPanel panelC13;
    private JPanel panelC14;
    private JPanel panelC15;
    private JButton buttonBack;
    
    public JPanelReports(Control control,ArrayList<Proceso> cListos,ArrayList<Proceso> cEjecucion,ArrayList<Proceso> cBloqueados,
                    ArrayList<Proceso> cSusBlock,ArrayList<Proceso> cSusList,ArrayList<Proceso> cDespach,
                    ArrayList<Proceso> cExpTiemp,ArrayList<Proceso> cES,ArrayList<Proceso> cSusp_BlockSusp,
                    ArrayList<Proceso> cRean_SusBlock,ArrayList<Proceso> cTermESSusp,ArrayList<Proceso> cSusp_EjecSusp,
                    ArrayList<Proceso> cTermESBlock,ArrayList<Proceso> cRean_SusList,ArrayList<Proceso> cSalida){
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
        this.panelC11=new JPanel();
        this.panelC11.setLayout(new BoxLayout(this.panelC10,BoxLayout.Y_AXIS));
        this.panelC12=new JPanel();
        this.panelC12.setLayout(new BoxLayout(this.panelC10,BoxLayout.Y_AXIS));
        this.panelC13=new JPanel();
        this.panelC13.setLayout(new BoxLayout(this.panelC10,BoxLayout.Y_AXIS));
        this.panelC14=new JPanel();
        this.panelC14.setLayout(new BoxLayout(this.panelC10,BoxLayout.Y_AXIS));
        this.panelC15=new JPanel();
        this.panelC15.setLayout(new BoxLayout(this.panelC10,BoxLayout.Y_AXIS));
        this.buttonBack=new JButton("Volver");
        this.buttonBack.setFont(new Font("Calibri",Font.BOLD,20));
        this.buttonBack.addActionListener(control);
        this.buttonBack.setActionCommand("RSTART");
        
        this.init(cListos,cEjecucion,cBloqueados,cSusBlock,cSusList,cDespach,cExpTiemp,cES,cSusp_BlockSusp,cRean_SusBlock,cTermESSusp,cSusp_EjecSusp,
                  cTermESBlock,cRean_SusList,cSalida);
    }
    
    public void init(ArrayList<Proceso> cListos,ArrayList<Proceso> cEjecucion,ArrayList<Proceso> cBloqueados,
                    ArrayList<Proceso> cSusBlock,ArrayList<Proceso> cSusList,ArrayList<Proceso> cDespach,
                    ArrayList<Proceso> cExpTiemp,ArrayList<Proceso> cES,ArrayList<Proceso> cSusp_BlockSusp,
                    ArrayList<Proceso> cRean_SusBlock,ArrayList<Proceso> cTermESSusp,ArrayList<Proceso> cSusp_EjecSusp,
                    ArrayList<Proceso> cTermESBlock,ArrayList<Proceso> cRean_SusList,ArrayList<Proceso> cSalida){
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
        
        //Suspendido Bloqueado
        JPanel panelT4=new JPanel(new BorderLayout());
        panelT4.setBorder(new LineBorder(Color.black,1));
        JLabel labelT4=new JLabel("Suspendido Bloquedo",SwingConstants.CENTER);
        labelT4.setFont(new Font("Calibri",Font.BOLD,22));
        panelT4.add(labelT4,BorderLayout.CENTER);
        panelT4.setBackground(new Color(255, 235, 80));
        JPanel panel4=new JPanel(new BorderLayout());
        panel4.add(panelT4,BorderLayout.NORTH);
        
        this.fillReports("CSB", cSusBlock);
        JScrollPane scrollPane4=new JScrollPane(this.panelC4);
        scrollPane4.setPreferredSize(new Dimension(200,200));
        panel4.add(scrollPane4,BorderLayout.CENTER);
        
        //Suspendido Listo
        JPanel panelT5=new JPanel(new BorderLayout());
        panelT5.setBorder(new LineBorder(Color.black,1));
        JLabel labelT5=new JLabel("Suspendido Listo",SwingConstants.CENTER);
        labelT5.setFont(new Font("Calibri",Font.BOLD,22));
        panelT5.add(labelT5,BorderLayout.CENTER);
        panelT5.setBackground(new Color(255, 235, 80));
        JPanel panel5=new JPanel(new BorderLayout());
        panel5.add(panelT5,BorderLayout.NORTH);
        
        this.fillReports("CSL", cSusList);
        JScrollPane scrollPane5=new JScrollPane(this.panelC5);
        scrollPane5.setPreferredSize(new Dimension(200,200));
        panel5.add(scrollPane5,BorderLayout.CENTER);
        
        //Despachar
        JPanel panelT6=new JPanel(new BorderLayout());
        panelT6.setBorder(new LineBorder(Color.black,1));
        JLabel labelT6=new JLabel("Despachar",SwingConstants.CENTER);
        labelT6.setFont(new Font("Calibri",Font.BOLD,22));
        panelT6.add(labelT6,BorderLayout.CENTER);
        panelT6.setBackground(new Color(255, 235, 80));
        JPanel panel6=new JPanel(new BorderLayout());
        panel6.add(panelT6,BorderLayout.NORTH);
        
        this.fillReports("DSPCH", cDespach);
        JScrollPane scrollPane6=new JScrollPane(this.panelC6);
        scrollPane6.setPreferredSize(new Dimension(200,200));
        panel6.add(scrollPane6,BorderLayout.CENTER);
        
        //Exp Tiempo
        JPanel panelT7=new JPanel(new BorderLayout());
        panelT7.setBorder(new LineBorder(Color.black,1));
        JLabel labelT7=new JLabel("Expiración Tiempo",SwingConstants.CENTER);
        labelT7.setFont(new Font("Calibri",Font.BOLD,22));
        panelT7.add(labelT7,BorderLayout.CENTER);
        panelT7.setBackground(new Color(255, 235, 80));
        JPanel panel7=new JPanel(new BorderLayout());
        panel7.add(panelT7,BorderLayout.NORTH);
        
        this.fillReports("EXT", cExpTiemp);
        JScrollPane scrollPane7=new JScrollPane(this.panelC7);
        scrollPane7.setPreferredSize(new Dimension(200,200));
        panel7.add(scrollPane7,BorderLayout.CENTER);
        
        //Cola Espra E/S
        JPanel panelT8=new JPanel(new BorderLayout());
        panelT8.setBorder(new LineBorder(Color.black,1));
        JLabel labelT8=new JLabel("Espera E/S",SwingConstants.CENTER);
        labelT8.setFont(new Font("Calibri",Font.BOLD,22));
        panelT8.add(labelT8,BorderLayout.CENTER);
        panelT8.setBackground(new Color(255, 235, 80));
        JPanel panel8=new JPanel(new BorderLayout());
        panel8.add(panelT8,BorderLayout.NORTH);
        
        this.fillReports("ESP", cES);
        JScrollPane scrollPane8=new JScrollPane(this.panelC8);
        scrollPane8.setPreferredSize(new Dimension(200,200));
        panel8.add(scrollPane8,BorderLayout.CENTER);
        
        //Cola Suspender BloqSusp
        JPanel panelT9=new JPanel(new BorderLayout());
        panelT9.setBorder(new LineBorder(Color.black,1));
        JLabel labelT9=new JLabel("Suspender Bloq -> Susp",SwingConstants.CENTER);
        labelT9.setFont(new Font("Calibri",Font.BOLD,22));
        panelT9.add(labelT5,BorderLayout.CENTER);
        panelT9.setBackground(new Color(255, 235, 80));
        JPanel panel9=new JPanel(new BorderLayout());
        panel9.add(panelT9,BorderLayout.NORTH);
        
        this.fillReports("SBS", cSusp_BlockSusp);
        JScrollPane scrollPane9=new JScrollPane(this.panelC9);
        scrollPane9.setPreferredSize(new Dimension(200,200));
        panel9.add(scrollPane9,BorderLayout.CENTER);
        
        //Cola Reanudar Susp Bloq
        JPanel panelT10=new JPanel(new BorderLayout());
        panelT10.setBorder(new LineBorder(Color.black,1));
        JLabel labelT10=new JLabel("Reanudad Susp->Bloq",SwingConstants.CENTER);
        labelT10.setFont(new Font("Calibri",Font.BOLD,22));
        panelT10.add(labelT10,BorderLayout.CENTER);
        panelT10.setBackground(new Color(255, 235, 80));
        JPanel panel10=new JPanel(new BorderLayout());
        panel10.add(panelT10,BorderLayout.NORTH);
        
        this.fillReports("RSB", cRean_SusBlock);
        JScrollPane scrollPane10=new JScrollPane(this.panelC10);
        scrollPane10.setPreferredSize(new Dimension(200,200));
        panel10.add(scrollPane10,BorderLayout.CENTER);
        
        //Cola Terminacion E/S Susp
        JPanel panelT11=new JPanel(new BorderLayout());
        panelT11.setBorder(new LineBorder(Color.black,1));
        JLabel labelT11=new JLabel("Termina E/S Suspendido",SwingConstants.CENTER);
        labelT11.setFont(new Font("Calibri",Font.BOLD,22));
        panelT11.add(labelT11,BorderLayout.CENTER);
        panelT11.setBackground(new Color(255, 235, 80));
        JPanel panel11=new JPanel(new BorderLayout());
        panel11.add(panelT11,BorderLayout.NORTH);
        
        this.fillReports("TES", cTermESSusp);
        JScrollPane scrollPane11=new JScrollPane(this.panelC11);
        scrollPane11.setPreferredSize(new Dimension(200,200));
        panel11.add(scrollPane11,BorderLayout.CENTER);
        
        //Cola Suspender Ejec -> Susp
        JPanel panelT12=new JPanel(new BorderLayout());
        panelT12.setBorder(new LineBorder(Color.black,1));
        JLabel labelT12=new JLabel("Suspender Ejec->Susp",SwingConstants.CENTER);
        labelT12.setFont(new Font("Calibri",Font.BOLD,22));
        panelT12.add(labelT8,BorderLayout.CENTER);
        panelT12.setBackground(new Color(255, 235, 80));
        JPanel panel12=new JPanel(new BorderLayout());
        panel12.add(panelT12,BorderLayout.NORTH);
        
        this.fillReports("CSES", cSusp_EjecSusp);
        JScrollPane scrollPane12=new JScrollPane(this.panelC12);
        scrollPane12.setPreferredSize(new Dimension(200,200));
        panel12.add(scrollPane12,BorderLayout.CENTER);
        
        //Cola Terminacion E/S Bloque
        JPanel panelT13=new JPanel(new BorderLayout());
        panelT9.setBorder(new LineBorder(Color.black,1));
        JLabel labelT13=new JLabel("Termina E/S Bloqueado",SwingConstants.CENTER);
        labelT13.setFont(new Font("Calibri",Font.BOLD,21));
        panelT13.add(labelT9,BorderLayout.CENTER);
        panelT13.setBackground(new Color(255, 235, 80));
        JPanel panel13=new JPanel(new BorderLayout());
        panel9.add(panelT13,BorderLayout.NORTH);
        
        this.fillReports("CTESB", cTermESBlock);
        JScrollPane scrollPane13=new JScrollPane(this.panelC13);
        scrollPane13.setPreferredSize(new Dimension(200,200));
        panel13.add(scrollPane13,BorderLayout.CENTER);
        
        //Cola Reanudar Susp->List
        JPanel panelT14=new JPanel(new BorderLayout());
        panelT14.setBorder(new LineBorder(Color.black,1));
        JLabel labelT14=new JLabel("Reanudad Susp->List",SwingConstants.CENTER);
        labelT14.setFont(new Font("Calibri",Font.BOLD,21));
        panelT14.add(labelT14,BorderLayout.CENTER);
        panelT14.setBackground(new Color(255, 235, 80));
        JPanel panel14=new JPanel(new BorderLayout());
        panel14.add(panelT14,BorderLayout.NORTH);
        
        this.fillReports("CRSL", cRean_SusList);
        JScrollPane scrollPane14=new JScrollPane(this.panelC14);
        scrollPane14.setPreferredSize(new Dimension(200,200));
        panel14.add(scrollPane14,BorderLayout.CENTER);
        
        
        //Cola Salida
        JPanel panelT15=new JPanel(new BorderLayout());
        panelT15.setBorder(new LineBorder(Color.black,1));
        JLabel labelT15=new JLabel("Salida",SwingConstants.CENTER);
        labelT15.setFont(new Font("Calibri",Font.BOLD,21));
        panelT15.add(labelT15,BorderLayout.CENTER);
        panelT15.setBackground(new Color(255, 235, 80));
        JPanel panel15=new JPanel(new BorderLayout());
        panel15.add(panelT15,BorderLayout.NORTH);
        
        this.fillReports("CSAL", cRean_SusList);
        JScrollPane scrollPane115=new JScrollPane(this.panelC15);
        scrollPane115.setPreferredSize(new Dimension(200,200));
        panel15.add(scrollPane115,BorderLayout.CENTER);
        
        
        
        
        this.panelR1.add(panel1);
        this.panelR1.add(panel2);
        this.panelR1.add(panel3);
        this.panelR1.add(panel4);
        this.panelR1.add(panel5);
        this.panelR1.add(panel6);
        this.panelR1.add(panel7);
        this.panelR1.add(panel8);
        this.panelR2.add(panel9);
        this.panelR2.add(panel10);
        this.panelR2.add(panel11);
        this.panelR2.add(panel12);
        this.panelR2.add(panel13);
        this.panelR2.add(panel14);
        this.panelR2.add(panel15);
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
            case "CSB":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC4.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CSL":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC5.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "DSPCH":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC6.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "EXT":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC7.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "ESP":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC8.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "SBS":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC9.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "RSB":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC10.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "TES":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC11.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CSES":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC12.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CTESB":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC13.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CRSL":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC14.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;
            case "CSAL":
                for (int i = 0; i < process.size(); i++) {
                    this.panelC15.add(this.createProcess(process.get(i).getName(),Integer.toString(process.get(i).getTime())));
                }
                break;    
        }
    }
    
}
