//Фотоаппарат имеет две кнопки: «фото» и «перемотка». Фотоплёнка имеет ёмкость 10 кадров.
//        Нажатием на кнопку «фото» фотоаппарат делает снимок.
//        При нажатии на кнопку «перемотка» фотоаппарат прокручивает плёнку на один кадр вперёд.
//        Без перемотки делать снимок фотоаппарат не может (кроме первого кадра). Без снимка фотоаппарат также не может сделать перемотку.
//        После снимка последнего, 10 кадра, перемотка не работает, пока не будет заменена фотоплёнка.
//        Пока не будет отснята вся плёнка, её также нельзя заменить.
//        Если фотоаппарат пуст (нет плёнки), то нажатие на кнопки ничего не дает. Начальная конфигурация: фотоаппарат пуст.


import java.util.Scanner;

public class Camera {

    static Scanner scaner = new Scanner (System.in);

    public static String action;
    static int film = 0; //пленка
    static int frame = 0; //кадр
    static int snapshot = 0; //снимок


    public static void main(String[] args){

        if(film == 0){
            System.out.println("Пленки нет");
            insert();
        }

        while(film != 0){
            action = scaner.nextLine();
            if(action.equals("Сделать снимок")){
                photo();
                if(frame != (snapshot)){
                    rewind();
                }
                else{
                    photo();
                }
            }
        }

        if(frame == 10){
            System.out.println("Замените пленку");
            insert();
        }
    }

    public static void photo() {
        snapshot += 1;
        film -=1;
        System.out.println("Снимков " + snapshot + " пленки " +film);
    }

    public static void rewind(){
        System.out.println("Перемотайте");
        action = scaner.nextLine();
        if(action.equals("Перемотать")){
            frame += 1;
            System.out.println("Перемотка выполнена");
        }
        else {
            System.out.println("Ну и ладно");
        }
    }

    public static void insert(){
        action = scaner.nextLine();
        if(action.equals("Вставить пленку")){
            film = 10;
            System.out.println("Пленка вставлена");
        }
        else {
            System.out.println("Ну и ладно");
        }
    }
}
