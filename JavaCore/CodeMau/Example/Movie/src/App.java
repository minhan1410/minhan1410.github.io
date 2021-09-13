import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



import controller.MovieController;
import model.Movie;
import repository.MovieRepository;

public class App {
    public static void main(String[] args) throws Exception {
        MovieRepository movieRepository = new MovieRepository();
        MovieController movieController = new MovieController();
        Scanner sc = new Scanner(System.in);

        movieRepository.getData();

        List<Movie> listMovies = movieRepository.listMovies;

        System.out.println("\n-------------------------------------------------------------\n");

        
        while(true){
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    // Sắp xếp phim dựa theo tên
                    System.out.println("DANH SÁCH SAU KHI SẮP XẾP: ");
                    Collections.sort(listMovies, new Comparator<Movie>() {
    
                        @Override
                        public int compare(Movie o1, Movie o2) {
                            return o1.getTitle().compareTo(o2.getTitle());
                        }
    
                    });
                    printList(listMovies);
                    break;
    
                case 2:
                    System.out.println("Nhập tên phim bạn muốn tìm kiếm: ");
                    String name = sc.nextLine();
                    System.out.println("DANH SACH PHIM CÓ TÊN LÀ " + name + " : ");
                    movieController.searchMovieByName(listMovies, name);
                    break;
    
                case 3:
                    System.out.println("Nhập tên phim bạn muốn tìm kiếm: ");
                    String genres = sc.nextLine();
                    System.out.println("DANH SACH PHIM CÓ THỂ LOẠI LÀ " + genres + " : ");
                    movieController.searchMovieByCategory(listMovies, genres);
                    break;
    
                case 4:
                    System.out.println("Nhập tên phim bạn muốn tìm kiếm: ");
                    String language = sc.nextLine();
                    System.out.println("DANH SACH PHIM CÓ NGÔN NGỮ LÀ " + language + " : ");
                    movieController.searchMovieByLanguage(listMovies, language);
                    break;
    
                case 5:
                    movieController.countMovieByCategory(listMovies);
                    break;
    
                case 0:
                    System.exit(1);
                    break;
                default:
                    break;
            }
        }
    }

    public static void printList(List<Movie> list) {
        for (Movie movie : list) {
            System.out.println(movie);
        }

    }

    public static void menu() {
        System.out.println("Lựa chọn: ");
        System.out.println("1 : Sắp xếp các phim dựa theo tên");
        System.out.println("2 : Tìm kiếm phim theo tên");
        System.out.println("3 : Tìm kiếm phim theo thể loại");
        System.out.println("4 : Tìm kiếm phim theo ngôn ngữ");
        System.out.println("5 : Liệt kê thể loại phim và số phim dựa theo thể loại");
        System.out.println("6 : Thoát chương trình");
    }
}
