public class App {
    public static void main(String[] args) throws Exception {
        // String[] language = new String[3];
        // language[0] = "Java";
        // language[1] = "HTML/CSS";
        // language[2] = "C++";

        // Demo<String> demo = new Demo<String>(language);
        // demo.print(language);
        // String lastElement = demo.getLast();
        // System.out.println(lastElement);


        // Integer[] numbers = new Integer[3];
        // numbers[0] = 5;
        // numbers[1] = 9;
        // numbers[2] = 7;

        // Demo<Integer> demo2 = new Demo<Integer>(numbers);
        // demo2.print(numbers);
        // int lastNumber = demo2.getLast();
        // System.out.println(lastNumber);

        WildcardDemo demo = new WildcardDemo();
        demo.createListName();

        demo.createListNumber();
    }
}
