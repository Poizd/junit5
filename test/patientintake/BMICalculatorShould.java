package patientintake;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("BMI Calculator should")
class BMICalculatorShould {

    @Test
    @DisplayName("calulate BMI to two places correctly via inches and pounds")
    void calculateCorrectly() {
        assertEquals(19.53, BMICalculator.calculatedBMI(60, 100));
        assertEquals(21.52, BMICalculator.calculatedBMI(70,150));
    }

}