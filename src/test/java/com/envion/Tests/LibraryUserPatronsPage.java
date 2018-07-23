package com.envion.Tests;




import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryUserPatronsPage extends BaseTest {

    @Test(priority = 1)
    public void testOpenPatronsPage() {
        app.dashboard.openPatronsPage();
        Assert.assertEquals(app.dashboard.checkingPatronsPage(), true);
    }

    @Test(priority = 2)
    public void testSelectAllLibrary() {
        app.dashboard.openAllLibraryPatrons();
    }

    @Test(priority = 3)
    public void testSelectAudioBooksAndeBooksPatrons() {
        app.dashboard.openAudioBooksAndeBooksPatrons();
    }

    @Test(priority = 4)
    public void testSelectMagazinesPatrons() {
        app.dashboard.openMagazinesPatrons();
    }

    @Test(priority = 5)
    public void testSelectAcornTVPatrons() {
        app.dashboard.openAcornTVPatrons();
    }

    @Test(priority = 6)
    public void testSelectArtistworksPatrons() {
        app.dashboard.openArtistworksPatrons();
    }

    @Test(priority = 7)
    public void testSelectBroadwayHDPatrons() {
        app.dashboard.openBroadwayHDPatrons();
    }

    @Test(priority = 8)
    public void testSelectComicsPatrons() {
        app.dashboard.openComicsPatrons();
    }

    @Test(priority = 9)
    public void testSelectComicsPlusPatrons() {
        app.dashboard.openComicsPlusPatrons();
    }

    @Test(priority = 10)
    public void testSelectCrunchyrollPatrons() {
        app.dashboard.openCrunchyrollPatrons();
    }

    @Test(priority = 11)
    public void testSelectEpixPatrons() {
        app.dashboard.openEpixPatrons();
    }

    @Test(priority = 12)
    public void testSelectEprepPatrons() {
        app.dashboard.openEprepPatrons();
    }

    @Test(priority = 13)
    public void testSelectGaiaPatrons() {
        app.dashboard.openGaiaPatrons();
    }

    @Test(priority = 14)
    public void testSelectGreatCoursesPatrons() {
        app.dashboard.openGreatCoursesPatrons();
    }

    @Test(priority = 15)
    public void testSelectHoonuitPatrons() {
        app.dashboard.openHoonuitPatrons();
    }

    @Test(priority = 16)
    public void testSelectIndieflixPatrons() {
        app.dashboard.openIndieflixPatrons();
    }

    @Test(priority = 17)
    public void testSelectKidspeakPatrons() {
        app.dashboard.openKidspeakPatrons();
    }

    @Test(priority = 18)
    public void testSelectLawdepotPatrons() {
        app.dashboard.openLawdepotPatrons();
    }

    @Test(priority = 19)
    public void testSelectLearnItLivePatrons() {
        app.dashboard.openLearnItLivePatrons();
    }

    @Test(priority = 20)
    public void testSelectMethodTestPrepPatrons() {
        app.dashboard.openMethodTestPrepPatrons();
    }

    @Test(priority = 21)
    public void testSelectOneplayPatrons() {
        app.dashboard.openOneplayPatrons();
    }

    @Test(priority = 22)
    public void testSelectPongaloPatrons() {
        app.dashboard.openPongaloPatrons();
    }

    @Test(priority = 23)
    public void testSelectQelloPatrons() {
        app.dashboard.openQelloPatrons();
    }

    @Test(priority = 24)
    public void testSelectTransparentLanguagePatrons() {
        app.dashboard.openTransparentLanguagePatrons();
    }
}
