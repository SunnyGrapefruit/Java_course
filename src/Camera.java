import java.util.Scanner;

public class Camera {

    static Scanner scaner = new Scanner (System.in);

    public static String action;
    static int film = 0;
    static int frame = 0;
    static int snapshot = 0;

    public static void main(String[] args){
        if(film == 0){
            System.out.println("Пленки нет");
            action = scaner.nextLine();
            if(action.equals("Вставить пленку")){
                insert();
            }
            else {
                System.out.println("Ну и ладно");
            }
        }
        if(frame == 10){
            System. out.println("Замените пленку");
        }

        photo();
        rewind();
    }

    public static void photo() {
        frame += 1;
    }
    public static void rewind(){
        snapshot += 1;
    }
    public static void insert(){
        film = 10;
        System.out.println("Пленка вставлена");
    }
}
