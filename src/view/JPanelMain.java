/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Proceso;

/**
 *
 * @author Nicolas
 */
public class JPanelMain extends JPanel{
    private Control control;
    private GridBagConstraints gbc;
    private JPanelHeader panelHeader;
    public JPanelMenu panelMenu;
    public JPanelAgregates panelAgregates;
    public JPanelReports panelReports;
    
    
    public JPanelMain(Control control){
        this.control=control;
        this.setLayout(new GridBagLayout());
        this.gbc=new GridBagConstraints();
        this.panelHeader=new JPanelHeader(control);
        this.panelMenu=new JPanelMenu(control);
        this.panelAgregates=new JPanelAgregates(control);
        
        this.initLayout();
        this.init();
    }
    
    public void init(){
        //Agregar header
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=12;
        gbc.gridheight=1;
        this.add(this.panelHeader,gbc);
        
        //Agregar menu
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=3;
        gbc.gridheight=11;
        this.add(this.panelMenu,gbc);
        
        //Agregar panel de añadidos
        gbc.gridx=3;
        gbc.gridy=1;
        gbc.gridwidth=9;
        gbc.gridheight=11;
        this.add(this.panelAgregates,gbc);
    }
    
    
    
    public void showReports(ArrayList<Proceso> cListos,ArrayList<Proceso> cEjecucion,ArrayList<Proceso> cBloqueados,ArrayList<Proceso> cSalida,ArrayList<Proceso> cDespachar,ArrayList<Proceso> cExpTiempo,ArrayList<Proceso> cBloquear,ArrayList<Proceso> cDespertar,ArrayList<Proceso> cComunica,ArrayList<Proceso> cDestruido){
        this.panelReports=new JPanelReports(control,cListos, cEjecucion, cBloqueados, cSalida, cDespachar, cExpTiempo, cBloquear, cDespertar,cComunica,cDestruido);
        this.remove(this.panelAgregates);
        gbc.gridx=3;
        gbc.gridy=1;
        gbc.gridwidth=9;
        gbc.gridheight=11;
        this.add(this.panelReports,gbc);
        this.updateUI();
    }
    
    
//    public void showSortProcess(ArrayList<Proceso> sortProcess){
//        this.remove(this.panelMenu);
//        this.panelSortProcess = new JPanelProcessSort(sortProcess);
//        gbc.gridx=0;
//        gbc.gridy=1;
//        gbc.gridwidth=3;
//        gbc.gridheight=11;
//        this.add(this.panelSortProcess,gbc);
//        this.updateUI();
//    }
    
    public void reStart(){
        this.panelAgregates=new JPanelAgregates(control);
        this.remove(this.panelReports);
        gbc.gridx=3;
        gbc.gridy=1;
        gbc.gridwidth=9;
        gbc.gridheight=11;
        this.add(this.panelAgregates,gbc);
        
//        this.remove(this.panelSortProcess);
//        gbc.gridx=0;
//        gbc.gridy=1;
//        gbc.gridwidth=3;
//        gbc.gridheight=11;
//        this.add(this.panelMenu,gbc);
        
        this.updateUI();
    }
    public void initLayout(){
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.gridheight = 1;
        gbc.weighty = 1;
        gbc.gridwidth=1;
        for (int i = 0; i < 12; i++) {
            gbc.gridx = i;
            gbc.gridy=i;
            add(new JLabel(""), gbc);
        }
    }
}
