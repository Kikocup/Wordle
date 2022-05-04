/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordlem306;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
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

    String eingabe = null;
    String eingabe1 = null;
    String eingabe2 = null;
    String eingabe3 = null;
    String eingabe4 = null;
    String eingabe5 = null;
    String word = "avoid";
    String styleclass11;
    String styleclass12;
    String styleclass13;
    String styleclass14;
    String styleclass15;
    String styleclass21;
    String styleclass22;
    String styleclass23;
    String styleclass24;
    String styleclass25;
    String styleclass31;
    String styleclass32;
    String styleclass33;
    String styleclass34;
    String styleclass35;
    String styleclass41;
    String styleclass42;
    String styleclass43;
    String styleclass44;
    String styleclass45;
    String styleclass51;
    String styleclass52;
    String styleclass53;
    String styleclass54;
    String styleclass55;

    public String getStyleclass12() {
        return styleclass12;
    }

    public String getStyleclass13() {
        return styleclass13;
    }

    public String getStyleclass14() {
        return styleclass14;
    }

    public String getStyleclass15() {
        return styleclass15;
    }

    public String getStyleclass21() {
        return styleclass21;
    }

    public String getStyleclass22() {
        return styleclass22;
    }

    public String getStyleclass23() {
        return styleclass23;
    }

    public String getStyleclass24() {
        return styleclass24;
    }

    public String getStyleclass25() {
        return styleclass25;
    }

    public String getStyleclass31() {
        return styleclass31;
    }

    public String getStyleclass32() {
        return styleclass32;
    }

    public String getStyleclass33() {
        return styleclass33;
    }

    public String getStyleclass34() {
        return styleclass34;
    }

    public String getStyleclass35() {
        return styleclass35;
    }

    public String getStyleclass41() {
        return styleclass41;
    }

    public String getStyleclass42() {
        return styleclass42;
    }

    public String getStyleclass43() {
        return styleclass43;
    }

    public String getStyleclass44() {
        return styleclass44;
    }

    public String getStyleclass45() {
        return styleclass45;
    }

    public String getStyleclass51() {
        return styleclass51;
    }

    public String getStyleclass52() {
        return styleclass52;
    }

    public String getStyleclass53() {
        return styleclass53;
    }

    public String getStyleclass54() {
        return styleclass54;
    }

    public String getStyleclass55() {
        return styleclass55;
    }

    public String getStyleclass11() {
        return styleclass11;
    }
    int number = 0;
    int number1;
    int number2;
    int number3;
    int number4;
    String class1;
    int tries = 0;
    char letterResult = 'x';
    String ausgabe = "Vallahi es gaht";
    public Game() {
        
    }
    public void setEingabe1(String eingabe1) {
        this.eingabe1 = eingabe1;
    }

    public void setEingabe2(String eingabe2) {
        this.eingabe2 = eingabe2;
    }

    public void setEingabe3(String eingabe3) {
        this.eingabe3 = eingabe3;
    }

    public void setEingabe4(String eingabe4) {
        this.eingabe4 = eingabe4;
    }
    public char firstLetter(){
        char firstLette;
    if(eingabe1 == null){
                    firstLette = ' ';
                }
    else{
         firstLette = eingabe1.charAt(number); 
    }
         number++;
         return firstLette;
    }
    public char firstLetter1() throws ScriptException{
        char firstLette;
                if(eingabe2 == null){
                    firstLette = ' ';
                }
                else{
             firstLette = eingabe2.charAt(number1);
                }
             number1++;
             return firstLette;
        }
    public char firstLetter2(){
        char firstLette;
        if(eingabe3 == null){
             firstLette = ' ';
        }
        else{
             firstLette = eingabe3.charAt(number2);
        }
        number2++;
        return firstLette;
        }
    public char firstLetter3(){
        char firstLette;
        if(eingabe4 == null){
                    firstLette = ' ';
                }
        else{
             firstLette = eingabe4.charAt(number3);
             
        }
             number3++;
             return firstLette;
        }
    public char firstLetter4(){
        char firstLette;
        if(eingabe5 == null){
                    firstLette = ' ';
                }
        else{
             firstLette = eingabe5.charAt(number4);
        }
             number4++;
             return firstLette;
        }
    public String getEingabe() {
        return eingabe;
    }

    public void setEingabe(String eingabe) {
        this.eingabe = eingabe;
    }
    public void lockIn() throws IOException, SQLException{
        if(tries == 0){
            WordlistBean bn = new WordlistBean();
            word = bn.word();    
        }
        tries++;
        if(tries == 1){
            eingabe1 = eingabe;
            if(word.equals(eingabe1)){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingabe1.charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    if(i == 0){
                            styleclass11 = "red";
                    }
                    else if(i == 1){
                        styleclass12 = "red";
                    }
                    else if(i == 2){
                        styleclass13 = "red";
                    }
                    else if(i == 3){
                        styleclass14 = "red";
                    }
                    else if(i == 4){
                        styleclass15 = "red";
                    }   
                }
                else if(word.indexOf(letter) >= 0){
                    if(i == 0){
                        styleclass11 = "orange";
                    }
                    else if(i == 1){
                        styleclass12 = "orange";
                    }
                    else if(i == 2){
                        styleclass13 = "orange";
                    }
                    else if(i == 3){
                        styleclass14 = "orange";
                    }
                    else if(i == 4){
                        styleclass15 = "orange";
                    }   
                }
            }
        }
        else if(tries == 2){
            eingabe2 = eingabe;
            if(word.equals(eingabe2)){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingabe2.charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    if(i == 0){
                        styleclass21 = "red";
                    }
                    else if(i == 1){
                        styleclass22 = "red";
                    }
                    else if(i == 2){
                        styleclass23 = "red";
                    }
                    else if(i == 3){
                        styleclass24 = "red";
                    }
                    else if(i == 4){
                        styleclass25 = "red";
                    }   
                }
                else if(word.indexOf(letter) >= 0){
                    if(i == 0){
                        styleclass21 = "orange";
                    }
                    else if(i == 1){
                        styleclass22 = "orange";
                    }
                    else if(i == 2){
                        styleclass23 = "orange";
                    }
                    else if(i == 3){
                        styleclass24 = "orange";
                    }
                    else if(i == 4){
                        styleclass25 = "orange";
                    }   
                }
            }
        }
        else if(tries == 3){
            eingabe3 = eingabe;
            if(word.equals(eingabe3)){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingabe3.charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    if(i == 0){
                            styleclass31 = "red";
                    }
                    else if(i == 1){
                        styleclass32 = "red";
                    }
                    else if(i == 2){
                        styleclass33 = "red";
                    }
                    else if(i == 3){
                        styleclass34 = "red";
                    }
                    else if(i == 4){
                        styleclass35 = "red";
                    }   
                }
                else if(word.indexOf(letter) >= 0){
                    if(i == 0){
                        styleclass31 = "orange";
                    }
                    else if(i == 1){
                        styleclass32 = "orange";
                    }
                    else if(i == 2){
                        styleclass33 = "orange";
                    }
                    else if(i == 3){
                        styleclass34 = "orange";
                    }
                    else if(i == 4){
                        styleclass35 = "orange";
                    }   
                }
            }
        }
        else if(tries == 4){
            eingabe4 = eingabe;
            if(word.equals(eingabe4)){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingabe4.charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    if(i == 0){
                            styleclass41 = "red";
                    }
                    else if(i == 1){
                        styleclass42 = "red";
                    }
                    else if(i == 2){
                        styleclass43 = "red";
                    }
                    else if(i == 3){
                        styleclass44 = "red";
                    }
                    else if(i == 4){
                        styleclass45 = "red";
                    }   
                }
                else if(word.indexOf(letter) >= 0){
                    if(i == 0){
                        styleclass41 = "orange";
                    }
                    else if(i == 1){
                        styleclass42 = "orange";
                    }
                    else if(i == 2){
                        styleclass43 = "orange";
                    }
                    else if(i == 3){
                        styleclass44 = "orange";
                    }
                    else if(i == 4){
                        styleclass45 = "orange";
                    }   
                }
            }
        }
        else if(tries == 5){
            eingabe5 = eingabe;
            if(word.equals(eingabe5)){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "win.xhtml");
            }
            for(int i = 0; i<5; i++){
                char letter = eingabe5.charAt(i);
                letterResult = word.charAt(i);
                if(letter == letterResult){
                    if(i == 0){
                            styleclass51 = "red";
                    }
                    else if(i == 1){
                        styleclass52 = "red";
                    }
                    else if(i == 2){
                        styleclass53 = "red";
                    }
                    else if(i == 3){
                        styleclass54 = "red";
                    }
                    else if(i == 4){
                        styleclass55 = "red";
                    }   
                }
                else if(word.indexOf(letter) >= 0){
                    if(i == 0){
                        styleclass51 = "orange";
                    }
                    else if(i == 1){
                        styleclass52 = "orange";
                    }
                    else if(i == 2){
                        styleclass53 = "orange";
                    }
                    else if(i == 3){
                        styleclass54 = "orange";
                    }
                    else if(i == 4){
                        styleclass55 = "orange";
                    }   
                }
            }
        }
        else if(tries > 5){
            FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "lose.xhtml");
           
        }
        number = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        
    }

    public String getEingabe1() {
        return eingabe1;
    }

    public String getEingabe2() {
        return eingabe2;
    }

    public String getEingabe3() {
        return eingabe3;
    }

    public String getEingabe4() {
        return eingabe4;
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
    public void restart(){
        number = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        tries = 0;
        styleclass11 = null;
        styleclass12 = null;
    styleclass13 = null;
   styleclass14 = null;
   styleclass15 = null;
   styleclass21 = null;
   styleclass22 = null;
   styleclass23 = null;
   styleclass24 = null;
   styleclass25 = null;
   styleclass31 = null;
   styleclass32 = null;
   styleclass33 = null;
   styleclass34 = null;
   styleclass35 = null;
   styleclass41 = null;
   styleclass42 = null;
   styleclass43 = null;
   styleclass44 = null;
   styleclass45 = null;
   styleclass51 = null;
   styleclass52 = null;
   styleclass53 = null;
   styleclass54 = null;
   styleclass55 = null;
   eingabe1 = null;
   eingabe2 = null;
   eingabe3 = null;
   eingabe4 = null;
   eingabe5 = null;
   FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "index.xhtml");
           
    }
}
