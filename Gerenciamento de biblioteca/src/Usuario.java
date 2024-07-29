public class Usuario {
    private String nome;
    private String idUsuario;
    private int livrosEmprestados;
    private static final int MAX_LIVROS_EMPRESTADOS = 5; // Limite de livros que um usuário pode emprestar

    public Usuario(String nome, String idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
        this.livrosEmprestados = 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro() throws Exception {
        if (livrosEmprestados >= MAX_LIVROS_EMPRESTADOS) {
            throw new Exception("Limite de livros emprestados alcançado. Você não pode emprestar mais livros.");
        }
        livrosEmprestados++;
    }

    public void devolverLivro() {
        if (livrosEmprestados > 0) {
            livrosEmprestados--;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", livrosEmprestados=" + livrosEmprestados +
                '}';
    }
}
