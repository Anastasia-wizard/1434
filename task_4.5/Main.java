/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main {
    public static void main(String[] args) {

        Pegasus lana = new Pegasus("Lana", 7, "horse");
        Pegasus.fly();
        Horse Mila = new Horse("Mila", 2, "horse");
        Horse.run();

    }
}

class Animal {
    String nickname;
    int age;
    String type;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal(String nickname, int age, String type) {
        this.nickname = nickname;
        this.age = age;
        this.type = type;
    }
}

class Horse extends Animal {
    public Horse(String nickname, int age, String type) {
        super(nickname, age, type);
    }


    public static void run() {
        System.out.println("Игого, я поскакала!");
    }
}


class Pegasus extends Horse {
    public Pegasus(String nickname, int age, String type) {
        super(nickname, age, type);
    }


    public static void fly() {
        System.out.println("Игого, я полетела!");
    }

}








