/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordlem306;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Arrays;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

/**
 *
 * @author ltree
 */
@Named(value = "game")
@ManagedBean
@SessionScoped
public class Game implements Serializable{
    private String[] styleclass = new String[25];
    private String[] eingaben = new String[6];
    private int[] numbers = new int[5];
    String eingabe;
    String word;
    int tries = 0;
    char letterResult;
    public String getEingabe() {
        return eingabe;
    }
    public void setEingabe(String eingabe) {
        this.eingabe = eingabe.toLowerCase();
    }
    public String[] getStyleclass() {
        return styleclass;
    }
    public String getWord() {
        return word;
    }
    public int getTries() {
        return tries;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public Game() {
        
    }
    public char firstLetter(){
    char firstLette;
    if(eingaben[1] == null){
                    firstLette = ' ';
                }
    else{
         firstLette = eingaben[1].charAt(numbers[0]); 
    }
         numbers[0]++;
         return firstLette;
    }
    public char firstLetter1() throws ScriptException{
        char firstLette;
                if(eingaben[2] == null){
                    firstLette = ' ';
                }
                else{
             firstLette = eingaben[2].charAt(numbers[1]);
                }
             numbers[1]++;
             return firstLette;
        }
    public char firstLetter2(){
        char firstLette;
        if(eingaben[3] == null){
             firstLette = ' ';
        }
        else{
             firstLette = eingaben[3].charAt(numbers[2]);
        }
        numbers[2]++;
        return firstLette;
        }
    public char firstLetter3(){
        char firstLette;
        if(eingaben[4] == null){
                    firstLette = ' ';
                }
        else{
             firstLette = eingaben[4].charAt(numbers[3]);
             
        }
             numbers[3]++;
             return firstLette;
        }
    public char firstLetter4(){
        char firstLette;
        if(eingaben[5] == null){
                    firstLette = ' ';
                }
        else{
             firstLette = eingaben[5].charAt(numbers[4]);
        }
             numbers[4]++;
             return firstLette;
        }
    public void lockIn() throws IOException, SQLException{
        if(tries == 0){
            WordlistBean bn = new WordlistBean();
            word = bn.word();    
        }
        tries++;
        if(tries == 1){
            eingaben[1] = eingabe;
            if(word.equals(eingaben[1])){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingaben[1].charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                   styleclass[i+1]= "red";
                }
                else if(word.indexOf(letter) >= 0){
                    styleclass[i+1]= "orange";
                }
            }
        }
        else if(tries == 2){
            eingaben[2] = eingabe;
            if(word.equals(eingaben[2])){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingaben[2].charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    styleclass[i+6]= "red";
                }
                else if(word.indexOf(letter) >= 0){
                    styleclass[i+6]= "orange";
                }
            }
        }
        else if(tries == 3){
            eingaben[3] = eingabe;
            if(word.equals(eingaben[3])){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingaben[3].charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    styleclass[i+11]= "red";
                }
                else if(word.indexOf(letter) >= 0){
                    styleclass[i+11]= "orange";   
                }
            }
        }
        else if(tries == 4){
            eingaben[4] = eingabe;
            if(word.equals(eingaben[4])){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingaben[4].charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    styleclass[i+16]= "red";
                }
                else if(word.indexOf(letter) >= 0){
                    styleclass[i+16]= "orange";
                }
            }
        }
        else if(tries == 5){
            eingaben[5] = eingabe;
            if(word.equals(eingaben[5])){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingaben[5].charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    styleclass[i+21]= "red";
                }
                else if(word.indexOf(letter) >= 0){
                    styleclass[i+21]= "orange";
                }
            }
        }
        else if(tries > 5){
            FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "lose.xhtml");
        }
        Arrays.fill(numbers, 0);   
    }
    public void restart(){
        tries = 0;
        eingabe = null;
        Arrays.fill(styleclass, null);
        Arrays.fill(eingaben, null);
        Arrays.fill(numbers, 0);
        FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "index.xhtml");     
    }
}
