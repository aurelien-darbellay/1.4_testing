import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.MapAssert.assertThatMap;

public class TestingWithAssertJ {
    @Test
    void testIntegersForEquality() {
        assertThat(2)
                .as("Incorrect inequality")
                .isEqualTo(2)
                .as("Incorrect equality")
                .isNotEqualTo(3);
    }

    @Test
    void testIdenticalReference() {
        Object object = new Object();
        Object theSameObject = object;
        Object anotherObject = new Object();
        assertThat(object)
                .as("Fail to detect same reference")
                .isSameAs(theSameObject)
                .as("Fail to detect different reference")
                .isNotSameAs(anotherObject);
    }

    @Test
    void testForArrayEquality() {
        int[] numbers = {1, 2, 3};
        int[] theSameNumbers = {1, 2, 3};
        int[] moreNumbers = {1, 2, 3, 4};
        assertThat(numbers)
                .as("Fail to detect equality")
                .isEqualTo(theSameNumbers)
                .as("Fail to detect difference")
                .isNotEqualTo(moreNumbers);
    }

    @Test
    void testMapKeys() {
        Map<Integer, String> myFirstMap = new HashMap<Integer, String>();
        myFirstMap.put(1, "One");
        myFirstMap.put(2, "Two");
        myFirstMap.put(3, "Three");
        assertThatMap(myFirstMap)
                .as("Unexpected absent key")
                .containsKey(2)
                .as("Unexpected present key")
                .doesNotContainKey(4);
    }

    @Test
    void testEmptyOptional() {
        Optional<String> emptyOptional = Optional.empty();
        assertThat(emptyOptional)
                .as("Fail to detect emptiness of being")
                .isEmpty();
    }

}
