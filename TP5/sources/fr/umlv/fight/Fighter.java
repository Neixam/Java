package fr.umlv.fight;

import java.util.Random;


public class Fighter extends Robot {
/* 1) Un générateur pseudo-aléatoire est une application qui associe a x une autre valeur et que l'on remplace x par son résultat => f(f(f(x))) où x est la graine 
   3) Car si l'on ne private pas un utilisateur de l'api pourrait en faire des dépendances fortes
   5) On peut en conclure que le copier-coller implique forcément l'implémentation des problèmes existants dans le collage
   6) public
*/
    private final Random r; // exemple de sous-typage
    public Fighter(String nameHum, long seed) {
        super(nameHum);
        r = new Random(seed);
    }
    @Override
    public boolean rollDice() { // exemple de polymorphisme
        return (r.nextBoolean());
    }
    @Override
    public String toString() {
        return ("Fighter " + getName());
    }
}
