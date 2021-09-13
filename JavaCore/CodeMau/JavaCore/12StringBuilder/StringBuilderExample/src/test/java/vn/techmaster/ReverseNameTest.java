package vn.techmaster;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseNameTest {
    ReverseName reverseName = new ReverseName();

    @Test
    @DisplayName("TestReverse_Method")
    public void testReverse(){
        String newName = reverseName.reverse("Lục Thanh Ngọc");
        assertThat(newName).isNotNull()
                .isEqualTo("Ngọc Thanh Lục");

    }

}