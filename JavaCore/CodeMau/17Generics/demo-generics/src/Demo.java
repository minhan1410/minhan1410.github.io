public class Demo<T>{
    T[] array;
    ////////String[] array;

    public Demo(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getLast() {
        return array[array.length - 1];
    }

    public void print(T[] array){
        for (T t : array) {
            System.out.print(t + "\t");
        }
    }
    
}
