package com.juaracoding.cucumber.utils;

public enum TestScenarios {

    T1("User invalid login"),
    T2("User valid login"),
    T3("Dashboard user function"),
    T4("Recruitment user function"),
    T5("Recruitment Searching by Hiring Manager Name");
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}