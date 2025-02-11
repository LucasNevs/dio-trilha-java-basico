import java.util.Scanner;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentou o volume: " + volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuiu o volume: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudou o canal. Novo canal: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudou o canal. Novo canal: " + canal);
    }

    public void definirCanal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o canal desejado: ");
        canal = input.nextInt();
        System.out.println("Novo canal: " + canal);
    }
}