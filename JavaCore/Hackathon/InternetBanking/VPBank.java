package InternetBanking;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class VPBank implements InternetBanking {
    private LocalDateTime ngayGiaoDich;
    private double sodu;
    private String soTK;
    private long id;
    private ArrayList<String> lichSu=new ArrayList<String>();

    public VPBank(String soTK,double sodu) {
        this.sodu = sodu;
        setSoTK(soTK);
    }

    @Override
    public void ChuyenTien() {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tk: ");
        String soTKChuyen = scanner.next();
        if (Validation.validateSTK(soTKChuyen)) {
            System.out.print("Nhap so tien muon chuyen: ");
            double tienChuyen = scanner.nextDouble();
            if (tienChuyen > 50000 && tienChuyen < (sodu - 50000)) {
                System.out.print("Nhap mo ta chuyen tien: ");
                String moto = scanner.next();

                this.sodu = this.sodu - tienChuyen;
                this.id = IdGenerator.getNewID();
                lichSu.add(id+" - "+ngayGiaoDich.now().toString()+" - "+moto+" - "+soTKChuyen+" - "+tienChuyen);
            }
        } else {
            System.out.println("stk là các số gồm từ 8 đến 16 ký tự");
        }
    }

    @Override
    public void LichSu() {
        System.out.println("VPBank:");
        lichSu.forEach(i-> System.out.println(i));
    }

    @Override
    public String InSoDu() {
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        return df.format(sodu);
    }

    @Override
    public String getSTK() {
        return soTK;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    public double getSodu() {
        return sodu;
    }

    public void setSoTK(String soTK) {
        if (Validation.validateSTK(soTK)) {
            this.soTK = soTK;
        } else {
            System.out.println("stk là các số gồm từ 8 đến 16 ký tự");
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((soTK == null) ? 0 : soTK.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VPBank other = (VPBank) obj;
        if (soTK == null) {
            if (other.soTK != null)
                return false;
        } else if (!soTK.equals(other.soTK))
            return false;
        return true;
    }
}
