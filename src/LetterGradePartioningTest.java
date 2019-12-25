import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradePartioningTest {
    @Test
    public void Should_Return_A_When_Score_Between_90_And_100(){
        assertEquals('A', LetterGrade.letterGrade(95));
    }

    @Test
    public void Should_Return_B_When_Score_Between_80_And_89(){
        assertEquals('B', LetterGrade.letterGrade(85));
    }

    @Test
    public void Should_Return_C_When_Score_Between_70_And_79(){
        assertEquals('C', LetterGrade.letterGrade(75));
    }

    @Test
    public void Should_Return_D_When_Score_Between_60_And_69(){
        assertEquals('D', LetterGrade.letterGrade(65));
    }

    @Test
    public void Should_Return_F_When_Score_Between_0_And_59(){
        assertEquals('F', LetterGrade.letterGrade(45));
    }
}