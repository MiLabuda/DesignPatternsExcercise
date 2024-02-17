package com.example.demo.behavioral;

interface PokemonMediator {
    void sendMessage(String message, Trainer trainer);
    void registerTrainer(Trainer trainer);

}
