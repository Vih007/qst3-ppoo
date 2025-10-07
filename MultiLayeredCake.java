public class MultiLayeredCake extends CakeDecorator {

    public MultiLayeredCake(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        // Adiciona $5 ao custo do bolo decorado
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        // Adiciona "Multi-layered " no início da descrição
        return "Multi-layered " + super.getDescription();
    }
}