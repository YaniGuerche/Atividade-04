package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa {
    private String NumCartao;
    private String Documento;
    
    public String getNumCartao() {
        return NumCartao;
    }
    public void setNumCartao(String numCartao) {
        NumCartao = numCartao;
    }
    public String getDocumento() {
        return Documento;
    }
    public void setDocumento(String documento) {
        Documento = documento;
    }
    
    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
        String registro, String numCartao, String documento) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, registro);
        NumCartao = numCartao;
        Documento = documento;
    }
}