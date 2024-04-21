public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        // Suponha que os valores corretos são "Felipe" para usuário e "0609" para senha.
        if ("Felipe".equals(this.usuario) && "0609".equals(this.senha)) {
            return true;
        } else {
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }
    }
}
