package br.com.serraria.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Romaneio {
    
    public static final int TIPO_ROMANEIO = 0;
    public static final int TIPO_ORCAMENTO = 1;

    private int numero;
    private String data;
    private String transportador;
    private String motorista;
    private String placa;
    private int cliCodigo;
    private int pecasTotal;
    private float metrosTotal;
    private float mediaValor;
    private float valorTotal;
    private String nome;
    private float valorPago;
    private int tipo;
    private int empresaCodigo;

    public Romaneio(float valorTotal, float valorPago) {
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
    }

    
    public Romaneio(int numero, int pecasTotal, float metrosTotal, float mediaValor, float valorTotal) {
        this.numero = numero;
        this.pecasTotal = pecasTotal;
        this.metrosTotal = metrosTotal;
        this.mediaValor = mediaValor;
        this.valorTotal = valorTotal;
    }
    public Romaneio(int numero, String data, float valorTotal , String nome) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.nome = nome;
    }

    public Romaneio(int numero, String data, String transportador, String motorista, String placa, int cliCodigo, int pecasTotal, float metrosTotal,
            float mediaValor, float valorTotal, float valorPago, int tipo, int empresaCodigo) {
        this.numero = numero;
        this.data = data;
        this.transportador = transportador;
        this.motorista = motorista;
        this.placa = placa;
        this.cliCodigo = cliCodigo;
        this.pecasTotal = pecasTotal;
        this.metrosTotal = metrosTotal;
        this.mediaValor = mediaValor;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.tipo = tipo;
        this.empresaCodigo = empresaCodigo;
    }

    public Romaneio(int pecasTotal, float metrosTotal, float mediaValor, float valorTotal, float valorPago,int numero) {
        this.pecasTotal = pecasTotal;
        this.metrosTotal = metrosTotal;
        this.mediaValor = mediaValor;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.numero = numero;
    }

    public Romaneio(int pecasTotal, float metrosTotal, float mediaValor, float valorTotal, float valorPago) {
        this.pecasTotal = pecasTotal;
        this.metrosTotal = metrosTotal;
        this.mediaValor = mediaValor;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
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

    public int getPecasTotal() {
        return pecasTotal;
    }

    public void setPecasTotal(int pecasTotal) {
        this.pecasTotal = pecasTotal;
    }

    public float getMetrosTotal() {
        return metrosTotal;
    }

    public void setMetrosTotal(float metrosTotal) {
        this.metrosTotal = metrosTotal;
    }

    public float getMediaValor() {
        return mediaValor;
    }

    public void setMediaValor(float mediaValor) {
        this.mediaValor = mediaValor;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEmpresaCodigo() {
        return empresaCodigo;
    }

    public void setEmpresaCodigo(int empresaCodigo) {
        this.empresaCodigo = empresaCodigo;
    }
    
}
