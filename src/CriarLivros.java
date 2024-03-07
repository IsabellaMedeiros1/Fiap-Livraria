//CLASSE DE EXECUÇÃO
public class CriarLivros {
    public static void main(String[] args) {
        //instanciando um objeto (instanciar = criar o objeto na memória
            // tipoObjeto nomeObjeto = operadorInstanciação construtor

        Livro favorito = new Livro ();
        favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Talkien";
        favorito.valor = 37.27;
        favorito.editora = "Harper Collins";
        favorito.resumo = "Bilbo era um dos...";
        favorito.tipoCapa = "COMUM";

        System.out.println("Meu livro favorito é: " + favorito.titulo + "\nSeu autor é: "+ favorito.autor);
        Livro meuLivro = new Livro();
        meuLivro.titulo = "Algo";
        meuLivro.valor = 58.98;
        meuLivro.autor = "Titia";

    }
}
