package vn.techmaster;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Test ID")
    void  testID_method()
    {
        Main main = new Main();
        String staffID =main.inputId();
        assertThat(staffID).isNotNull()
                .startsWith("NV")
                .containsPattern("[1-9]{7}");



    }

}