package DesignPatterns.Builder;

public class Pastry implements PastryInterface {
    private String name;
    private String cutlery;
    private long items;
    private long timeDuration;
    private String type;
    private String country;
    private String flavour;

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public void setDishName(String name) {
        this.name = name;
    }

    @Override
    public void setCutlery(String cutlery) {
        this.cutlery = cutlery;
    }

    @Override
    public void setItemCount(long items) {
        this.items = items;
    }

    @Override
    public void setTimeDuration(long timeDuration) {
        this.timeDuration = timeDuration;
    }
}
