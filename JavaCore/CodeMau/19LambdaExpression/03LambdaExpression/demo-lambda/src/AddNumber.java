//Functional interface là các interface có duy nhất một method trừu tượng.
//Để sử dụng nó ta thêm annotation @FunctionalInterface
//Tuy nhiên, ta có thể thêm các phương thức không trừu tượng bằng từ khoá default và static

@FunctionalInterface 
public interface AddNumber {
    public int sum(int num1, int num2);
}
