public class TesteLogin {
    public static void main(String[] args) {
        Login login = new Login("admin", "1234");

        try {
            // Tentativa de login com as credenciais corretas
            boolean sucesso = login.fazerLogin("admin", "1234");
            System.out.println("Login bem-sucedido: " + sucesso);
            
            // Tentativa de login com credenciais incorretas para demonstração
            sucesso = login.fazerLogin("usuario", "senha");
            System.out.println("Login bem-sucedido: " + sucesso);
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
