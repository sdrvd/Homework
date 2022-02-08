package home_work_additional_hanoy.service;

import java.util.Scanner;

public class Hanoy {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим игры");
        System.out.println("1 - Ручной режим");
        System.out.println("2 - Автоматический режим");
        int mode = scanner.nextInt();
        switch (mode){
            case 1:
                System.out.println("Выбран ручной режим игры");
                break;
            case 2:
                System.out.println("Выбран автоматический режим игры");
                break;
            default:
                System.out.println("Ошибка ввода");
                return;
        }
        System.out.println("Выберите количество колец");
        System.out.println("Минимальное количество колец - 3, максимальное - 20");
        int ringsAmount = scanner.nextInt();
        if (ringsAmount < 3 || ringsAmount > 20){
            System.out.println("Ошибка ввода");
            return;
        }
        int[][] tower = new int[ringsAmount][3];
        int ringNumber = 1;
        int ringPosition = 0;
        for (int i = 0; i < ringsAmount; i++) {
            tower[ringPosition][0] = ringNumber;
            ringPosition++;
            ringNumber++;
        }
        towerPrint(tower);
        ringsAmount--;
        while(tower[0][2] == 0){
            System.out.println("Выберите ход");
            System.out.println("1 - 1->2, 2 - 1->3, 3 - 2->1, 4 - 2->3, 5 - 3->1, 6 - 3->2");
            int turn = scanner.nextInt();


            if(turn == 1){
                move(tower, 0, 1, ringsAmount);
                towerPrint(tower);
            }
            if(turn == 2){
                move(tower, 0, 2, ringsAmount);
                towerPrint(tower);
            }
            if(turn == 3){
                move(tower, 1, 0, ringsAmount);
                towerPrint(tower);
            }
            if(turn == 4){
                move(tower, 1, 2, ringsAmount);
                towerPrint(tower);
            }
            if(turn == 5){
                move(tower, 2, 0, ringsAmount);
                towerPrint(tower);
            }
            if(turn == 6){
                move(tower, 2, 1, ringsAmount);
                towerPrint(tower);
            }

        }
        System.out.println("Головоломка решена!");
    }

    private static void towerPrint(int[][] tower){
        for (int[] a : tower) {
            for (int i: a) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }

    private static void move(int[][] tower, int from, int to, int positionsAmount){
        int movePosition = 0;
        int ringPosition = 0;
        int lastPosition = positionsAmount;
        boolean turnCheck = true;

         if(tower[ringPosition][from] == 0 && ringPosition != positionsAmount){
                do {
                    ringPosition++;
                }while(tower[ringPosition][from] == 0);
            }
        if(tower[lastPosition][to] != 0){
            do {
                lastPosition--;
            }while(tower[lastPosition][to] != 0);
        }
        if(lastPosition != positionsAmount){
            if(tower[lastPosition+1][to] < tower[ringPosition][from] && tower[lastPosition][to] != 0){
                System.out.println("Такой ход невозможен!");
                turnCheck = false;
            }
        }
        if(tower[ringPosition][from] > tower[positionsAmount][to] && tower[positionsAmount][to] != 0){
            System.out.println("Такой ход невозможен!");
            turnCheck = false;
        }
        if (turnCheck){
            tower[lastPosition][to] = tower[ringPosition][from];
            tower[ringPosition][from] = 0;
        }


    }
}
