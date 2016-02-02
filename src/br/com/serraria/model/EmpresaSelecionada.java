package br.com.serraria.model;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class EmpresaSelecionada {
    
    private Empresa empresa;
    
    private EmpresaSelecionada(){}
    
    private static class EmpresaSelecionadaHolder {
        private final static EmpresaSelecionada instance = new EmpresaSelecionada();
    }
    
    public static EmpresaSelecionada getInstance() {
        return EmpresaSelecionadaHolder.instance;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
