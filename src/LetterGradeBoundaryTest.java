import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeBoundaryTest {
    @Test
    public void Should_Return_X_IF_Small_zero () {
        assertEquals('X', LetterGrade.letterGrade(-1));
    }
    @Test
    public void Should_Return_X_IF_gatter_onehundred () {
        assertEquals('X', LetterGrade.letterGrade(101));
    }
    @Test
    public void Should_Return_A_When_Score_Between_90_And_100 () {
        assertEquals('A', LetterGrade.letterGrade(90));
        assertEquals('A', LetterGrade.letterGrade(91));
        assertEquals('A', LetterGrade.letterGrade(99));
        assertEquals('A', LetterGrade.letterGrade(100));
    }
    @Test
    public void Should_Return_B_When_Score_Between_80_And_89 () {
        assertEquals('B', LetterGrade.letterGrade(80));
        assertEquals('B', LetterGrade.letterGrade(81));
        assertEquals('B', LetterGrade.letterGrade(88));
        assertEquals('B', LetterGrade.letterGrade(89));
    }
    @Test
    public void Should_Return_C_When_Score_Between_70_And_79 () {
        assertEquals('C', LetterGrade.letterGrade(70));
        assertEquals('C', LetterGrade.letterGrade(71));
        assertEquals('C', LetterGrade.letterGrade(78));
        assertEquals('C', LetterGrade.letterGrade(79));

    }
    @Test
    public void Should_Return_D_When_Score_Between_60_And_69 () {
        assertEquals('D', LetterGrade.letterGrade(60));
        assertEquals('D', LetterGrade.letterGrade(61));
        assertEquals('D', LetterGrade.letterGrade(68));
        assertEquals('D', LetterGrade.letterGrade(69));
    }
    @Test
    public void Should_Return_F_When_Score_Between_0_And_59 () {
        assertEquals('F', LetterGrade.letterGrade(0));
        assertEquals('F', LetterGrade.letterGrade(1));
        assertEquals('F', LetterGrade.letterGrade(58));
        assertEquals('F', LetterGrade.letterGrade(59));



    }
}