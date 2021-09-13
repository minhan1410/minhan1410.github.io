public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(); //Animal là kiểu dữ liệu do người dùng tự định nghĩa
        animal.name = "Cat";
        animal.species = "Animalia";

        System.out.println(animal.name +" - "+animal.species);
    }
}
