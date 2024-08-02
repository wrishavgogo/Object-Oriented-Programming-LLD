package com.Java.Concept_And_Coding_LLD_Playlist.Video_04_Decorator_Pattern;


public class Example {

    /**
     * Decorator Pattern involves ,
     * having a base class , and there is a class
     * if we want to add additional features on top of the base class
     * we just wrap it with this new Bigger class
     * and use its features
     * **/

    /**
     *
     * Base Class ---->(Apply decorator) New Base Class ----> (Apply Decorator ) another new class
     * **/

    /***
     *
     * Let's Create a Pizza shop
     *
     * We will have BasePizza as an abstract class
     * Base will be the decorators in this case
     *
     * both baseModel and baseOutfits are abstract class
     *
     * Just one thing : BaseOutfit extends BaseModel , and also has a BaseModel
     * attribute inside it . Both has-a and is-a relationship
     * */

    public static void main(String[] args) {
        /**
         * Checkout all the classes below and then come here
         * */

        BasePizza justMargharita = new Margharita();
        System.out.println("Cost of just margharita : " + justMargharita.cost());

        /**
         * Note how we are wrapping margharita inside extra cheese
         * **/
        BasePizza extraCheeseMargharita = new ExtraCheese(justMargharita);

        System.out.println("Price of cheese Margharita : " + extraCheeseMargharita.cost());

        /**
         * ExtracheeseMargharita is still a basePizza hence we were able to
         * send it in the constructor
         * */
        BasePizza oliveCheeseMargharita = new Olives(extraCheeseMargharita);

        System.out.println("Price of olive cheese Margharita : " + oliveCheeseMargharita.cost());

        // user again wanted extra cheese on top of this

        BasePizza cheeseAgain = new ExtraCheese(oliveCheeseMargharita);

        System.out.println("Final cost of the order : " + cheeseAgain.cost());


    }
}



abstract class BasePizza {
    public abstract int cost();
}



class Margharita extends BasePizza {

    @Override
    public int cost() {
        return 100;
    }
}

class FarmHouse extends BasePizza {

    @Override
    public int cost() {
        return 150;
    }
}

/**
 * Toppings is a BasePizza itself
 * */
abstract class Toppings extends BasePizza {

    /**
     * It has a basePizza itself
     * */
    BasePizza basePizza;

    public Toppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

}

class ExtraCheese extends Toppings {

    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        // 20 is for the cheese topping
        return 20 + basePizza.cost();
    }
}

class Olives extends Toppings {

    public Olives(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        // 30  is for olive toppings cost
        return 30 + basePizza.cost();
    }
}

class ChiliFlakes extends Toppings {

    public ChiliFlakes(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return 5 + basePizza.cost();
    }
}






