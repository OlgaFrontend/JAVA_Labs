
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ivanon Ivan Ivanovich",15);
        Person person2 = new Person("Petrov Ivan Ivanovich",20);
        Person person3 = new Person("Ivanon Ivan Ivanovich",15);


        System.out.println("Порівнюємо два об'єкти : ");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println( person1.equals(person2)?"Об'єкти рівні":"Об'єкти не рівні");


        System.out.println("______________________________________________________________");

        System.out.println("Порівнюємо два об'єкта : ");
        System.out.println(person1);
        System.out.println(person3);
        System.out.println( person1.equals(person3)?"Об'єкти рівні":"Об'єкти не рівні");

        System.out.println("______________________________________________________________");

        System.out.println("Сереалізуємо об'єкт :" +person1);
        String jsonFromPerson1 = person1.toJSON();
        System.out.println("Cереалізований об'єкт : " + jsonFromPerson1 );

        System.out.println("Десеріалізовуємо об'єкт. " );
        Person deserPerson = Person.fromJSON(jsonFromPerson1);
        System.out.println("Десереалізований об'єкт :"+ deserPerson);

        System.out.println("Провіряємо на рівність обєкт до сереалізації та після десереалізації");
        System.out.println( person1.equals(deserPerson)?"Об'єкти рівні":"Об'єкти не рівні");


    }

}
