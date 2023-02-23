package com.imanuwel.tips.nonaccess;

class Player {
    private static int count = 0;
    private String name;

    public Player(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        System.out.println(count);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StaticModifierRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        System.out.println(Player.getCount());

        Player player2 = new Player("Federer");
        System.out.println(Player.getCount());
    }
}
