package DesignPatterns.AbstractFactory;

public class AbstractMain {
    public static void main(String [] args){
        LaptopOSInterface newLap = new Mac();
        newLap.screen();
        newLap.createAccount();
        newLap.createOs();

        LaptopOSInterface newWindowsLap = new Windows();
        newWindowsLap.screen();
        newWindowsLap.createAccount();
        newWindowsLap.createOs();
    }
}
