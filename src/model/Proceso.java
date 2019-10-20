/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nicolas
 */
public class Proceso implements Comparable<Proceso>{
    
    private int priority;
    private String name;
    private int time;
    private boolean isBlock;
    private boolean isDestroyed;
    private boolean haveComunication;
    
    
    public Proceso(String name,int time,boolean isBlock){
        this.name=name;
        this.time=time;
        this.isBlock=isBlock;
    }
    
    public Proceso(String name,int time,int priority, boolean isBlock,boolean haveComunication,boolean isDestroyed){
        this.priority = priority;
        this.name=name;
        this.time=time;
        this.isBlock=isBlock;
        this.isDestroyed = isDestroyed;
        this.haveComunication = haveComunication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isIsBlock() {
        return isBlock;
    }

    public void setIsBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setIsDestroyed(boolean isDestroyed) {
        this.isDestroyed = isDestroyed;
    }

    public boolean isHaveComunication() {
        return haveComunication;
    }

    public void setHaveComunication(boolean haveComunication) {
        this.haveComunication = haveComunication;
    }

    @Override
    public int compareTo(Proceso proceso) {
        if(this.priority < proceso.priority){
            return -1;
        }else if(this.priority > proceso.priority){
            return 1;
            }else{
            return 0;
        }
    }
    
    
}
