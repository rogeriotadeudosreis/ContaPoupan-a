/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

public class ContaPoupanca {

    //Atributos
    private String nomeDoCliente = "";
    private int numeroDaConta = 0;
    private int agencia = 0;
    private float saldo = 0;

    //Métodos
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente)throws Exception {
        if (nomeDoCliente.equals("")){
            throw new Exception("Este campo não pode ser em branco\nDigite novamente:");
        }
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    // Método para sacar valores da ContaPoupanca
    public float sacar(float valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("valor não pode <= 0");
        }
        if (valor > saldo) {
            throw new Exception("Saque não pode ser > saldo");
        }
        saldo -= valor;
        return valor;
    }

    // Método para depositar valores na ContaPoupanca
    public void depositar(float valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor não pode ser <=0");
        }
        saldo += valor;
    }

}
