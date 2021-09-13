package vn.techmaster;

public class Example {

    public StringBuilder usingAppend(StringBuilder str){
        str.append("StringBuilder");
//        str.append(5);
//        str.append(10.5);
//        str.append('a');
//        str.append(true);
        return str;
    }


    public StringBuilder usingInsert(StringBuilder str){
        str.insert(6, "Add some thing");
        str.insert(2,9);  //Thêm một số nguyên vào vị trí 2
        //str.insert(3, 'q');  //Thêm một ký tự vào vị trí 3
        //str.insert(4, 2.8);   //Thêm một số thực vào vị trí 4
        //str.insert(5, true);  //Thêm giá trị boolean vào vị trí 5
        return str;
    }

    public StringBuilder usingReplace(StringBuilder str){
        str.replace(4, 12, "Java");
        return str;
    }

    public StringBuilder usingDelete(StringBuilder str){
        str.delete(0, 15);
        return str;
    }
}
