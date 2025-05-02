package DesignPatterns.AbstractFactory;

public class Windows implements  LaptopOSInterface{
    @Override
    public void createOs(){
        System.out.println("Windows 11 - Os to be Implemented");
    }

    @Override
    public void createAccount(){
        System.out.println("Create an Microsoft Account");
    }

    @Override
    public void screen(){
        System.out.println("OLED Display");
    }
}
