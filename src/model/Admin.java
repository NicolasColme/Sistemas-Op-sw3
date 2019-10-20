/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class Admin {
    public static final int MAX_EXE = 5;
    
    private int testCount=0;
    
    private MyQueue<Proceso> myQueueAvailable;
    private MyQueue<Proceso> myQueueExecution;
    private MyQueue<Proceso> myQueueBlock;
    
    private ArrayList<String> availableList;
    private ArrayList<String> executionList;
    private ArrayList<String> isBlockList;
    private ArrayList<String> blockList;
    private ArrayList<String> wakeList;
    private ArrayList<String> dispatchList;
    private ArrayList<String> expireList;
    private ArrayList<String> endList;
    
    public ArrayList<Proceso> cListos;
    public ArrayList<Proceso> cEjecucion;
    public ArrayList<Proceso> cBloqueados;
    public ArrayList<Proceso> cSalida;
    public ArrayList<Proceso> cDespachar;
    public ArrayList<Proceso> cExpTiempo;
    public ArrayList<Proceso> cBloquear;
    public ArrayList<Proceso> cDespertar;
    
    public ArrayList<Proceso> cDestruir;
    public ArrayList<Proceso> cComunicar;
    
    public Admin(){
        myQueueAvailable = new MyQueue<>();
        myQueueExecution = new MyQueue<>();
        myQueueBlock = new MyQueue<>();
        
        availableList = new ArrayList<>();
        executionList = new ArrayList<>();
        isBlockList = new ArrayList<>();
        blockList = new ArrayList<>();
        wakeList = new ArrayList<>();
        dispatchList = new ArrayList<>();
        expireList = new ArrayList<>();
        endList = new ArrayList<>();
        
        cListos=new ArrayList<>();
        cEjecucion=new ArrayList<>();
        cBloqueados=new ArrayList<>();
        cSalida=new ArrayList<>();
        cDespachar=new ArrayList<>();
        cExpTiempo=new ArrayList<>();
        cBloquear=new ArrayList<>();
        cDespertar=new ArrayList<>();
        
        cDestruir = new ArrayList<>();
        cComunicar = new ArrayList<>();
        
        
    }
    
    public void init(ArrayList<Proceso> processCreated){
        //Llenamos la cola de listos
        for (int i = 0; i < processCreated.size(); i++) {
            myQueueAvailable.put(processCreated.get(i));
            cListos.add(new Proceso(processCreated.get(i).getName(),processCreated.get(i).getTime(),processCreated.get(i).isIsBlock()));
            comunication(processCreated.get(i));
        }
        
        this.available();
    }
    
    public void comunication(Proceso proceso){
        if(proceso.isHaveComunication()){
            cComunicar.add(proceso);
        }
    }
    
    public void available() {
        //myQueueAvailable.put(register);
        Proceso current = myQueueAvailable.get();
        if(!current.isDestroyed()){
            this.cDespachar.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
            execution(current);
        }else{
            if(!current.isIsBlock()){
                this.cDestruir.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
                this.available();
            }else{
                execution(current);
            }
        }
        
    }

    public void execution(Proceso register) {     
        myQueueExecution.put(register);
        Proceso current = myQueueExecution.get();
        current.setTime(current.getTime() - MAX_EXE);
        if (current.getTime() < 1) {
            current.setTime(0);
            cEjecucion.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
            cSalida.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
            if(!this.myQueueAvailable.isEmpty()){
                this.available();
            }
        } else {
            if (current.isIsBlock()) {
                this.cEjecucion.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
                this.cBloquear.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
                block(current);
            } else {
                this.cEjecucion.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
                this.cExpTiempo.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
                this.myQueueAvailable.put(current);
                this.cListos.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
                available();
            }
        }
    }

    public void block(Proceso register) {
        myQueueBlock.put(register);
        Proceso current = myQueueBlock.get();
        this.cBloqueados.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
        if(!current.isDestroyed()){
        this.cDespertar.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
        this.myQueueAvailable.put(current);
        this.cListos.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
        available();
        }else{
            this.cDestruir.add(new Proceso(current.getName(),current.getTime(),current.isIsBlock()));
            this.available();
        }
    }
    
    

    public void print() {
        System.out.println("Disponible");
        for (String register : availableList) {
            System.out.println(register);
        }
        System.out.println("Ejecución");
        for (String register : executionList) {
            System.out.println(register);
        }
        System.out.println("Bloqueado");
        for (String register : isBlockList) {
            System.out.println(register);
        }
        System.out.println("Despachar");
        for (String register : dispatchList) {
            System.out.println(register);
        }
        System.out.println("Despertar");
        for (String register : wakeList) {
            System.out.println(register);
        }
        System.out.println("Bloquear");
        for (String register : blockList) {
            System.out.println(register);
        }
        System.out.println("Expirar");
        for (String register : expireList) {
            System.out.println(register);
        }
        System.out.println("Terminadas");
        for (String register : endList) {
            System.out.println(register);
        }
    }
}
