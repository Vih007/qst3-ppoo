/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        
        // 1. Bolo de chocolate [cite: 213]
        order.addCake(new ChocolateCake());

        // 2. Bolo de baunilha com o dizer "PLAIN!" [cite: 214]
        Cake cake2 = new SayingCake(new VanillaCake(), "PLAIN!");
        order.addCake(cake2);

        // 3. Bolo de baunilha com granulado com os dizeres "FANCY" [cite: 215]
        Cake cake3 = new SayingCake(new SprinklesCake(new VanillaCake()), "FANCY");
        order.addCake(cake3);
        
        // 4. Bolo de morango em várias camadas com granulado duplo e dois dizeres
        // "One of" e "EVERYTHING" [cite: 217]
        Cake cake4 = new SayingCake(
                        new SayingCake(
                            new SprinklesCake(
                                new SprinklesCake(
                                    new MultiLayeredCake(
                                        new StrawberryCake()))),
                            "EVERYTHING"), 
                        "One of");
        order.addCake(cake4);

        // Print the order
        order.printOrder();
    }
}