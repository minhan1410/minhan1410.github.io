package SingleMom;

public class SingleMom {
    public double DiemSo;
    protected double SoTK;

    public SingleMom(double diemSo, double soTK) {
        DiemSo = diemSo;
        SoTK = soTK;
    }

    public SingleMom() {
        this(0, 0);
    }

    public double getDiemSo() {
        return DiemSo;
    }

    public void setDiemSo(double diemSo) {
        DiemSo = diemSo;
    }

    public double getSoTK() {
        return SoTK;
    }

    public void setSoTK(double soTK) {
        SoTK = soTK;
    }

    @Override
    public String toString() {
        return "SingleMom [DiemSo=" + DiemSo + ", SoTK=" + SoTK + "]";
    }
    
}

class Child extends SingleMom{
    public double getSoTK() {
        return super.SoTK;
    }

    @Override
    public String toString() {
        return "Child []";
    }

    
}
