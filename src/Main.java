import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }


    }

    static void contar(int paramentroUm, int paramentroDois)throws ParametrosInvalidosException{
        if (paramentroUm > paramentroDois){
            System.out.println("Erro, numeros negativos são inavlidos.");
        } else {
            int contagem = paramentroDois - paramentroUm;
            for (int i = paramentroUm; i < paramentroDois; i++) {
                System.out.println(" imprimindo o numero: "+(i+1));

            }

        }
    }
}