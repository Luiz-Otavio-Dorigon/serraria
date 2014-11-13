/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cargas.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class TorasZequinha {

    private String data;
    private String tipo;
    private float peso;
    private float valor;
    private float valorPago;
    private float total;
    private float totalGeral;
    private int cliente;

    public TorasZequinha(String data, String tipo, float peso, float valor, float valorPago, float total, float totalGeral, int cliente) {
        this.data = data;
        this.tipo = tipo;
        this.peso = peso;
        this.valor = valor;
        this.valorPago = valorPago;
        this.total = total;
        this.totalGeral = totalGeral;
        this.cliente = cliente;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotalGeral() {
        return totalGeral;
    }

    public void setTotalGeral(float totalGeral) {
        this.totalGeral = totalGeral;
    }
}
