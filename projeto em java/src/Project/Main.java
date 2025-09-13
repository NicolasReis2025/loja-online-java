package Project;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        int opcao = 0;

        System.out.println("=== Bem-vindo à Loja Online ===");

        System.out.println("\n=== Menu da loja ===");

        do{
            double valorTotalEstoque = 0.0;
            System.out.println(
                    "[1] - Adicionar produto ao carrinho\n" +
                    "[2] - Ver carrinho\n" +
                    "[0] - Finalizar compra\n"

            );
            System.out.print("\nDigite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Compra finalizada! ");

                    for(Produto p: listaProdutos){
                       valorTotalEstoque += p.mostrarValorTotal();
                     }

                    System.out.printf("\nTotal: R$%.2f\nObrigado pela Compra", valorTotalEstoque);
                    break;

                case 1:{
                    sc.nextLine();
                    System.out.print("\nDigite o nome do produto: ");
                    String nome = sc.nextLine().toLowerCase();

                    System.out.print("Valor do produto: ");
                    double valor = sc.nextDouble();

                    System.out.print("Quantidade do produto: ");
                    int quantidade = sc.nextInt();

                    Produto dados = new Produto(nome, valor, quantidade);
                    listaProdutos.add(dados);

                    System.out.println("✅ Produto adicionado com sucesso!");
                    break;
                }

                case 2:{
                    if(listaProdutos.isEmpty()){
                        System.out.println("Carrinho vazio!");
                    }
                    else{
                        valorTotalEstoque = 0.0;
                        for(Produto i: listaProdutos){
                            System.out.println(i);
                            System.out.println("---------------------");
                            valorTotalEstoque += i.mostrarValorTotal();
                    }
                        System.out.printf("Valor total do estoque: R$%.2f\n", valorTotalEstoque);

                }
                    break;
                }


                default:{
                    System.out.println("ERRO: opção inválida. Tente novamente!");
                    break;
                }

            }

        } while(opcao != 0);


    sc.close();

    }
}