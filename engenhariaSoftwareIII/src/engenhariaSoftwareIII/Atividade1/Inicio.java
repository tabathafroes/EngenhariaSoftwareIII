package engenhariaSoftwareIII.Atividade1;

import java.util.Scanner;
public class Inicio {
  public static void main(String[] args) {
    int totalHoras = 0;
    int menu = -1;
    CalcularValor calculo = new CalcularValor();
    Scanner scInt = new Scanner(System.in);
    System.out.println("Digite o total de horas que o veículo ficou no estacionamento:");
    totalHoras = scInt.nextInt();

    if(totalHoras < 12) {
      calculo.tipo = new Hora(totalHoras);
    }

    else if(totalHoras < 360) {
      totalHoras = totalHoras > 24? totalHoras/24: 1;
      calculo.tipo = new Diaria(totalHoras);
    }

    else {
      totalHoras = totalHoras > 720? totalHoras/720: 1;
      calculo.tipo = new Mensalidade(totalHoras);
    }
    
    Scanner sc = new Scanner(System.in);

    while(menu != 0){
    System.out.println("MENU\n 1 = Veículo de Passeio\n 2 = Veículo de Carga\n 0 = Sair");
    menu = sc.nextInt();
    switch (menu){
      case 1:
      calculo.veiculo = new Passeio(1);
      menu = 0;
      break;

      case 2:
      calculo.veiculo = new Carga(1);
      menu = 0;
      break;

      case 0:
      System.exit(0);

      default:
      System.out.println("Opção inválida! Reentre");
      break;
    }
    }
    
    System.out.println("Valor de cobrança: " + calculo.valor());
  }
}
