public class ExampleExtends <T extends Number> {
    T number;

    public ExampleExtends(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }


    public static void main(String[] args) {
        ExampleExtends<Integer> exampleExtends = new ExampleExtends<Integer>(5);
        System.out.println(exampleExtends.getNumber());

        ExampleExtends<Double> exampleExtends1 = new ExampleExtends<Double>(5.5);
        System.out.println(exampleExtends1.getNumber());

        
    }
    
    
}
