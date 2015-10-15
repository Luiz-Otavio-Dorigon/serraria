package br.com.serraria.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Produto {
    
    private int codigo;
    private String descricao;
    private float especura;
    private float largura;
    private float comprimento;

    public Produto(int codigo, String descricao, float especura, float largura, float comprimento) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.especura = especura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Produto(String descricao, float especura, float largura, float comprimento) {
        this.descricao = descricao;
        this.especura = especura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Produto() {}
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getEspecura() {
        return especura;
    }

    public void setEspecura(float especura) {
        this.especura = especura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

}