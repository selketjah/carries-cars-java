package com.carriesCars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitHubActionsTest {

    /**
     * This tests serves to verify that GitHub Actions runs our tests and reports failures.
     */
    @Test
    public void noFalsePositivesOnGitHub() {
        boolean actual = false;

        boolean expected = true;
        assertEquals(expected, actual);
    }

}