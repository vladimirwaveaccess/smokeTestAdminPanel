package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryUserFiltersPage extends BaseTest {

    @Test(priority = 1)
    public void testOpenFiltersPage() {
        app.dashboard.openFiltersPage();
        Assert.assertEquals(app.dashboard.checkingFiltersPage(), true);
    }

    @Test(priority = 2)
    public void testOpenHTTPReferrerFilteringPage() {
        app.dashboard.openHTTPReferrerFilteringPage();
        Assert.assertEquals(app.dashboard.checkingHTTPReferrerFilteringPage(), true);
    }

    @Test(priority = 3)
    public void testOpenBarcodeFilteringPage() {
        app.dashboard.backButtonPush();
        app.dashboard.openBarcodeFilteringPage();
        Assert.assertEquals(app.dashboard.checkingBarcodeFilteringPage(), true);
    }

    @Test(priority = 4)
    public void testOpenPortalRedirectFilteringPage() {
        app.dashboard.backButtonPush();
        app.dashboard.openPortalRedirectFilteringPage();
        Assert.assertEquals(app.dashboard.checkingPortalRedirectFilteringPage(), true);
    }

    @Test(priority = 5)
    public void testOpenAccessKeyFilteringPage() {
        app.dashboard.backButtonPush();
        app.dashboard.openAccessKeyFiltering();
        Assert.assertEquals(app.dashboard.checkingAccessKeyFilteringPage(), true);
    }
}
