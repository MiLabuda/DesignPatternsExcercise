package com.example.demo.behavioral;

public class PokemonMediatorExample {
    public static void main(String[] args) {
        // Utworzenie mediatora
        PokemonMediator chatroom = new PokemonChatroom();

        // Utworzenie uczestników
        Trainer ash = new Trainer("Ash", chatroom);
        Trainer misty = new Trainer("Misty", chatroom);
        Trainer brock = new Trainer("Brock", chatroom);

        // Wysłanie wiadomości
        ash.sendMessage("Hi, trainers! Let's talk about our Pokemon!");
        misty.sendMessage("Sure, Ash! My Starmie has learned a new move.");
        brock.sendMessage("That's interesting, Misty! My Onix is evolving!");

        /*
        Oczekiwane wyjście:
        Ash sends: Hi, trainers! Let's talk about our Pokemon!
        Misty receives: Hi, trainers! Let's talk about our Pokemon!
        Brock receives: Hi, trainers! Let's talk about our Pokemon!
        Misty sends: Sure, Ash! My Starmie has learned a new move.
        Ash receives: Sure, Ash! My Starmie has learned a new move.
        Brock receives: Sure, Ash! My Starmie has learned a new move.
        Brock sends: That's interesting, Misty! My Onix is evolving!
        Ash receives: That's interesting, Misty! My Onix is evolving!
        Misty receives: That's interesting, Misty! My Onix is evolving!
        */
    }
}
