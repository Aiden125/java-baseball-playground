package study;


import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    /*
    * 1. contains를 통한 배열 검증 가능
    * */
    @Test
    void q1() {
        String aa = "1,2";
        String[] a = aa.split(",");
        assertThat(a).contains("1");
        assertThat(a).contains("2");
//        assertThat(a).contains("3");
    }

    @Test
    void q1_2() {
        String aa = "1,2";
        String[] a = aa.split(",");
        assertThat(a).containsExactly("1", "2");
//        assertThat(a).contains("3");
    }
}
