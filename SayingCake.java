public class SayingCake extends CakeDecorator {
    private String saying;

    public SayingCake(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public int getCost() {
        // Não adiciona nada ao custo 
        return super.getCost();
    }

    @Override
    public String getDescription() {
        // Adiciona o dizer ao final da descrição
        return super.getDescription() + " with saying \"" + saying + "\"";
    }
}