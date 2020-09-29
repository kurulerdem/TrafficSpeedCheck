package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String speed= JOptionPane.showInputDialog("Sürücü Kaç km/s hız ile radara takıldı");
        int driver_speed = Integer.parseInt(speed);
        if(driver_speed < 80) {
            JOptionPane.showMessageDialog(null,"Bu sürücüye ceza yazamazsınız");
        }
        else if(driver_speed >80 && driver_speed<150){
            JOptionPane.showMessageDialog(null,"420 TL para cezasına çarptırıldı");

        }
        else if(driver_speed>=150 && driver_speed<300){
            JOptionPane.showMessageDialog(null,"750TL Para cezasına çarptırıldı.");
        }
        else {
            JOptionPane.showMessageDialog(null,"Gecersiz hız girdiniz.. Program Kapatılıyor.");
        }
    }
}
