import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TacGia an=new TacGia("An",20,"Thường Tín","minhan14102001@gmail.com","0985240637");
        TacGia anh=new TacGia("Anh",20,"Thường Tín","anh@gmail.com","0123456789");
        TacGia manh=new TacGia("Mạnh",20,"Thường Tín","manh@gmail.com","0123456789");
        TacGia quan=new TacGia("Quân",20,"Thường Tín","quan@gmail.com","0123456789");

        // 1 sách nhiều thể loại
        ArrayList<String> theLoaiSach1 = new ArrayList<String>();
        theLoaiSach1.add(TheLoaiSach.KhoaHoc);
        theLoaiSach1.add(TheLoaiSach.GiaoTrinh);

        ArrayList<String> theLoaiSach2 = new ArrayList<String>();
        theLoaiSach2.add(TheLoaiSach.ChinhTri);
        theLoaiSach2.add(TheLoaiSach.GiaoTrinh);
        theLoaiSach2.add(TheLoaiSach.VanHoc);
        
        //1 sach có nhiều tác giả,1 tác giả có nhiều quyển sách (quan hệ nhiều nhiều)
        ArrayList<TacGia> dongTacGiaSach1 = new ArrayList<TacGia>();
        dongTacGiaSach1.add(an);
        dongTacGiaSach1.add(manh);

        ArrayList<TacGia> dongTacGiaSach2 = new ArrayList<TacGia>();
        dongTacGiaSach2.add(an);
        dongTacGiaSach2.add(manh);
        dongTacGiaSach2.add(anh);
        
        Sach sach1=new Sach("Sách khoa học",theLoaiSach1,dongTacGiaSach1,2021,"Nhà sx Minh An",571);
        Sach sach2=new Sach("Sách văn học",theLoaiSach2,dongTacGiaSach2,2021,"Nhà sx Minh An",600);


        DocGia docGiaAn= new DocGia("An",20,"Thường Tín","minhan14102001@gmail.com","0985240637");
        LocalDateTime ngayMuon=LocalDateTime.now();
        ArrayList<LineItem> listLineItem= new ArrayList<LineItem>();
        listLineItem.add(new LineItem(sach1,1));
        listLineItem.add(new LineItem(sach2,5));

        PhieuThue phieuthueSach1=new PhieuThue(docGiaAn,ngayMuon,ngayMuon.plusDays(7),listLineItem);
        System.out.println(phieuthueSach1);
    }
}
