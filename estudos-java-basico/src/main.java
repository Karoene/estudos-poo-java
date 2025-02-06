
import dev.karoene.estudosjavabasico.models.*;
import dev.karoene.estudosjavabasico.store.*;


public class main {
    public static void main(String[] arg){

        //

        Author author1 = new Author("J.J.R.Tolkien", "tokinho@email");
        LivroDigital livro1 = new LivroDigital("Silmarilion", 1890, 476565739, author1, 235, 100);
        livro1.printFormattedData();
        author1.printFormattedData();
        //
        Author author2 = new Author("George Martin", "george@email");
        LivroFisico livro2 = new LivroFisico("Cronicas de Gelo", 1999, 600, author2, 101, false);
        //livro2.printFormattedData();
        //
        LivroFisico livro4 = new LivroFisico("poder do habito", 2010, 3546223,author1, 102, true);
        livro4.printFormattedData();
        //
        LivroDigital livro3 = new LivroDigital("silmalirion", 1980, 32424,author1, 103,100);
        livro3.printFormattedData();

        Livro livro5 = new LivroFisico("poder do habito", 2010, 3546223,author1, 104, false);

        Venda venda1 = new Venda();


        venda1.executeBookSale(livro3);  //ISSO É POLIMORFISMO
        //venda1.executeBookSale(livro4);
        //venda1.executeBookSale(livro5);

        ShoppingCart cart1 = new ShoppingCart(1);
        cart1.add(livro4);


    }
}
