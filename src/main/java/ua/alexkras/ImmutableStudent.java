package ua.alexkras;

import java.util.Objects;

public class ImmutableStudent {
    private final int age;
    private final String name;
    private final Group group;

    public ImmutableStudent(String name, int age, Group group){
        this.age = age;
        this.name = name;
        this.group = group;
    }


    public int getAge(){
        return age;
    }
    public ImmutableStudent setAge(int age){
        return new ImmutableStudent(this.name,age,this.group);
    }


    public String getName(){
        String nameCopy = ""+name;
        return nameCopy;
    }
    public ImmutableStudent setName(String name){
        return new ImmutableStudent(name,this.age,this.group);
    }


    public Group getGroup(){
        return group;
    }
    public ImmutableStudent setGroup(Group group){
        return new ImmutableStudent(this.name,this.age,group);
    }

    @Override
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }

        if (o == this) {
            return true;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        ImmutableStudent student = (ImmutableStudent) o;
        return this.name.equals(student.getName()) &&
                this.group.equals(student.getGroup()) &&
                this.age == student.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,group);
    }


}
