package review.zooManageProgram;

public abstract class Animal {

    private String name; // private 으로 설정하고 getter 로 접근하게 하는게 캡슐화에 더 좋음
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Animal(String name, Integer age) { // 필드만 만들어두지말고 생성자 만드는거 까먹지말자!!
        this.name = name;
        this.age = age;
    }

    public abstract String sound();
}
