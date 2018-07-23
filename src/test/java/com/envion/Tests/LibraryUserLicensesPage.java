package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryUserLicensesPage extends BaseTest {

    @Test(priority = 1)
    public void testOpenLicensesPage() {
        app.dashboard.openLicensesPage();
        Assert.assertEquals(app.dashboard.checkingLicensesPage(), true);
    }
}
