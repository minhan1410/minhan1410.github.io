package vn.techmaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

class StringsHandlingTest {
    String str = "You Only Live Once. But if You do it right. once is Enough";
    StringsHandling stringsHandling = new StringsHandling();
    @Test
    public void checkString() {

        assertThat(str).isNotEmpty()
                .isEqualTo("You Only Live Once. But if You do it right. once is Enough")
                .hasSize(58);

    }

    @Test
    public void testCountString(){
        int count = stringsHandling.countWords(str);
        assertThat(count).isEqualTo(7)
                .isNotZero();
    }

    @Test
    public void testCapitalFirstCharacter_method(){
        String s = stringsHandling.capitalFirstCharacter(str);
        assertThat(s).isNotNull()
                .isEqualTo("You Only Live Once. But If You Do It Right. Once Is Enough");
    }

    @Test
    public void testStringNormalization_method(){
        String s = stringsHandling.stringNormalization(str);
        assertThat(s).isNotNull()
                .isEqualTo("You only live once. But if you do it right. Once is enough.");
    }


}