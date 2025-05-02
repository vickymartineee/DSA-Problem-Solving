package DesignPatterns.Builder;

public class Tandoori implements IndianFoodBuilder {

    private IndianFood tandoori;

    public Tandoori(){
        this.tandoori = new IndianFood();
    }

    @Override
    public IndianFood getIndianFood() {
        return tandoori;
    }

    @Override
    public void setState(String state) {
        tandoori.setState(state);
    }

    @Override
    public void isSpicy(boolean isSpicy) {
        tandoori.isSpicy(true);
    }

    @Override
    public void setDishName(String name) {
        tandoori.setDishName("Tandoori");
    }

    @Override
    public void setCutlery(String cutlery) {
        tandoori.setCutlery(cutlery);
    }

    @Override
    public void setItemCount(long items) {
        tandoori.setItemCount(items);
    }

    @Override
    public void setTimeDuration(long timeDuration) {
        tandoori.setItemCount(timeDuration);
    }

    public IndianFood getTandoori() {
        return tandoori;
    }

    public String getCutlery(){
        return this.tandoori.name;
    }
    @Override
    public String toString() {
        return "Tandoori{" +
                "tandoori=" + tandoori.name +
                '}';
    }
}
