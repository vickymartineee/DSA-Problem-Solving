package DesignPatterns.Builder;

public class IndianFood implements IndianFoodInterface {

    private String state;
    private boolean isSpicy;
     String name;
    private String cutlery;
    private long items;
    private long timeDuration;

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void isSpicy(boolean isSpicy) {
        this.isSpicy = isSpicy;
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
