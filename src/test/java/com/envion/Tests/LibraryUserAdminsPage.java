package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryUserAdminsPage extends BaseTest{

    @Test(priority = 1)
    public void testOpenAdminsPage() {
        app.dashboard.openAdminsPage();
        Assert.assertEquals(app.dashboard.checkingAdminsPage(), true);
    }
}
