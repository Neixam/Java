package fr.umlv.fight;

import java.util.Objects;
import java.lang.Override;


/* On ne peut pas faire un record car on veut modifier la valeur des champs de la classe */
public class Robot {

    private final String nameBot;
    private int hp;

    public Robot(String nameBot) {
        this.nameBot = Objects.requireNonNull(nameBot);
        hp = 10;
    }

    public String getName() {
        return (nameBot);
    }

    public boolean rollDice() {
        return (true);
    }

    public void fire(Robot bot) {
        if (bot.hp <= 0)
            throw new IllegalStateException("Is already dead ! you can't");
        if (rollDice()) {
            bot.hp -= 2;
            System.out.println(bot + " a été touché par le " + this + " !");
        }
        else {
        System.out.println(this + " a raté son tire !");
        }
    }

    public boolean isDead() {
        return (hp <= 0);
    }
    @Override
    public String toString() {
        return ("Robot " + nameBot);
    }

    static public void main(String[] args) {
        var bob = new Robot("bob");
        System.out.println(bob);  // affiche "Robot bob"
    }
}
