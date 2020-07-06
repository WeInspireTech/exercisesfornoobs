package org.mrc.exercises;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mrc.exercises.lesson1.Lesson1;
import org.mrc.exercises.lesson1.SalariesListIsTooSmallException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Lesson1Test {
    Lesson1 l1 = new Lesson1();

    @Test
    void should_return_100_when_salaries_are_present() {
        List<Integer> salaries = new ArrayList<Integer>();
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        assertEquals(100, l1.getTotalSalaries(salaries));
    }

    @Test
    void should_throw_IllegalArgumentException_when_salaries_are_null() {
        assertThrows(IllegalArgumentException.class, () -> {
            l1.getTotalSalaries(null);
        });
    }

    @Test
    void should_throw_SalariesListIsTooSmall_when_salaries_size_is_less_then_4() {
        List<Integer> salaries = new ArrayList<Integer>();
        salaries.add(10);
        salaries.add(10);
        salaries.add(10);
        assertThrows(SalariesListIsTooSmallException.class, () -> {
            l1.getTotalSalaries(salaries);
        });
    }
}
