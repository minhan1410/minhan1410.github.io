import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<Employee>();
    private Scanner scanner = new Scanner(System.in);

    public EmployeeManager() {
        Gson gson = new Gson();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(
                    "D:\\Techmaster\\minhan1410.github.io\\JavaCore\\Hackathon2\\Employee_DATA.json");
            employees = gson.fromJson(fileReader, new TypeToken<ArrayList<Employee>>() {
            }.getType());
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    void Show() {
        employees.forEach(System.out::println);
    }

    public void Show(GioiTinh gender) {
        employees.stream().filter(i -> i.getGioiTinh().equals(gender)).forEach(i -> System.out.println(i));
    }

    public void Add(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void FilterId(Long id) {
        Employee v = new Employee();
        int vt = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                v = employees.get(i);
                vt = i;
            }
        }

        boolean filter = employees.contains(v);
        if (filter) {
            System.out.print("1) Update\n2) Delete\n3) Thoat\nChon: ");
            int chon = scanner.nextInt();
            do {
                switch (chon) {
                    case 1: {
                        System.out.print(
                                "Update\nB???n mu???n s???a th??ng tin gi:\n 1) T??n\n 2) Ng??y sinh\n 3) Gi???i t??nh\n 4) Qu?? qu??n\n 5) S??t\n 6) Email\n ==> Chon: ");
                        chon = scanner.nextInt();
                        switch (chon) {
                            case 1: {
                                System.out.println("1) T??n m???i: ");
                                scanner.nextLine();
                                String name = scanner.nextLine();
                                v.setName(name);
                                employees.set(vt, v);
                                break;
                            }
                            case 2: {
                                System.out.println("2) Ng??y sinh: ");
                                String date = scanner.next();
                                v.setBirthday(date);
                                employees.set(vt, v);
                                break;
                            }
                            case 3: {
                                System.out.println("3) Gi???i t??nh: \n");
                                System.out.print("1) Nam\n 2) Nu\n Chon: ");
                                chon = scanner.nextInt();
                                switch (chon) {
                                case 1: {
                                    v.setGioiTinh(GioiTinh.M);
                                    break;
                                }
                                case 2: {
                                    v.setGioiTinh(GioiTinh.F);
                                    break;
                                }
                                }
                                employees.set(vt, v);
                                break;
                            }
                            case 4: {
                                System.out.println("4) Qu?? qu??n: ");
                                String date = scanner.next();
                                v.setAddress(date);
                                employees.set(vt, v);
                                break;
                            }
                            case 5: {
                                System.out.println("5) Sdt: ");
                                String date = scanner.next();
                                v.setPhoneNumber(date);
                                employees.set(vt, v);
                                break;
                            }
                            case 6: {
                                System.out.println("6) Email: ");
                                String date = scanner.next();
                                v.setEmail(date);
                                employees.set(vt, v);
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        employees.remove(v);
                        break;
                    }
                }
            } while (chon == 3);
        } else {
            System.out.println("Kh??ng t??m th???y");
        }
    }
}
