package HW10;
/*Создайте класс Animal. При вызове его конструктора на экран должно выводиться «I am Animal». В классе создайте
переменную eyes и методы eat, который будет выводить “Animal eats" и drink, который будет выводить “Animal drinks”.
Создайте класс Pet, который является child классом класса Animal. При вызове его конструктора на экран должно выводиться
 “I am Pet” и переменной eyes должно придаться значение 2. Также в класс Pet добавить переменные name и tail, tail
должен равняться 1. Также создать поле paw, которое будет равно 4. Создать метод run, который выведет на экран
сообщение “Pet runs” и метод jump, который выведет “Pet jumps”. Создайте класс Dog, который является Child классом Pet.
При вызове конструктора с параметром name, должно выводиться сообщение “I am dog and my name is: ” + name. Добавить
метод play, который будет выводить на экран сообщение “Dog plays”
Создать класс Hamster, который является Child классом Pet. При вызове его конструктора с параметром с полем name должно
выводиться сообщение “I am a hamster and my name is:” + name. Добавить метод sleep, который выводит на экран “Hamster is
 sleeping”

Создать класс Main, в методе main вывести количество лап объекта Dog и вызвать метод sleep класса Hamster*/
public class Animal {
    private int eyes;

    public Animal(){
        System.out.println("I am Animal");
    }
    public Animal(int eyes){
        this.eyes = eyes;
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void drink(){
        System.out.println("Animal drink");
    }
}
