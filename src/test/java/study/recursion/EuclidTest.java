package study.recursion;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class EuclidTest {
    @Test
    public void eulid() {
        assertThat(Euclid.euclid(9, 3)).isEqualTo(3);
        assertThat(Euclid.euclid(10,5)).isEqualTo(5);
    }
}
