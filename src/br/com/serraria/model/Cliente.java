package br.com.serraria.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Cliente {

    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    private String cnpj;
    private float divida;

    public Cliente() {
    }

    public Cliente(String cnpj) {
        this.cnpj = cnpj;
    }

    public Cliente(float divida, int codigo) {
        this.divida = divida;
        this.codigo = codigo;
    }

    public Cliente(String nome, String telefone, String email, String cnpj, float divida) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.divida = divida;
    }

    public Cliente(int codigo, String nome, String telefone, String email, String cnpj, float divida) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.divida = divida;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getDivida() {
        return divida;
    }

    public void setDivida(float divida) {
        this.divida = divida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
