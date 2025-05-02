package DesignPatterns.Builder;

public class IndianFoodDirector {
    private IndianFoodBuilder indianFoodBuilder;

    public IndianFoodDirector(IndianFoodBuilder indianFoodBuilder) {
        this.indianFoodBuilder = indianFoodBuilder;
    }

    public IndianFood constructIndianFood() {
        indianFoodBuilder.setCutlery("Spoons");
        indianFoodBuilder.setDishName("Tandoor");
        return indianFoodBuilder.getIndianFood();
    }

}
