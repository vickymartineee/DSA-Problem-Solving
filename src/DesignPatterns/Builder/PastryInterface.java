package DesignPatterns.Builder;

public interface PastryInterface extends FoodInterface{

    void setCountry(String country);
    void setType(String type);
    void setFlavour(String flavour);
}
