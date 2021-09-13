public class CompareNumber {
    void compareThreeNumber(int i, int j, int k){
        if(i > j){
            if(i > k){
                System.out.println(i + " là số lớn nhất");
            }else {
                System.out.println(k + " là số lớn nhất");
            }
        }else{
            if(j > k){
                System.out.println(j + " là số lớn nhất");
            }else{
                System.out.println(k + " là số lớn nhất");
            }
        }
    }
}
