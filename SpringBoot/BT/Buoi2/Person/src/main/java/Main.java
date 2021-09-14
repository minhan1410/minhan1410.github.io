public class Main {
    public static void main(String[] args) {
        ListPerson persons = new ListPerson();

        System.out.println("Lọc người có độ tuổi từ 20-30");
        for (Person p: persons.filterAge()) {
            System.out.println(p);
        }

        System.out.println("Tuổi trung bình của tất cả mọi người"+persons.avgAgeAll());

        System.out.println("Tuổi trung bình theo từng quốc tịch");
        persons.avgAgeGroupNationality().forEach((k,v)->{
            System.out.println(k+" - "+v);
        });
    }
}
