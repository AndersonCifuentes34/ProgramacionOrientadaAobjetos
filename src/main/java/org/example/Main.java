package org.example;

import org.example.Ingredientes.PizzaItaliana;
import org.example.Queso.Topping;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PizzaItaliana pizzaItaliana1 = new PizzaItaliana("Italiana", 125, new ArrayList<>(), "de tomate", 10);
        pizzaItaliana1.agregarIngrediente("pepperoni");
        pizzaItaliana1.agregarIngrediente("mozzarella");
        pizzaItaliana1.preparar();
        System.out.println(pizzaItaliana1);

        PizzaItaliana pizzaItaliana2 = new PizzaItaliana("Italiana", 140, new ArrayList<>(), "de tomate", 15);
        pizzaItaliana2.agregarIngrediente("pepperoni");
        pizzaItaliana2.agregarIngrediente("mozzarella");

        Topping queso = new Topping("queso, champiñones");
        queso.agregar(pizzaItaliana2);
        System.out.println(pizzaItaliana2);

    }
}
