package apspoo;
public class Livro {
    String titulo;
    String autor;
    int ano;
    boolean disponivel;
    Usuario emprestado_para;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
        this.emprestado_para = null;
    }
    public void Emprestar(Usuario usuario){
        disponivel = false;
        emprestado_para = usuario;
    }
    public void Devolver(){
        disponivel = true;
        emprestado_para = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Usuario getEmprestado_para() {
        return emprestado_para;
    }

    public void setEmprestado_para(Usuario emprestado_para) {
        this.emprestado_para = emprestado_para;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", Autor=" + autor + ", Ano=" + ano + ", Disponibilidade=" + disponivel + ", Emprestado Para=" + emprestado_para + '}';
    }
    
}
