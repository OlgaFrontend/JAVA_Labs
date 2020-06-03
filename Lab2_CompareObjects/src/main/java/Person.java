import com.google.gson.Gson;

import java.util.Objects;

public class Person {

    private String pib;
    private int age;


    public Person(String pib, int age) {
        this.pib = pib;
        this.age = age;
    }

    public Person() {
    }



    public String toJSON(){
        Gson gson = new Gson();
       return gson.toJson(this);
    }

    public static Person fromJSON(String json){
        Gson gson = new Gson();
        return gson.fromJson(json,Person.class);
    }



    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //переопреділяємо метод equals
    @Override
    public final boolean equals(Object o) {
        if (this == o) return true; //провіряємо силки на рівність
        if (!(o instanceof Person)) return false; //провіряємо чи обєкт о належить до класу Person
        Person person = (Person) o; //приводимо обєкт до класу Person
        return Objects.equals(getPib(), person.getPib()) && //порівнюємо поля та повертаємо результат
                Objects.equals(getAge(), person.getAge());
    }


    @Override
    public  final int hashCode() {
        return Objects.hash(getPib(), getAge()); //вираховуємо хеш код обєкта
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("pib='").append(pib).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
