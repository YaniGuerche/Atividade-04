package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {
    protected int Codigo;
    protected String Nome;
    protected String Email;
    protected String Telefone;
    protected LocalDate dataNascimento;
    protected String Usuario;
    protected String Registro;
    
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    public String getRegistro() {
        return Registro;
    }
    public void setRegistro(String registro) {
        Registro = registro;
    }
    
    public BasePessoa(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String registro) {
        Codigo = codigo;
        Nome = nome;
        Email = email;
        Telefone = telefone;
        this.dataNascimento = dataNascimento;
        Usuario = usuario;
        Registro = registro;
    }  
    
}
