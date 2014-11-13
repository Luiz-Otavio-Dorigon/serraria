/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package romaneio.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class ItensRomaneio {

    private int numero_romaneio;
    private int sequencia;
    private int codigo_produto;
    private float valor_unit;
    private float especura;
    private float largura;
    private float comprimento;
    private int num_pecas;
    private float metros;
    private float total;
    private String produto;
    private String tipo;

    public ItensRomaneio() {}
    
    public ItensRomaneio(int numero_romaneio, int sequencia, int codigo_produto, float valor_unit, float especura, 
            float largura, float comprimento, int num_pecas, float metros, float total, String produto, String tipo) {
        this.numero_romaneio = numero_romaneio;
        this.sequencia = sequencia;
        this.codigo_produto = codigo_produto;
        this.valor_unit = valor_unit;
        this.especura = especura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.num_pecas = num_pecas;
        this.metros = metros;
        this.total = total;
        this.produto = produto;
        this.tipo = tipo;
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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero_romaneio() {
        return numero_romaneio;
    }

    public void setNumero_romaneio(int numero_romaneio) {
        this.numero_romaneio = numero_romaneio;
    }

    public float getValor_unit() {
        return valor_unit;
    }

    public void setValor_unit(float valor_unit) {
        this.valor_unit = valor_unit;
    }

    public int getNum_pecas() {
        return num_pecas;
    }

    public void setNum_pecas(int num_pecas) {
        this.num_pecas = num_pecas;
    }

    public float getMetros() {
        return metros;
    }

    public void setMetros(float metros) {
        this.metros = metros;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ItensRomaneio{" + "numero_romaneio=" + numero_romaneio + ", sequencia=" + sequencia + ", codigo_produto=" + codigo_produto + ", valor_unit=" + valor_unit + ", especura=" + especura + ", largura=" + largura + ", comprimento=" + comprimento + ", num_pecas=" + num_pecas + ", metros=" + metros + ", total=" + total + ", produto=" + produto + ", tipo=" + tipo + '}';
    }
}