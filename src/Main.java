public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int userAge = 18;
        if (userAge >= 2 && userAge <= 6){
            System.out.println("Если возраст человека равен " + userAge + ", то ему нужно ходить в детский сад");
        }
        else{
            if (userAge >= 7 && userAge <= 18){
                System.out.println("Если возраст человека равен " + userAge + ", то ему нужно ходить в школу");
            }
            else{
                if (userAge > 18 && userAge < 24){
                    System.out.println("Если возраст человека равен " + userAge + ", то ему нужно ходить в университет");
                }
                else{
                    System.out.println("Если возраст человека равен " + userAge + ", то ему нужно ходить на работу");
                }
            }
        }
        System.out.println("Задача 2");
        int age = 14;
        if (age < 5){
            System.out.println("Вы не можете кататься на аттракционе");
        }
        else{
            if (age < 14){
                System.out.println("Вы можете кататься на аттракционе, только в сопровождении взрослого");
            }
            else{
                System.out.println("Вы можете кататься без сопровождения взрослого");
            }
        }

        System.out.println("Задача 3");
        int one = 14;
        int two = 8;
        int three = 12;
        if (one > two){
            if (one > three){
                System.out.println(one);
            }
            else{
                System.out.println(three);
            }
        }
        else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}