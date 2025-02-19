package dev.karoene.estudosjavabasico.store;

public interface PromotionalProduct {

    static void descricaoDaInterface() {  //STATIC
        System.out.println("Todos os produtos estão com desconto.");
    }
    double applyingDiscount(double price);
    default void teste(){
        System.out.println("Desconto aplicado");
    }
    double price();
}

