import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author an=new Author("An",20,"Thường Tín","minhan14102001@gmail.com","0985240637");
        Author anh=new Author("Anh",20,"Thường Tín","anh@gmail.com","0123456789");
        Author manh=new Author("Mạnh",20,"Thường Tín","manh@gmail.com","0123456789");
        Author quan=new Author("Quân",20,"Thường Tín","quan@gmail.com","0123456789");

        // 1 sách nhiều thể loại
        ArrayList<String> theLoaiSach1 = new ArrayList<String>();
        theLoaiSach1.add(TheLoaiSach.KhoaHoc);
        theLoaiSach1.add(TheLoaiSach.GiaoTrinh);

        ArrayList<String> theLoaiSach2 = new ArrayList<String>();
        theLoaiSach2.add(TheLoaiSach.ChinhTri);
        theLoaiSach2.add(TheLoaiSach.GiaoTrinh);
        theLoaiSach2.add(TheLoaiSach.VanHoc);
        
        //1 sach có nhiều tác giả,1 tác giả có nhiều quyển sách (quan hệ nhiều nhiều)
        ArrayList<Author> dongTacGiaSach1 = new ArrayList<Author>();
        dongTacGiaSach1.add(an);
        dongTacGiaSach1.add(manh);
        dongTacGiaSach1.add(quan);


        ArrayList<Author> dongTacGiaSach2 = new ArrayList<Author>();
        dongTacGiaSach2.add(an);
        dongTacGiaSach2.add(manh);
        dongTacGiaSach2.add(anh);
        
        Book sach1=new Book("Sách khoa học",theLoaiSach1,dongTacGiaSach1,2021,"Nhà sx Minh An",571);
        Book sach2=new Book("Sách văn học",theLoaiSach2,dongTacGiaSach2,2021,"Nhà sx Minh An",600);


        Readers docGiaAn= new Readers("An",20,"Thường Tín","minhan14102001@gmail.com","0985240637");
        Readers docGiaAnh= new Readers("Anh",20,"Thường Tín","anh@gmail.com","0123456789");
        Readers docGiaManh= new Readers("Mạnh",20,"Thường Tín","manh@gmail.com","0123456789");
        Readers docGiaQuan= new Readers("Quân",20,"Thường Tín","quan@gmail.com","0123456789");

        LocalDateTime ngayMuon=LocalDateTime.now();

        ArrayList<LineItem> listLineItem1= new ArrayList<LineItem>();
        listLineItem1.add(new LineItem(sach1,4));
        listLineItem1.add(new LineItem(sach2,3));

        ArrayList<LineItem> listLineItem2= new ArrayList<LineItem>();
        listLineItem2.add(new LineItem(sach1,2));
        listLineItem2.add(new LineItem(sach2,5));

        PhieuThue phieuthueSach1=new PhieuThue(docGiaAn,ngayMuon,ngayMuon.plusDays(7),listLineItem1);
        PhieuThue phieuthueSach2=new PhieuThue(docGiaAn,ngayMuon,ngayMuon.plusDays(5),listLineItem2);

        System.out.println(phieuthueSach1);

        Database db = new Database();
        db.sachRepo.add(sach1);
        db.sachRepo.add(sach2);

        db.docGiaRepo.add(docGiaAn);
        db.docGiaRepo.add(docGiaAnh);
        db.docGiaRepo.add(docGiaManh);
        db.docGiaRepo.add(docGiaQuan);

        db.phieuThueRepo.add(phieuthueSach1);
        db.phieuThueRepo.add(phieuthueSach2);



    }
}
