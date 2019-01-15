package org.linphone.tester;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;

@RunWith(org.junit.runners.AllTests.class)
public class MulticastCallTests {
    public static TestSuite suite() {
        TestSuite testSuites = new TestSuite();
        testSuites.setName("Multicast Call");

        LinphoneTestSuite testsList = new LinphoneTestSuite();
        testsList.run(new String[]{"tester", "--list-tests", "Multicast Call"});
        for (String testName: testsList.getList()) {
            LinphoneTest test = new LinphoneTest("Multicast Call", testName);
            testSuites.addTest(test);
        }

        return testSuites;
    }
}

