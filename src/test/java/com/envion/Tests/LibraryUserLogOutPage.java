package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryUserLogOutPage extends BaseTest {

    @Test(priority = 1)
    public void testLogOutPage() {
        app.logout.logOutPage();
        Assert.assertEquals(app.logout.indentifierLogout(), "Login");
    }
}
