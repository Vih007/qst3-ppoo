🧩 Padrões de Projeto Orientados a Objetos
Prática – Padrão Decorator (Padaria)

👩‍💻 Autoras
Alexia Alves
Maria Vitória Melo

📘 Descrição da Questão

O exercício propôs adaptar um sistema de pedidos de padaria para aplicar o Padrão Decorator, permitindo a composição dinâmica de bolos e customizações — como multicamadas, granulado e dizeres personalizados.

O código original suportava apenas bolos simples. Nosso objetivo foi garantir que a adição de novos bolos (como StrawberryCake) e novos adornos não modificasse as classes existentes, atendendo ao Princípio Aberto/Fechado (OCP).

Foram criados os seguintes componentes:

• Classe abstrata CakeDecorator, base para os decoradores;

• Decoradores concretos:

  • MultiLayeredCake → adiciona $5 e prefixa a descrição;

  • SprinklesCake → adiciona $2 e sufixa a descrição;

  • SayingCake → não altera o custo, mas adiciona um texto customizado.

✅ O resultado final permite composições complexas de bolos, combinando decoradores de forma flexível e mantendo o sistema extensível e desacoplado.

🧠 Uso da Inteligência Artificial (IA)

Durante o desenvolvimento, a IA foi utilizada em etapas específicas para sugerir a estrutura e ajustes de implementação.
Todos os prompts, respostas e decisões foram documentados nos commits correspondentes, feitos na branch master.

🪶 Prompt 1 – Base Decorator e Novo Bolo

Objetivo: Criar a classe abstrata CakeDecorator e o novo bolo StrawberryCake (custo dobrado).
Solução sugerida pela IA:

• Criar a classe CakeDecorator com métodos delegando para o objeto encapsulado.

• Implementar StrawberryCake herdando de Cake, com custo dobrado em relação ao bolo base.

Ajuste: Revisar CakeDecorator para garantir que getCost() e getDescription() chamassem explicitamente o objeto encapsulado, evitando dependência da implementação base.
✅ Resultado: Implementação funcional e documentada.

🪶 Prompt 2 & 3 – Implementação dos Decoradores

Objetivo: Implementar os decoradores MultiLayeredCake, SprinklesCake e SayingCake.
Solução sugerida pela IA:

• Criar MultiLayeredCake adicionando $5 ao custo e prefixando a descrição.

• Criar SprinklesCake adicionando $2 e sufixando a descrição.

• Criar SayingCake adicionando texto personalizado sem alterar o custo.

Ajuste: Tornar o campo de texto do SayingCake injetável via construtor, permitindo múltiplos dizeres (ex: "One of" e "EVERYTHING").
✅ Resultado: Sistema flexível, permitindo múltiplas combinações de adornos.

🪶 Prompt 4 – Configuração Final (Main.java)

Objetivo: Ajustar o Main.java para montar e simular o pedido complexo.
Solução sugerida pela IA:

• Criar instâncias aninhadas dos decoradores para formar o bolo final.

• Exibir o custo total e a descrição resultante.

✅ Resultado: Implementação final validada com sucesso, apresentando o custo total de $29 para o bolo mais complexo

🧩 Histórico de Commits Principais (Branch master)

| Data       | Commit    | Descrição                                                                                             |
| :--------  | :---------| :---------------------------------------------------------------------------------------------------- |
| 07/10/2025 | `4a2c973` | Preparando a infraestrutura do Decorator e adicionando as classes `CakeDecorator` e `StrawberryCake`. |
| 07/10/2025 | `4377d7d` | Adicionando decoradores `MultiLayered` e `Sprinkles`.                                                 |
| 07/10/2025 | `9bb809d` | Adicionando decorador `SayingCake`.                                                                   |
| 07/10/2025 | `7afb582` | Atualizando o `Main` para simular a ordem complexa de bolos.                                          |
