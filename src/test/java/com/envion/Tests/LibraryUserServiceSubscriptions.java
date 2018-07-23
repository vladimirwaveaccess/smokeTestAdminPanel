package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryUserServiceSubscriptions extends BaseTest {

    @Test(priority = 1)
    public void testOpenServiceSubscriptionsPage() {
        app.dashboard.openServiceSubscriptionsPage();
        Assert.assertEquals(app.dashboard.checkingServiceSubscriptionsPage(), true);
    }

    @Test(priority = 2)
    public void testOpenMagazinesServicePage() {
        app.dashboard.openMagazinesServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Magazine Service Subscription");
    }

    @Test(priority = 3)
    public void testOpenAcornTVServicePage() {
        app.dashboard.openAcornTVServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Acorn TV Service Subscription");
    }

    @Test(priority = 4)
    public void testOpenArtistWorksServicePage() {
        app.dashboard.openArtistWorksServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Artist Works Service Subscription");
    }

    @Test(priority = 5)
    public void testOpenBroadwayHDServicePage() {
        app.dashboard.openBroadwayHDServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "BroadwayHd Service Subscription");
    }

    @Test(priority = 6)
    public void testOpenComicsServicePage() {
        app.dashboard.openComicsServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Comics Service Subscription");
    }

    @Test(priority = 7)
    public void testOpenComicsPlusServicePage() {
        app.dashboard.openComicsPlusServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Comics Plus Service Subscription");
    }

    @Test(priority = 8)
    public void testOpenCrunchyrollServicePage() {
        app.dashboard.openCrunchyrollServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Crunchyroll Service Subscription");
    }

    @Test(priority = 9)
    public void testOpenEpixServicePage() {
        app.dashboard.openEpixServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Epix Service Subscription");
    }

    @Test(priority = 10)
    public void testOpenEprepServicePage() {
        app.dashboard.openEprepServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "RB Test Prep Service Subscription");
    }

    @Test(priority = 11)
    public void testOpenGaiaServicePage() {
        app.dashboard.openGaiaServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Gaia Service Subscription");
    }

    @Test(priority = 12)
    public void testOpenGreatCoursesServicePage() {
        app.dashboard.openGreatCoursesServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Great Courses Service Subscription");
    }

    @Test(priority = 13)
    public void testOpenHoonuitServicePage() {
        app.dashboard.openHoonuitServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Hoonuit Service Subscription");
    }

    @Test(priority = 14)
    public void testOpenIndieflixServicePage() {
        app.dashboard.openIndieflixServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Indieflix Service Subscription");
    }

    @Test(priority = 15)
    public void testOpenKidspeakServicePage() {
        app.dashboard.openKidspeakServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "KidSpeak Service Subscription");
    }

    @Test(priority = 16)
    public void testOpenLawdepotServicePage() {
        app.dashboard.openLawdepotServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "LawDepot Service Subscription");
    }

    @Test(priority = 17)
    public void testOpenLearnItLiveServicePage() {
        app.dashboard.openLearnItLiveServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "LearnItLive Service Subscription");
    }

    @Test(priority = 18)
    public void testOpenMethodTestPrepServicePage() {
        app.dashboard.openMethodTestPrepServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "MethodTestPrep Service Subscription");
    }

    @Test(priority = 19)
    public void testOpenOnePlayServicePage() {
        app.dashboard.openOnePlayServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "One Play Service Subscription");
    }

    @Test(priority = 20)
    public void testOpenPongaloServicePage() {
        app.dashboard.openPongaloServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Pongalo Service Subscription");
    }

    @Test(priority = 21)
    public void testOpenStingrayQelloServicePage() {
        app.dashboard.openStingrayQelloServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Stingray Qello Service Subscription");
    }

    @Test(priority = 22)
    public void testOpenTransparentLanguageServicePage() {
        app.dashboard.openTransparentLanguageServicePage();
        Assert.assertEquals(app.dashboard.checkOpenPageService(), "Transparent Language Service Subscription");
    }
}
