package dogs.com;

public class dog {
    private int age;
    private String name;

    public dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String setDogName(String name) {
        this.name = name;
        return name;
    }

    public String getDogName() {
        return name;
    }

    public int setDogAge(int age) {
        this.age = age;
        return age;
    }

    public int getDogAge() {
        return age;
    }

    public int computeDogAge() {
        this.age = age*7;
        return age;
    }


    public String toString() {
        String dogsname = "Dogs name: ";
        String dogsage = "Dogs age:  ";
        return dogsname + name + "    " + dogsage + age;
    }
}


