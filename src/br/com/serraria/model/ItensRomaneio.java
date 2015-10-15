package br.com.serraria.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class ItensRomaneio {

    private int numeroRomaneio;
    private int sequencia;
    private int proCodigo;
    private float valorUnit;
    private float especura;
    private float largura;
    private float comprimento;
    private int numPecas;
    private float metros;
    private float total;
    private String produto;
    private String tipo;

    public ItensRomaneio() {}
    
    public ItensRomaneio(int numeroRomaneio, int sequencia, int proCodigo, float valorUnit, float especura, 
            float largura, float comprimento, int numPecas, float metros, float total, String produto, String tipo) {
        this.numeroRomaneio = numeroRomaneio;
        this.sequencia = sequencia;
        this.proCodigo = proCodigo;
        this.valorUnit = valorUnit;
        this.especura = especura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.numPecas = numPecas;
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

    public int getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(int proCodigo) {
        this.proCodigo = proCodigo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroRomaneio() {
        return numeroRomaneio;
    }

    public void setNumeroRomaneio(int numeroRomaneio) {
        this.numeroRomaneio = numeroRomaneio;
    }

    public float getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(float valorUnit) {
        this.valorUnit = valorUnit;
    }

    public int getNumPecas() {
        return numPecas;
    }

    public void setNumPecas(int numPecas) {
        this.numPecas = numPecas;
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
}