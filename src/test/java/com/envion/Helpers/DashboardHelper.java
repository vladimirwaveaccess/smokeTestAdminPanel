package com.envion.Helpers;

import com.envion.Pages.DashboardPage;
import org.openqa.selenium.support.ui.Select;


public class DashboardHelper extends DashboardPage {

    public void openFiltersPage() {
        clickLinkFilters();
    }

    public void openAdminsPage() {
        clickLinkAdmins();
    }

    public void openPatronsPage() {
        clickLinkPatrons();
    }

    public void openPageSettingsPage() {
        clickLinkPageSettings();
    }

    public void openServiceSubscriptionsPage() {
        clickLinkServiceSubscriptions();
    }

    public void openLicensesPage() {
        clickLinkLicenses();
    }

    public void openReportsPage() {
        clickLinkReports();
    }

    public void openHTTPReferrerFilteringPage() {
        clickLinkHTTPReferrerFiltering();
    }

    public void openBarcodeFilteringPage() {
        clickLinkBarcodeFiltering();
    }

    public void openPortalRedirectFilteringPage() {
        clickLinkPortalRedirectFiltering();
    }

    public void openAccessKeyFiltering() {
        clickLinkAccessKeyFiltering();
    }

    public void openAllLibraryPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("All Library Patrons");
    }

    public void openAllServicesReports() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("All Services");
    }

    public void openAudioBooksAndeBooksPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("AUDIOBOOKS AND eBOOKS");
    }

    public void openMagazinesPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("MAGAZINES");
    }

    public void openAcornTVPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("ACORN TV");
    }

    public void openArtistworksPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("ARTISTWORKS");
    }

    public void openBroadwayHDPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("BROADWAY HD");
    }

    public void openComicsPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("COMICS");
    }

    public void openComicsPlusPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("COMICSPLUS");
    }

    public void openCrunchyrollPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("CRUNCHYROLL");
    }

    public void openEpixPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("EPIX");
    }

    public void openEprepPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("EPREP");
    }

    public void openGaiaPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("GAIA");
    }

    public void openGreatCoursesPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("GREAT COURSES");
    }

    public void openHoonuitPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("HOONUIT");
    }

    public void openIndieflixPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("INDIEFLIX");
    }

    public void openKidspeakPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("KIDSPEAK");
    }

    public void openLawdepotPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("LAWDEPOT");
    }

    public void openLearnItLivePatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("LEARN IT LIVE");
    }

    public void openMethodTestPrepPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("METHOD TEST PREP");
    }

    public void openOneplayPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("ONEPLAY");
    }

    public void openPongaloPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("PONGALO");
    }

    public void openQelloPatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("STINGRAY QELLO");
    }

    public void openTransparentLanguagePatrons() {
        Select select = new Select(selectAllLibraryPatrons());
        select.selectByVisibleText("TRANSPARENT LANGUAGE");
    }

    public void openMagazinesServicePage() {
        clickLinkMagazinesService();
    }

    public void openAcornTVServicePage() {
        clickLinkAcornTVService();
    }

    public void openArtistWorksServicePage() {
        clickLinkArtistworksService();
    }

    public void openBroadwayHDServicePage() {
        clickLinkBroadwayHDService();
    }

    public void openComicsServicePage() {
        clickLinkComicsService();
    }

    public void openComicsPlusServicePage() {
        clickLinkComicsPlusService();
    }

    public void openCrunchyrollServicePage() {
        clickLinkCrunchyrollService();
    }

    public void openEpixServicePage() {
        clickLinkEpixService();
    }

    public void openEprepServicePage() {
        clickLinkEprepService();
    }

    public void openGaiaServicePage() {
        clickLinkGaiaService();
    }

    public void openGreatCoursesServicePage() {
        clickLinkGreatCoursesService();
    }

    public void openHoonuitServicePage() {
        clickLinkHoonuitService();
    }

    public void openIndieflixServicePage() {
        clickLinkIndieflixService();
    }

    public void openKidspeakServicePage() {
        clickLinkKidspeakService();
    }

    public void openLawdepotServicePage() {
        clickLinkLawdepotService();
    }

    public void openLearnItLiveServicePage() {
        clickLinkLearnItLiveService();
    }

    public void openMethodTestPrepServicePage() {
        clickLinkMethodTestPrepService();
    }

    public void openOnePlayServicePage() {
        clickLinkOnePlayService();
    }

    public void openPongaloServicePage() {
        clickLinkPongaloService();
    }

    public void openStingrayQelloServicePage() {
        clickLinkStingrayQelloService();
    }

    public void openTransparentLanguageServicePage() {
        clickLinkTransparentLanguageService();
    }
}
