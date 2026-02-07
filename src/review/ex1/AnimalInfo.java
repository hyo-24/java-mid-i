package review.ex1;

import java.util.Objects;

public final class AnimalInfo {

    private final String name;
    private final int age;

    public AnimalInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AnimalInfo that)) return false;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "AnimalInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
