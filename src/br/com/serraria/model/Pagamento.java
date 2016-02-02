package br.com.serraria.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Pagamento {
    
    private String data;
    private int cliCodigo;
    private float valorPago;
    private int empCodigo;

    public Pagamento(int cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Pagamento(String data, int cliCodigo, float valorPago, int empCodigo) {
        this.data = data;
        this.cliCodigo = cliCodigo;
        this.valorPago = valorPago;
        this.empCodigo = empCodigo;
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

    public int getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(int empCodigo) {
        this.empCodigo = empCodigo;
    }
    
}
