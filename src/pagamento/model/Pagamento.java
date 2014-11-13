/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Pagamento {
    private String data;
    private int cli_codigo;
    private float valor_pago;

    public Pagamento(int cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public Pagamento(String data, int cli_codigo, float valor_pago) {
        this.data = data;
        this.cli_codigo = cli_codigo;
        this.valor_pago = valor_pago;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(int cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public float getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(float valor_pago) {
        this.valor_pago = valor_pago;
    }
}
