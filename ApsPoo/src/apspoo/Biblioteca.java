package apspoo;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Biblioteca {
    ArrayList <Livro> lista_de_livros;
    ArrayList <Usuario> usuarios;

    public Biblioteca() {
        this.lista_de_livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    public void adicionar_livro(Livro livro){
        lista_de_livros.add(livro);
    }
    public void adicionar_usuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void status_livro (String titulo){
        for (Livro livroAtual : lista_de_livros){
            if (livroAtual.getTitulo().equalsIgnoreCase(titulo)){
                if(livroAtual.isDisponivel() == true){
                    System.out.println("O livro"+livroAtual.getTitulo()+"está disponivel.");
                    return;
                } else{
                    System.out.println("O livro está emprestado para: "+livroAtual.getEmprestado_para().getNome());
                    return;
                }
           
            }
        }
        System.out.println("Livro não encontrado na biblioteca.");
    }
    public void emprestar_livro(String titulo, String id_usuario){
        Livro livroEncontrado = null;
        Usuario usuarioEncontrado = null;
        
        for(Livro livroAtual : lista_de_livros){
            if(livroAtual.getTitulo().equalsIgnoreCase(titulo)){
                livroEncontrado = livroAtual;
                break;
            }
        }
        
        for (Usuario usuarioAtual : usuarios){
            if(usuarioAtual.getId().equalsIgnoreCase(id_usuario)){
                usuarioEncontrado = usuarioAtual;
                break;
                }
            }
        
        if (livroEncontrado == null){
            System.out.println("Livro não foi encontrado.");
            return;
        }
        
        if (usuarioEncontrado == null){
            System.out.println("O usuário não foi encontrado.");
            return;
        }
        
        if(!livroEncontrado.isDisponivel()){
            System.out.println("O livro encontrado não está disponivel e ja foi emprestado.");
            return;
        }
        
        int contador = 0;
        
        for(Livro livroAtual : lista_de_livros){
            if (!livroAtual.isDisponivel() && livroAtual.getEmprestado_para().equals(usuarioEncontrado)){
                contador++;
            }
        }
        if (contador >= 3){
            System.out.println("O usuário ja tem mais de 3 livros emprestados.");
            return;
            }
        livroEncontrado.Emprestar(usuarioEncontrado);
        System.out.println("Empréstimo realizado com sucesso para: "+usuarioEncontrado.getNome()+"!");
    }
    public void devolver_livro(String titulo){
        for(Livro livroAtual: lista_de_livros){
            if(livroAtual.getTitulo().equalsIgnoreCase(titulo)){
                livroAtual.Devolver();
                System.out.println("Livro Devolvido com Sucesso!");
                return;
            }
        }
        System.out.println("O livro não foi encontrado!");
    }
    
}
