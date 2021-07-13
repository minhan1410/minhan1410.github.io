public class Main {
    public static void main(String[] args) {
        BookStore<Book> bookStore = new BookStore<Book>();
        bookStore.Add(new SachGiaoKhoa("GDCD lop 12", "Kha Banh", 2021, 60, true, 600, 50));
        bookStore.Add(new SachGiaoKhoa("Dao ly", "Huan rose", 2021, 70, true, 600, 500));
        bookStore.Add(new DoAn("Do An 1", "Nha xuat ban 1", 2020, 70, true, 2021));
        bookStore.Add(new DoAn("Do An 2", "Nha xuat ban 2", 2020, 80, true, 2021));
        bookStore.Add(new DoAn("Do An 3", "Nha xuat ban 3", 2020, 30, true, 2021));
        bookStore.Add(new DoAn("Do An 4", "Nha xuat ban 4", 2020, 40, true, 2021));
        bookStore.Add(new DoAn("Do An 5", "Nha xuat ban 5", 2020, 50, true, 2021));
        bookStore.Add(new TlDienTu("Sach online 1", "Nha xuat ban 1", 2019, "20Mb", 515, 150_000));

        bookStore.Show();

        bookStore.Update(new TlDienTu("Sach online 1", "Nha xuat ban 1", 2021, "30Mb", 515, 150), 7);
        bookStore.Update(new TlDienTu("Sach online 2", "Nha xuat ban 2", 2018, "50Mb", 8005, 250), 8);

        bookStore.Show();

    }
}
