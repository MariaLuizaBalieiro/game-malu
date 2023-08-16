package model;

import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    /** instancia scanner**/
    Scanner teclado = new Scanner(System.in);

    /**  instancia player **/
    Player player = new Player();

    /** instancia enemy**/
    Enemy enemy = new Enemy();

    /**
     * Instancia Output
     */
    Output output = new Output();

    public String choices;

    public void choice(){


        System.out.println("Bem vindo ao jogo!!");
        System.out.println("Escolha entre Player, Enemy ou Ambos: ");



        switch (choices){
            case "Player":
                PlayerRegister();
                break;


            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                bothRegister();
                break;


        }
        System.out.println("Deseja retomar ao cadastro?");
        int continuar = teclado.nextInt();

        if(continuar == 1){
            choice();
        }
        
    }

    public void bothRegister(){

        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);


    }
    public void PlayerRegister(){

        /** coleta dados player-1 **/
        System.out.println("..................Cadastro Player................");
        System.out.println("Qual é o seu nome? ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha a sua skin (red - blue - purple) : " );
        player.skin = teclado.nextLine();
        System.out.println("...................Player Cadastrado..............");

       if(validaPrint != 1){
        /** printa as informações cadastradas */
        output.PrintPlayer(player);}

    }
    public void EnemyRegister(){

        /** coleta dados player-1 **/
        System.out.println("..................Cadastro Player................");
        System.out.println("Qual é o seu nome? ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha a sua skin (red - blue - purple) : " );
        player.skin = teclado.nextLine();
        System.out.println("...................Player Cadastrado..............");

        output.PrintEnemy(enemy);


    }

}