package DesignPatterns.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        IndianFoodBuilder indianFood = new Tandoori();
        IndianFoodDirector indianFoodDirector = new IndianFoodDirector(indianFood);
        IndianFood indieFood = indianFoodDirector.constructIndianFood();
        System.out.println(indieFood.name);
    }
}
