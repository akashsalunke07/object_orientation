package encapsulation;

import objects.Box;

public class Boy {
    private int age;

    public Boy(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>this.age){
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Boy boy1 = new Boy(20);
        boy1.setAge(19);
        System.out.println(boy1.getAge());
        boy1.setAge(23);
        System.out.println(boy1.getAge());
    }
}
