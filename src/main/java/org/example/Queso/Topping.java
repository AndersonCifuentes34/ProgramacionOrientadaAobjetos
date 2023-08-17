package org.example.Queso;

import org.example.LaPizza.Pizza;

public class Topping {
        private String nombre;

        public Topping(String nombre) {
            this.nombre = nombre;
        }

        public void agregar(Pizza pizza) {
            pizza.ingredientes.add(nombre);
        }
}
