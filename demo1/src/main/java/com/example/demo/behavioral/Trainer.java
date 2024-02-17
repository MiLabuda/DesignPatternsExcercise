package com.example.demo.behavioral;

class Trainer {
    private String name;
    private PokemonMediator mediator;

    public Trainer(String name, PokemonMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerTrainer(this);
    }

    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
}
