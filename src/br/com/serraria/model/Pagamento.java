package br.com.serraria.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Pagamento {
    
    private String data;
    private int cliCodigo;
    private float valorPago;

    public Pagamento(int cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Pagamento(String data, int cliCodigo, float valorPago) {
        this.data = data;
        this.cliCodigo = cliCodigo;
        this.valorPago = valorPago;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(int cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }
}
