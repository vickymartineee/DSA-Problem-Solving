package DesignPatterns.AbstractFactory;

public class Mac implements LaptopOSInterface{

    @Override
    public void createOs(){
        System.out.println("Mac Os to be Implemented");
    }

    @Override
    public void createAccount(){
        System.out.println("Create an Apple Account");
    }

    @Override
    public void screen(){
        System.out.println("Super Retina Display");
    }
}
