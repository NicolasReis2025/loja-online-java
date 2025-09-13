package Project;

import java.util.ArrayList;

class Produto {
    private String nome;
    private double valor;
    private int quantidade;

    public Produto( String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public double mostrarValorTotal(){
        return this.quantidade * this.valor;
    }

    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Valor: R$" + String.format("%.2f", this.valor) + "\n" +
                "Quantidade: "  + this.quantidade + "\n" +
                "Subtotal: R$" + String.format("%.2f", mostrarValorTotal());

    }


}


