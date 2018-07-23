package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryUserPageSettings extends BaseTest {

    @Test(priority = 1)
    public void testOpenPageSettingsPage() {
        app.dashboard.openPageSettingsPage();
        Assert.assertEquals(app.dashboard.checkingPageSettingsPage(), true);
    }

}
