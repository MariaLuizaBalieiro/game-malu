package model;

public class Output {
    public void PrintPlayer (Player player){
        /**printar informações*/

        System.out.println("**************************************");
        System.out.println("******** Player **********************");
        System.out.println("O nome do player é:" + player.nome);
        System.out.println("A skin do seu player é: " + player.skin);
        System.out.println("A vida do seu player é: " + player.getLife());
        System.out.println("**************************************");

    }
    public void PrintEnemy(Enemy enemy){
        /**printar informações*/

        System.out.println("**************************************");
        System.out.println("******** Player **********************");
        System.out.println("O nome do player é:" + enemy.nome);
        System.out.println("A skin do seu player é: " + enemy.skin);
        System.out.println("A vida do seu player é: " + enemy.getLife());
        System.out.println("**************************************");

    }
}
