package nested.test.ex1;

public class LibraryMain {

    public static void main(String[] args) {
        Library library = new Library(4);

        library.addBook("컴퓨터활용능력 2급 기본서", "박윤정");
        library.addBook("아가미", "구병모");
        library.addBook("코스모스", "칼 세이건");
        library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        library.addBook("OneMoreThing", "잡스");
        library.showBooks();
    }
}
