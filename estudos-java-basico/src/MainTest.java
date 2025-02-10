import dev.karoene.estudosjavabasico.models.Author;
import dev.karoene.estudosjavabasico.models.LivroDigital;
import dev.karoene.estudosjavabasico.models.LivroFisico;
import dev.karoene.estudosjavabasico.store.ShoppingCart;

public class MainTest {

    public static void main(String[] args){
        Author author1 = new Author("J.R.R.TOLKIEN", "dkenh@fr");
        LivroFisico livro1 = new LivroFisico("Hobbit", 1980, 23424, author1, 100, true);
        LivroDigital livro2 = new LivroDigital("Silmarilion", 19870, 3455, author1, 150, 120);
        LivroFisico livro3 = new LivroFisico("Queda de Numenor", 1980, 23424, author1, 300, true);
        //Aqui eu estaria recuperando todos os produtos cadastrado no banco de produtos

        ShoppingCart cart = new ShoppingCart(1);

        cart.add(livro2);
        cart.add(livro1);
        cart.showCart();

    }


}
