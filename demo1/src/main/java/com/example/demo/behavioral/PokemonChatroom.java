package com.example.demo.behavioral;

import java.util.ArrayList;
import java.util.List;

class PokemonChatroom implements PokemonMediator {
    private List<Trainer> trainers;

    public PokemonChatroom() {
        this.trainers = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Trainer sender) {
        for (Trainer trainer : trainers) {
            // Sprawdzenie, czy odbiorca nie jest nadawcą
            if (trainer != sender) {
                trainer.receiveMessage(message);
            }
        }
    }

    @Override
    public void registerTrainer(Trainer trainer) {
        trainers.add(trainer);
    }
}

