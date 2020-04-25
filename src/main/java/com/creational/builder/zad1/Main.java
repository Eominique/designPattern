package com.creational.builder.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
List<GameCharacter> gameCharacterList=new ArrayList<>();
gameCharacterList.add(new GameCharacter.Builder().setName("Janusz").setHealth(100).createGame());
gameCharacterList.add(new GameCharacter.Builder().setName("Grazyna").setHealth(150).createGame());
gameCharacterList.add(new GameCharacter.Builder().setName("Seba").setMana(50).createGame());
gameCharacterList.add(new GameCharacter.Builder().setName("Karina").setNumberOfPoints(15).createGame());

gameCharacterList.forEach(System.out::println);
    }
}
