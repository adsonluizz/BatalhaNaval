import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int menu = 0;


        while(menu != 3){
            System.out.println("Bem-vindo ao jogo de Batalha Naval!");
            System.out.println("1 - Registrar");
            System.out.println("2 - Login");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            menu = entrada.nextInt();

            if(menu == 1){
                //Cadastro
                Jogador.cadastrarJogador();

            }else if (menu == 2){
                //Login
                Jogador.loginJogador();

            }else if (menu == 3){
                //Sair
                System.out.println("Até breve");
                System.out.println("Saindo ...");

            }else{
                System.out.println("Opção invalida!");
            }





        }
    }
}
