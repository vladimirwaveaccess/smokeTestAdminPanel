package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryUserSettingsPageTest extends BaseTest{

    @Test(priority = 1)
    public void testUserLibraryLogin() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.checkLinkPath().contains("rbdigitalinternal"), true);
    }

}
