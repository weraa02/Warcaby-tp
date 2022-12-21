package org.example.Data;

import org.example.GUI.HelloApplication;

import java.util.Objects;

public class Date {
    //klasa do pobierania i przekazywania danych do innych pakietów

    //rozmiar planszy
    private int size=0;
    private void setSize(){
        HelloApplication helloApplication=new HelloApplication();
        if(Objects.equals(helloApplication.getOption1(), "Warcaby polskie")){
            //size=100;
            size = 10;
        }
        else if((Objects.equals(helloApplication.getOption2(), "Warcaby dwuliniowe"))||(Objects.equals(helloApplication.getOption3(), "Warcaby hiszańskie"))){
            //size=64;
            size = 8;
        }

    }
    //pozmieniałam size tak by zamiast iloscia wszystkich pol, byl tylko dlugoscia jednego boku, jest wtedy bardziej uzyteczny i nie trzeba liczyc pierawiastok itd

    public int getSize(){
        setSize();
        return size;
    }



}
