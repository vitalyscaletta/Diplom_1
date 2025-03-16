package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    @Test
    public void testEnumContainsAllValues() {
        assertEquals("Количество значений в перечислении неверно", 2, IngredientType.values().length);
        assertArrayEquals("Перечисление содержит неверные значения", new IngredientType[]{IngredientType.SAUCE, IngredientType.FILLING}, IngredientType.values());
    }

    @Test
    public void testValueOfReturnsCorrectEnum() {
        assertEquals("Метод valueOf('SAUCE') возвращает неверное значение", IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
        assertEquals("Метод valueOf('FILLING') возвращает неверное значение", IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }
}