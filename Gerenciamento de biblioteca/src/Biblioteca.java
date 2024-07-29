import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Gerenciavel<Livro>, Gerenciavel<Usuario> {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    @Override
    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    @Override
    public void remover(Livro livro) {
        livros.remove(livro);
    }

    @Override
    public List<Livro> listar() {
        return livros;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public void emprestarLivro(Livro livro, Usuario usuario) throws Exception {
        if (!livros.contains(livro)) {
            throw new Exception("Livro não encontrado na biblioteca.");
        }
        usuario.emprestarLivro();
        Emprestimo emprestimo = new Emprestimo(livro, usuario, new Date());
        emprestimos.add(emprestimo);
    }

    public void devolverLivro(Emprestimo emprestimo) {
        emprestimo.devolverLivro();
        emprestimos.remove(emprestimo);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "livros=" + livros +
                ", usuarios=" + usuarios +
                ", emprestimos=" + emprestimos +
                '}';
    }
}
