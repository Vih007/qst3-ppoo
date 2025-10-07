public class StrawberryCake extends Cake {
    private final int STRAWBERRY_CAKE_COST = 20;

    @Override
    public int getCost() {
        return STRAWBERRY_CAKE_COST;
    }

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
}