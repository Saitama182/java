/* Напишите программу, которая принимает 2 параметра типа boolean, первый показывает, что уже ночь, второй - показывает, что на улице хорошая погода.
И в зависимости от условий показывает, что вам делать. Если ночь, то выводится надпись Спать. Если сейчас день и на улице хорошая погода , тогда надпись Гулять.
Если сейчас день и на улице плохая погода , тогда читать книгу.
Все условия должны храниться в отдельных переменных. Не используйте else*/
public class WhatToDo {
    public static void main(String[] args) {
        int time = 24;
        boolean goodWether = true;
        boolean late = time >= 23 || time <= 5;
        if ( late ) {
            System.out.println("Спать");
        }
        if ( !late && goodWether ) {
            System.out.println("Гулять");
        }
        if ( !late && !goodWether ) {
            System.out.println("читать книгу");
        }
    }
}
