package apspoo;
public class ApsPoo {
    public static void main(String[] args) {
       Biblioteca biblioteca = new Biblioteca();
       
       //Cadastrando Usuarios
       Usuario u1 = new Usuario ("Nan", "R545");
       Usuario u2 = new Usuario ("Luquete", "L0407");
       
       biblioteca.adicionar_usuario(u1);
       biblioteca.adicionar_usuario(u2);
       
       //Cadastrando livros
       Livro l1 = new Livro("Jesus Nao e Quem Voce Pensa","Tiago Mattes",2024);
       Livro l2 = new Livro("O Deus que Destroi Sonhos","Rodrigo Bibo",2025);
       Livro l3 = new Livro("Entendendo Algoritmos","Aditya Bhargava",2017);
       Livro l4 = new Livro("Use a Cabeca Java","Alta Books",2024);
       Livro l5 = new Livro("Código Limpo","Robert C. Martin",2009);
       Livro l6 = new Livro("A Marca da Vitoria","Phil Knight",2016);
       Livro l7 = new Livro("Roube como um artista","Austin Kleon",2013);
       Livro l8 = new Livro("The Mamba Mentality: How I Play","Kobe Bryant", 2018);
       
       biblioteca.adicionar_livro(l1);
       biblioteca.adicionar_livro(l2);
       biblioteca.adicionar_livro(l3);
       biblioteca.adicionar_livro(l4);
       biblioteca.adicionar_livro(l5);
       biblioteca.adicionar_livro(l6);
       biblioteca.adicionar_livro(l7);
       biblioteca.adicionar_livro(l8);
       
       //Verificando Status do livro 
       System.out.println("Teste 1 - STATUS");
       biblioteca.status_livro("Jesus Nao e Quem Voce Pensa");
       
       //Realizando Emprestimos
       System.out.println("\nTeste 2 - EMPRESTANDO LIVROS");
       biblioteca.emprestar_livro("Jesus Nao e Quem Voce Pensa", "R545");
       biblioteca.emprestar_livro("Use a Cabeca Java", "L0407");
       biblioteca.emprestar_livro("A Marca da Vitoria", "R545");
       biblioteca.emprestar_livro("The Mamba Mentality: How I Play", "L0407");
       biblioteca.emprestar_livro("O Deus que Destroi Sonhos", "L0407");
       
       
       
       //Verificando Status do livro Apos Emprestimo
        System.out.println("\nTeste 3 - STATUS POS EMPRESTIMO");
        biblioteca.status_livro("Jesus Nao e Quem Voce Pensa");
        biblioteca.status_livro("Use a Cabeaca Java");
        biblioteca.status_livro("A Marca da Vitoria");
        biblioteca.status_livro("The Mamba Mentality: How I Play");
        
       //Verificando Limite de 3 livros por Usuário
        System.out.println("\nTeste 4 - LIMITE DE 3 LIVROS");
        biblioteca.emprestar_livro("Roube como um artista", "L0407");
        
       //Pegando livro que ja foi emprestado
        System.out.println("\nTeste 5 - LIVRO JA EMPRESTADO");
        biblioteca.emprestar_livro("Use a Cabeca Java", "R545");
        
       //Devolução de Livros e teste de pegar livro novamente
        System.out.println("\nTeste 6 - DEVOLVENDO LIVRO E PEGANDO NOVAMENTE");
        biblioteca.devolver_livro("Use a Cabeca Java");
        biblioteca.emprestar_livro("Use a Cabeca Java", "R545");
        
       
    }
    
}
