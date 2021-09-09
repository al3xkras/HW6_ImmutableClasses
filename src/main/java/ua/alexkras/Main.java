package ua.alexkras;


public class Main {

    public static void main(String[] args) {

        // создаем какой то, любой объект класса Age, он mutable
        int age = 10;

        //содаем IMMUTABLE объект класса ImmutableStudent
        ImmutableStudent immutableStudent = new ImmutableStudent("Andrew", age,Group.group1);
        System.out.println("Name : " + immutableStudent.getName() + " | " +
                "Age : " + immutableStudent.getAge() +" | " +
                "Group : " + immutableStudent.getGroup().name() );

        // пытаемся изменить поля
        immutableStudent.setAge(20);
        immutableStudent.setName("Ivan");

        //вывод не изменился и ЭТО ХОРОШО
        System.out.println("Name : " + immutableStudent.getName() + " | " +
                "Age : " + immutableStudent.getAge() +" | " +
                "Group : " + immutableStudent.getGroup().name() );
        //еще пытаемся изменить поля
        immutableStudent.setGroup(Group.group2a);

        //вывод не изменился и ЭТО ОТЛИЧНО
        System.out.println("Name : " + immutableStudent.getName() + " | " +
                "Age : " + immutableStudent.getAge() +" | " +
                "Group : " + immutableStudent.getGroup().name() );
        //упорно пытаемся что то сломать
        immutableStudent.setAge(50);
        immutableStudent.setName("Petro");
        immutableStudent.setGroup(Group.group2b);

        //вывод не изменился, что то менять бесполезно
        System.out.println("Name : " + immutableStudent.getName() + " | " +
                "Age : " + immutableStudent.getAge() +" | " +
                "Group : " + immutableStudent.getGroup().name() );
    }
}

