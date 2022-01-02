package com.example.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
*/

@Component
public class Girl {
    /* @Autowired đánh dấu cho Spring biết rằng sẽ tự động inject bean tương ứng vào vị trí được đánh dấu. */
    @Qualifier("Naked")
    @Autowired
    Outfit outfit;

    // Outfit outfit;
    // // Đánh dấu để Spring inject một đối tượng Outfit vào đây
    // public Girl(@Qualifier("naked") Outfit outfit) {
    //     /*
    //         Spring sẽ inject outfit thông qua Constructor đầu tiên
    //         Ngoài ra, nó sẽ tìm Bean có @Qualifier("naked") trong context để inject
    //     */
    //     this.outfit = outfit;
    // }
}
