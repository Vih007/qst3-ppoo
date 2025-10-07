public abstract class CakeDecorator extends Cake {
    protected Cake decoratedCake;

    public CakeDecorator(Cake cake) {
        this.decoratedCake = cake;
    }

    @Override
    public int getCost() {
        // Delega o custo para o bolo que está sendo decorado
        return decoratedCake.getCost();
    }

    @Override
    public String getDescription() {
        // Delega a descrição para o bolo que está sendo decorado
        return decoratedCake.getDescription();
    }
}