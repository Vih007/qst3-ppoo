public class SprinklesCake extends CakeDecorator {

    public SprinklesCake(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        // Adiciona $2 ao custo do bolo decorado
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        // Adiciona " with sprinkles" no final da descrição
        return super.getDescription() + " with sprinkles";
    }
}