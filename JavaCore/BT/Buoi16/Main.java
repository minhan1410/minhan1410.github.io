public class Main {
    public static void main(String[] args) {
        Student an = new Student("Minh An", 2001, "0123...", "Thuong Tin", 5.5);
        Student thien = new Student("Ngoc Thien", 2001, "0123...", "Thuong Tin", 6.5);
        Student anh = new Student("Viet Anh", 2001, "0123...", "Thuong Tin", 7.5);
        Student hung = new Student("Van Hung", 2001, "0123...", "Thuong Tin", 8.5);
        Student hiep = new Student("Huy Hiep", 2001, "0123...", "Thuong Tin", 9.5);
        Student cuong = new Student("Doan Cuong", 2001, "0123...", "Thuong Tin", 10);

        Teacher gvcn = new Teacher("Phong", 1978, "0123...", "Thuong Tin", 30_000_000);
        Teacher ngoc = new Teacher("Ngoc", 1998, "0123...", "Thuong Tin", 20_000_000);

        PersonController<Person> persons = new PersonController<Person>();
        persons.add(an);
        persons.add(thien);
        persons.add(anh);
        persons.add(hung);
        persons.add(hiep);
        persons.add(cuong);
        persons.add(gvcn);
        persons.add(ngoc);

        persons.show();

        System.out.println("So lg sv: " + persons.DanhSachSv());
    }
}
