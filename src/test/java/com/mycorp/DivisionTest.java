package com.mycorp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void getDivisionByName_OneDivision() {
        Division first = Division.getDivisionByName("G");
        Division second = Division.getDivisionByName("G");
        Assertions.assertSame(first,second);
    }

    @Test
    void getDivisionByName_TwoDivision() {
        Division first = Division.getDivisionByName("G");
        Division second = Division.getDivisionByName("K");
        Assertions.assertNotSame(first,second);
    }
}