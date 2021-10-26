package com.example.btvn.repository;

import com.example.btvn.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class EmployeeDao extends Dao<Employee> {
    public EmployeeDao() {
        add(new Employee(1, "Đào Lê Phương", "Hoa", "https://www.tiktok.com/@hoaa.hanassii?lang=vi-VN"));
        add(new Employee(2, "Lê", "Bống", "https://www.tiktok.com/@lebong95?lang=vi-VN"));
        add(new Employee(3, "Vũ Thị Khánh", "Huyền", "https://www.tiktok.com/@vtkh2004?lang=vi-VN"));
        add(new Employee(4, "Hồ Khánh", "Linh", "https://www.tiktok.com/@hkl209"));
        add(new Employee(5, "Lê Thị Khánh", "Huyền", "https://www.tiktok.com/@lethikhanhhuyen2004?lang=vi-VN"));
        add(new Employee(6, "Reency", "Ngô", "https://www.tiktok.com/@reencyngo?lang=vi-VN"));
        add(new Employee(7, "Trà", "Đặng", "https://www.tiktok.com/@tra.dang.904?lang=vi-VN&is_copy_url=1&is_from_webapp=v1"));
        add(new Employee(8, "Trần Thuỳ", "Vân", "https://www.tiktok.com/@tranvan0407?_d=secCgYIASAHKAESPgo8pwlDzKxZLTJwo1T%2BPoN9SxNy6ss7DEULujDMIOVBrPEybfFJGuFbPkkYesleJgmD3rhnIQIr3r%2FdAb38GgA%3D&checksum=4d19bf13a81574293ade13eeb1ea500a8007f37b6fe7ffa125764edda6b79ed7&language=vi&sec_uid=MS4wLjABAAAAeVLZN1iA-pMK-LlvdSJGAewgPS03K4A2Dp3heOH-0tI&sec_user_id=MS4wLjABAAAAEDo2pETV1a41WIqU1dqcI7t7oxuYfUdhshThXYVN86D1aDkKqVRlLsh9x59Z8GKC&share_app_id=1180&share_author_id=64904573317&share_link_id=5B11A3C9-8338-405E-9FC5-9F0F0292D156&tt_from=copy&u_code=d32c08fh6i7d2f&user_id=6620619996241149953&utm_campaign=client_share&utm_medium=ios&utm_source=copy&source=h5_t&_r=1"));
        add(new Employee(9, "Trần Huyền", "Châu", "https://www.tiktok.com/@h_chaukiuu?_d=secCgYIASAHKAESPgo8W7vRXcJasxC%2FUUKHli2yTmLoT6XP3sh5dhqIHpeb977q00Ndr9X7%2FLpAX5w4O52hwBatOVMndVoRCAHJGgA%3D&checksum=fc7be3c6e6e2973787c2354841149b3fcc8826c8feab59fa695132e7460d0044&language=vi&sec_uid=MS4wLjABAAAAxcL2A1mOcUELq2qD_e8CdYfRUQ7yg_cab1F2qePylKk&sec_user_id=MS4wLjABAAAAEDo2pETV1a41WIqU1dqcI7t7oxuYfUdhshThXYVN86D1aDkKqVRlLsh9x59Z8GKC&share_app_id=1180&share_author_id=65636925649&share_link_id=B5B1D7CA-B203-4906-9D6F-0E064205490F&tt_from=copy&u_code=d32c08fh6i7d2f&user_id=6620619996241149953&utm_campaign=client_share&utm_medium=ios&utm_source=copy&source=h5_t&_r=1"));
        add(new Employee(10, "Min", "Minn", "https://www.tiktok.com/@minhnghia13522?_d=secCgYIASAHKAESPgo8QIxcezvavDRlpG3Nn7%2BHJwyYb4FHJxckAMRw6HMe5qVth7JNkOiseB73u554qpfNKU2kE85dfgDPEXBVGgA%3D&checksum=dcd615635caf0c5edd0d577beb60d29eb32bf630b160c0085ea82c21ad21379a&language=vi&sec_uid=MS4wLjABAAAAZR22pd22o9oodIjf2BIX0MOZrce-AXC2Z7-DRbAY3YXopH4kHIIklRL-wUBhSooc&sec_user_id=MS4wLjABAAAAEDo2pETV1a41WIqU1dqcI7t7oxuYfUdhshThXYVN86D1aDkKqVRlLsh9x59Z8GKC&share_app_id=1180&share_author_id=6852532253546644481&share_link_id=33285183-32DA-4861-8349-3A35CE30C2CA&tt_from=copy&u_code=d32c08fh6i7d2f&user_id=6620619996241149953&utm_campaign=client_share&utm_medium=ios&utm_source=copy&source=h5_t&_r=1"));
        add(new Employee(11, "Hàn", "Bình", "https://www.tiktok.com/@hanbinh204?_d=secCgYIASAHKAESPgo8kBU4%2FM0RizRAeXa1QQ%2Fw%2BaR7%2Fte1xDG8Oo9RKogBeu1QB%2Brnke1Ue5P1DOhmYKhcHsw0RDvtre975KwWGgA%3D&checksum=5bd5952bb201d6206c068de85595feb3f2e648cb05f9d55c16d18050274ae97d&language=vi&sec_uid=MS4wLjABAAAA_wB6vCAgReE_Ihl-N2YIYTuzzCrrPjw7BP_oKO55OfDEjsCgnrUkCcNakQqssHz2&sec_user_id=MS4wLjABAAAAEDo2pETV1a41WIqU1dqcI7t7oxuYfUdhshThXYVN86D1aDkKqVRlLsh9x59Z8GKC&share_app_id=1180&share_author_id=6783531658005087233&share_link_id=F3181E3D-F265-45D4-9137-C508814C1C77&tt_from=copy&u_code=d32c08fh6i7d2f&user_id=6620619996241149953&utm_campaign=client_share&utm_medium=ios&utm_source=copy&source=h5_t&_r=1"));

    }

    public int getLength() {
        return list.size();
    }

    @Override
    public List<Employee> getAll() {
        return list;
    }

    @Override
    public Optional<Employee> get(int id) {
        return list.stream().filter(i -> i.getId() == id).findFirst();
    }

    @Override
    public void add(Employee employee) {
        list.add(employee);
    }

    @Override
    public void update(Employee employee) {
        get(employee.getId()).ifPresent(i -> {
            i.setFirstName(employee.getFirstName());
            i.setLastName(employee.getLastName());
            i.setPhoto(employee.getPhoto());
            i.setTiktok(employee.getTiktok());
        });
    }

    public void updateNoImg(Employee employee) {
        get(employee.getId()).ifPresent(i -> {
            i.setFirstName(employee.getFirstName());
            i.setLastName(employee.getLastName());
            i.setTiktok(employee.getTiktok());
        });
    }

    @Override
    public void delete(Employee employee) {
        deleteById(employee.getId());
    }

    @Override
    public void deleteById(int id) {
        get(id).ifPresent(i -> list.remove(i));
    }

    @Override
    public List<Employee> searchByKeyword(String keyword) {
        return list.stream().filter(i -> i.matchWithKeyword(keyword)).collect(Collectors.toList());
    }
}
