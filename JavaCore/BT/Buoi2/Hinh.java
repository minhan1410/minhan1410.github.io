// Ý tưởng: Đầu tiên em sẽ viết 2 hàm 
// 1) Đường thẳng có dấu sao nét liền
// 2) Đường thẳng có dấu sao ở bên ngoài còn bên trong cách
// Hình 1: Tam giác đặc em để for chạy theo chiều cao của tam giác và in ra các đường thẳng nét liền
// Hình 2: Tam giác rỗng em để 2 vòng for.For đầu để in từ đỉnh đến cạnh độ dài n, for 2 thì in cạnh -1 về 1 in bằng đường thẳng rỗng 
// Hình 3: Chữ nhật rỗng cạnh đầu và cuối em in bằng đường thẳng nét liền các cạnh còn lại in  bằng đường thẳng rỗng

public class Hinh {
    public static void DuongThang(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    public static void DuongThangChuaKhoangTrang(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }

    public static void TamGiacDac(int n) {
        System.out.println();
        if (n > 3 && n < 10) {
            for (int i = 1; i <= n; i++) {
                DuongThang(i);
            }
        }
        System.out.println();
    }

    public static void TamGiacRong(int n) {
        if (n > 3 && n < 10) {
            for (int i = 1; i <= n; i++) {
                DuongThangChuaKhoangTrang(i);
            }
            for (int i = n - 1; i >= 1; i--) {
                DuongThangChuaKhoangTrang(i);
            }
            System.out.println();
        }
    }

    public static void ChuNhatRong(int a, int b) {
        if (a > 3 && b < 9) {
            for (int i = 1; i <= b; i++) {
                if (i == 1 || i == b) {
                    DuongThang(a);
                } else {
                    DuongThangChuaKhoangTrang(a);
                }
            }
        }
        System.out.println();
    }

    public static void ChuNhat(int a, int b) {
        if (a > 3 && b < 9) {
            for (int i = 1; i <= b; i++) {
                DuongThang(a);
            }
        }
        System.out.println();
    }

    public static void HinhVuong(int a) {
        if (a >= 2) {
            for (int i = 1; i <= a; i++) {
                DuongThang(a);
            }
            System.out.println();
        }
    }

    public static void HinhVuongRong(int a) {
        if (a >= 2) {
            for (int i = 1; i <= a; i++) {
                if (i == 1 || i == a) {
                    DuongThang(a);
                } else {
                    DuongThangChuaKhoangTrang(a);
                }
            }
            System.out.println();
        }
    }

    public static void TamGiacCan(int n) {
        if (n > 3 && n < 10) {
            int a = 0;
            for (int i = 1; i <= n; i++) {
                // Khoảng trắng
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("   ");
                }
                DuongThang(i + a);
                a = i;
            }
            System.out.println();
        }
    }

    public static void TamGiacCanRong(int n) {
        if (n > 3 && n < 10) {
            int a = 0;
            for (int i = 1; i <= n; i++) {
                // Khoảng trắng
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("   ");
                }

                if (i == 1 || i == n) {
                    DuongThang(i + a);
                } else {
                    DuongThangChuaKhoangTrang(i + a);
                }
                a = i;
            }
            System.out.println();
        }
    }

    public static void DongHoCat(int n) {
        if (n > 3 && n < 10) {
            for (int i = n; i >= 1; i--) {
                // Khoảng trắng
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("   ");
                }
                DuongThang(i + i - 1);
            }
            TamGiacCan(n);
        }
    }

    public static void DongHoCatRong(int n) {
        if (n > 3 && n < 10) {
            for (int i = n; i >= 1; i--) {
                // Khoảng trắng
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("   ");
                }
                if (i == 1 || i == n) {
                    DuongThang(2 * i - 1);
                } else {
                    DuongThangChuaKhoangTrang(2 * i - 1);
                }
            }
            TamGiacCanRong(n);
        }
    }

    public static void main(String[] args) {
        TamGiacDac(5);
        TamGiacRong(5);
        ChuNhatRong(7, 6);

        // Tự chế thêm
        ChuNhat(7, 6);
        HinhVuong(5);
        HinhVuongRong(5);
        TamGiacCan(5);
        TamGiacCanRong(5);
        DongHoCat(5);
        DongHoCatRong(5);
    }
}
