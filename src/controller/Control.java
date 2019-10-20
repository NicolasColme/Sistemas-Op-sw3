/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JPanel;
import model.Admin;
import model.Proceso;
import view.JDialogAlert;
import view.JFrameMain;

/**
 *
 * @author Nicolas
 */
public class Control implements ActionListener{
    private JFrameMain jFrameMain;
    private Admin admin;
    private ArrayList<Proceso> procesosCreados;
    private JDialogAlert dialogAlert;
    
    public Control(){
        this.jFrameMain=new JFrameMain(this);
        this.procesosCreados=new ArrayList<>();
        this.admin=new Admin();
    }
    
    public void removeProcess(JPanel panel,String name){
        
        for (int i = 0; i < this.procesosCreados.size(); i++) {
            if(procesosCreados.get(i).getName().equals(name)){
                procesosCreados.remove(i);
            }
        }
        
        this.jFrameMain.panelMain.panelAgregates.panelTable.remove(panel);
        this.jFrameMain.panelMain.panelAgregates.panelTable.updateUI();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
            case "ADD":
                if(this.jFrameMain.panelMain.panelMenu.validateFields()){
                    if(this.jFrameMain.panelMain.panelMenu.validateName(procesosCreados)){
                    String[] info=this.jFrameMain.panelMain.panelMenu.getInfo();
                    this.jFrameMain.panelMain.panelAgregates.addProcess(info[0],info[1],info[2],info[3],info[4],this);
                    boolean isBlock=true;
                    if(info[2].equals("Sí")){
                        isBlock=true;
                    }else{
                        isBlock=false;
                    }
                    boolean disBlock=true;
                if(info[3].equals("                Sí")){
                    System.out.println("sisa");
                        disBlock=true;
                }else{
                    System.out.println("nocas");
                        disBlock=false;
                }
                boolean disList=true;
                    if(info[4].equals("Sí")){
                        disList=true;
                    }else{
                        disList=false;
                    }
                //procesosCreados.add(new Proceso(info[0],Integer.parseInt(info[1]),isBlock,isBlock,comunicate));
                    }
                }else{
                    this.dialogAlert=new JDialogAlert(this);
                    this.dialogAlert.setVisible(true);
                }
                break;
            case "START":
                    Collections.sort(procesosCreados,new Comparator<Proceso>() {
                    @Override
                    public int compare(Proceso t, Proceso t1) {
                    return t.getPriority()-t1.getPriority();
                    }
                    });
                    this.admin.init(this.procesosCreados);
                    this.jFrameMain.panelMain.showReports(this.admin.cListos,this.admin.cEjecucion,this.admin.cBloqueados,this.admin.cSalida,admin.cDespachar,admin.cExpTiempo,admin.cBloquear,admin.cDespertar,admin.cComunicar,admin.cDestruir);
                    
                    
                break;
            
            case "RSTART":
                this.procesosCreados=new ArrayList<>();
                this.admin=new Admin();
                this.jFrameMain.panelMain.reStart();
                break;
                
            case "EXIT":
                System.exit(0);
                break;
            case "ACPALERT":
                this.dialogAlert.setVisible(false);
                break;
            case "ENABLE":
                if(this.jFrameMain.panelMain.panelMenu.rbBlocked.isSelected()){
                    this.jFrameMain.panelMain.panelMenu.enableDisBlock();
                }else{
                    this.jFrameMain.panelMain.panelMenu.rbDisBlock.setEnabled(false);
                }
                this.jFrameMain.panelMain.panelMenu.updateUI();
                break;
        }
    }
}
