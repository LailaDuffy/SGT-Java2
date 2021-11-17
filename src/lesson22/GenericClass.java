package lesson22;

import java.util.Date;

// T1 - a type generic placeholder
public class GenericClass<T1> {

    private T1 birthDate;

    <T2> String formatBirthDate(T2 format) {
        if (format instanceof String) {
            System.out.println("It is a String");
        } else if (format instanceof Date) {
            System.out.println("It is a Date");
        }
        return "result";
    }

    public T1 getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(T1 birthDate) {
        this.birthDate = birthDate;
    }
}
