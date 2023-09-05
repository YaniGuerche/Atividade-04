package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    private String contaCorrente;
    private String Cracha;
   
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return Cracha;
    }
    public void setCracha(String cracha) {
        Cracha = cracha;
    }
    
    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String registro, String contaCorrente, String cracha) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, registro);
        this.contaCorrente = contaCorrente;
        Cracha = cracha;
    }
    
}
