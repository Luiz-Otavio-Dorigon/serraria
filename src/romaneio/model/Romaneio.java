/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package romaneio.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Romaneio {

    private int numero;
    private String data;
    private String transportador;
    private String motorista;
    private String placa;
    private int cliCodigo;
    private int pecas_total;
    private float metros_total;
    private float media_valor;
    private float valor_total;
    private String nome;
    private float valor_pago;

    public Romaneio(float valor_total, float valor_pago) {
        this.valor_total = valor_total;
        this.valor_pago = valor_pago;
    }

    
    public Romaneio(int numero, int pecas_total, float metros_total, float media_valor, float valor_total) {
        this.numero = numero;
        this.pecas_total = pecas_total;
        this.metros_total = metros_total;
        this.media_valor = media_valor;
        this.valor_total = valor_total;
    }
    public Romaneio(int numero, String data, float valor_total , String nome) {
        this.numero = numero;
        this.data = data;
        this.valor_total = valor_total;
        this.nome = nome;
    }

    public Romaneio(int numero, String data, String transportador, String motorista, String placa, int cliCodigo, int pecas_total, float metros_total,
            float media_valor, float valor_total, float valor_pago) {
        this.numero = numero;
        this.data = data;
        this.transportador = transportador;
        this.motorista = motorista;
        this.placa = placa;
        this.cliCodigo = cliCodigo;
        this.pecas_total = pecas_total;
        this.metros_total = metros_total;
        this.media_valor = media_valor;
        this.valor_total = valor_total;
        this.valor_pago = valor_pago;
    }

    public Romaneio(int pecas_total, float metros_total, float media_valor, float valor_total, float valor_pago,int numero) {
        this.pecas_total = pecas_total;
        this.metros_total = metros_total;
        this.media_valor = media_valor;
        this.valor_total = valor_total;
        this.valor_pago = valor_pago;
        this.numero = numero;
    }

    public Romaneio(int pecas_total, float metros_total, float media_valor, float valor_total, float valor_pago) {
        this.pecas_total = pecas_total;
        this.metros_total = metros_total;
        this.media_valor = media_valor;
        this.valor_total = valor_total;
        this.valor_pago = valor_pago;
    }

    public float getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(float valor_pago) {
        this.valor_pago = valor_pago;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTransportador() {
        return transportador;
    }

    public void setTransportador(String transportador) {
        this.transportador = transportador;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(int cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public int getPecas_total() {
        return pecas_total;
    }

    public void setPecas_total(int pecas_total) {
        this.pecas_total = pecas_total;
    }

    public float getMetros_total() {
        return metros_total;
    }

    public void setMetros_total(float metros_total) {
        this.metros_total = metros_total;
    }

    public float getMedia_valor() {
        return media_valor;
    }

    public void setMedia_valor(float media_valor) {
        this.media_valor = media_valor;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
