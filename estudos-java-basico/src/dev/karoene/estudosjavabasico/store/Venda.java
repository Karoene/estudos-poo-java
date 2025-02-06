package dev.karoene.estudosjavabasico.store;
import dev.karoene.estudosjavabasico.models.*;

public class Venda {
    /**
    public void executeBookSale(LivroDigital livro){
        livro.printFormattedData();  //E ISSO É SOBRECARGA
        livro.getPrice();
        livro.getFileSizeMB();
        System.out.println("Vendido");
    }


    public void executeBookSale(LivroFisico livro){
        livro.printFormattedData();
        livro.getPrice();
        livro.getIsNew();

        System.out.println("Vendido");
    }**/

    public void executeBookSale(PromotionalProduct livro){
        PromotionalProduct.descricaoDaInterface();
        System.out.println(livro.applyingDiscount(0.1));
        livro.teste();
        System.out.println("Vendido");
    }


}
