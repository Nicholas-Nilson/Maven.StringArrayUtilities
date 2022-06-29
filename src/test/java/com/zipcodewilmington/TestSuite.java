package com.zipcodewilmington;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ContainsTest.class,
        GetConsecutiveDuplicatesTest.class,
        GetFirstElementTest.class,
        GetLastElementTest.class,
        GetNumberOfOccurrencesTest.class,
        GetSecondElementTest.class,
        GetSecondToLastElementTest.class,
        IsPalindromicTest.class,
        IsPangramicTest.class,
        RemovePackDuplicatesTest.class,
        RemoveValueTest.class,
        ReverseTest.class,
})

public class TestSuite {
}
