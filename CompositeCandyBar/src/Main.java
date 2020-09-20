
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the e+++++*ditor.
 */
/**
 *
 * @author Jhonny
 */
public class Main {

    public static void main(String[] args) {

        //cracion de pipocas      
        Pipocas pipocas1 = new Pipocas("pequeño");
        Pipocas pipocas2 = new Pipocas("mediano");
        Pipocas pipocas3 = new Pipocas("grande");
        //cracion de sodas
        Sodas sodas1 = new Sodas("pequeño");
        Sodas sodas2 = new Sodas("mediano");
        Sodas sodas3 = new Sodas("grande");

        //creacion de combos
        boolean ciclo = true;
        while (ciclo) {
            System.out.println("::::::MEnu_CandyBar::::::");
            System.out.println("1.-Pipocas pequeña");
            System.out.println("2.-Pipocas Mediana");
            System.out.println("3.-Pipocas grande");
            System.out.println("4.-Soda pequeña");
            System.out.println("5.-Soda Mediana");
            System.out.println("6.-Soda grande");
            System.out.println("7.-Combo1");
            System.out.println("8.-Combo2");
            System.out.println("9.-Combo3");

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresar una opcion");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("El costo de la pipoca pequeña es :" + pipocas1.getCosto());

                    break;
                case 2:
                    System.out.println("El costo de la pipoca mediana es :" + pipocas2.getCosto());

                    break;
                case 3:
                    System.out.println("El costo de la pipoca grande es :" + pipocas3.getCosto());
                    break;
                case 4:
                    System.out.println("El costo de la soda pequeña es :" + sodas1.getCosto());
                    break;
                case 5:
                    System.out.println("El costo de la soda mediana es :" + sodas2.getCosto());
                    break;
                case 6:

                    System.out.println("El costo de la soda grande es :" + sodas3.getCosto());
                    break;
                case 7:
                    Combo combo1 = new Combo(1);
                    combo1.addPipocas(pipocas2);
                    combo1.addPipocas(pipocas2);
                    combo1.addSodas(sodas2);
                    combo1.addSodas(sodas2);
                    System.out.println("El costo del combo 1 es :" + combo1.getCosto());
                    break;
                case 8:
                    Combo combo2 = new Combo(2);
                    combo2.addPipocas(pipocas2);
                    combo2.addSodas(sodas2);
                    System.out.println("El costo del combo 2 es :" + combo2.getCosto());
                    break;
                case 9:
                    Combo combo3 = new Combo(3);
                    combo3.addPipocas(pipocas3);
                    combo3.addPipocas(pipocas3);
                    combo3.addSodas(sodas2);
                    combo3.addSodas(sodas2);
                    System.out.println("El costo del combo 3 es :" + combo3.getCosto());
                    break;
                default:  ciclo = false;
                    System.out.println("Ingrese una opcion correcta");
            }

          

        }

    }

}
