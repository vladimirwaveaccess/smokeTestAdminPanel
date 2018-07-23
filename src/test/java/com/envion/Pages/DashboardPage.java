package com.envion.Pages;


import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'Filters')]")
	private WebElement linkFilters;

	@FindBy(id="path")
	private WebElement linkPath;

	@FindBy(id="reports")
	private WebElement indentifierIdReports;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'Admins')]")
	private WebElement linkAdmins;

	@FindBy(xpath="//table[@class='grid']")
	private WebElement indentifierTableClassGrid;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'Patrons')]")
	private WebElement linkPatrons;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'Page Settings')]")
	private WebElement linkPageSettings;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'Service Subscriptions')]")
	private WebElement linkServiceSubscriptions;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'Licenses')]")
	private WebElement linkLicenses;

	@FindBy(id="license-page")
	private WebElement indentifierIdLicensePage;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'Reports')]")
	private WebElement linkReports;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(), 'HTTP Referrer Filtering')]")
	private WebElement linkHTTPReferrerFiltering;

	@FindBy(xpath="//h3[contains(text(), 'Add valid HTTP host')]")
	private WebElement indentifierHTTPReferrerFilteringPage;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(), 'Barcode Filtering')]")
	private WebElement linkBarcodeFiltering;

	@FindBy(xpath="//h3[contains(text(), 'Add Barcode or User ID Prefix')]")
	private WebElement indentifierBarcodeFilteringPage;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(), 'Portal Redirect Filtering')]")
	private WebElement linkPortalRedirectFiltering;

	@FindBy(xpath="//h3[contains(text(), 'Define Portal Redirect URL')]")
	private WebElement indentifierPortalRedirectFilteringPage;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(), 'Access Key Filtering')]")
	private WebElement linkAccessKeyFiltering;

	@FindBy(xpath="//h3[contains(text(), 'Add alpha/numeric access key')]")
	private WebElement indentifierAccessKeyFiltering;

	@FindBy(id="service_t")
	private WebElement selectService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'MAGAZINES')]")
	private WebElement linkMagazinesService;

	@FindBy(xpath="//div[@class='inner-wrapper']//h3")
	private WebElement indentifierPageService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'ACORN TV')]")
	private WebElement linkAcornTVService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'ARTISTWORKS')]")
	private WebElement linkArtistworksService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'BROADWAY HD')]")
	private WebElement linkBroadwayHDService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'COMICS')]")
	private WebElement linkComicsService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'COMICSPLUS')]")
	private WebElement linkComicsPlusService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'CRUNCHYROLL')]")
	private WebElement linkCrunchyrollService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'EPIX')]")
	private WebElement linkEpixService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'EPREP')]")
	private WebElement linkEprepService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'GAIA')]")
	private WebElement linkGaiaService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'GREAT COURSES')]")
	private WebElement linkGreatCoursesService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'HOONUIT')]")
	private WebElement linkHoonuitService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'INDIEFLIX')]")
	private WebElement linkIndieflixService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'KIDSPEAK')]")
	private WebElement linkKidspeakService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'LAWDEPOT')]")
	private WebElement linkLawdepotService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'LEARN IT LIVE')]")
	private WebElement linkLearnItLiveService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'METHOD TEST PREP')]")
	private WebElement linkMethodTestPrepService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'ONEPLAY')]")
	private WebElement linkOnePlayService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'PONGALO')]")
	private WebElement linkPongaloService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'STINGRAY QELLO')]")
	private WebElement linkStingrayQelloService;

	@FindBy(xpath="//ul[@class='left_menu']//a[contains(text(),'TRANSPARENT LANGUAGE')]")
	private WebElement linkTransparentLanguageService;


    public void clickLinkFilters() {
        linkFilters.click();
    }

    public String checkLinkPath() {
        return linkPath.getText();
    }

    public boolean checkingFiltersPage() {
        return indentifierIdReports.isDisplayed();
    }

    public void clickLinkAdmins() {
        linkAdmins.click();
    }

    public boolean checkingAdminsPage() {
        return indentifierTableClassGrid.isDisplayed();
    }

    public void clickLinkPatrons() {
        linkPatrons.click();
    }

    public boolean checkingPatronsPage() {
        return indentifierTableClassGrid.isDisplayed();
    }

    public void clickLinkPageSettings() {
        linkPageSettings.click();
    }

    public boolean checkingPageSettingsPage() {
        return indentifierIdReports.isDisplayed();
    }

    public void clickLinkServiceSubscriptions() {
        linkServiceSubscriptions.click();
    }

    public boolean checkingServiceSubscriptionsPage() {
        return indentifierIdReports.isDisplayed();
    }

    public void clickLinkLicenses() {
        linkLicenses.click();
    }

    public boolean checkingLicensesPage() {
        return indentifierIdLicensePage.isDisplayed();
    }

    public boolean checkingMarketingPage() {
        return indentifierTableClassGrid.isDisplayed();
    }

    public void clickLinkReports() {
        linkReports.click();
    }

    public boolean checkingReportsPage() {
        return indentifierIdReports.isDisplayed();
    }

    public void clickLinkHTTPReferrerFiltering() {
        linkHTTPReferrerFiltering.click();
    }

    public boolean checkingHTTPReferrerFilteringPage() {
        return indentifierHTTPReferrerFilteringPage.isDisplayed();
    }

    public void clickLinkBarcodeFiltering() {
        linkBarcodeFiltering.click();
    }

    public boolean checkingBarcodeFilteringPage() {
        return indentifierBarcodeFilteringPage.isDisplayed();
    }

    public void clickLinkPortalRedirectFiltering() {
        linkPortalRedirectFiltering.click();
    }

    public boolean checkingPortalRedirectFilteringPage() {
        return indentifierPortalRedirectFilteringPage.isDisplayed();
    }

    public void clickLinkAccessKeyFiltering() {
        linkAccessKeyFiltering.click();
    }

    public boolean checkingAccessKeyFilteringPage() {
        return indentifierAccessKeyFiltering.isDisplayed();
    }

    public WebElement selectAllLibraryPatrons() {
        return selectService;
    }

    public void clickLinkMagazinesService() {
        linkMagazinesService.click();
    }

    public void clickLinkAcornTVService() {
        linkAcornTVService.click();
    }

    public void clickLinkArtistworksService() {
        linkArtistworksService.click();
    }

    public void clickLinkBroadwayHDService() {
        linkBroadwayHDService.click();
    }

    public void clickLinkComicsService() {
        linkComicsService.click();
    }

    public void clickLinkComicsPlusService() {
        linkComicsPlusService.click();
    }

    public void clickLinkCrunchyrollService() {
        linkCrunchyrollService.click();
    }

    public void clickLinkEpixService() {
        linkEpixService.click();
    }

    public void clickLinkEprepService() {
        linkEprepService.click();
    }

    public void clickLinkGaiaService() {
        linkGaiaService.click();
    }

    public void clickLinkGreatCoursesService() {
        linkGreatCoursesService.click();
    }

    public void clickLinkHoonuitService() {
        linkHoonuitService.click();
    }

    public void clickLinkIndieflixService() {
        linkIndieflixService.click();
    }

    public void clickLinkKidspeakService() {
        linkKidspeakService.click();
    }

    public void clickLinkLawdepotService() {
        linkLawdepotService.click();
    }

    public void clickLinkLearnItLiveService() {
        linkLearnItLiveService.click();
    }

    public void clickLinkMethodTestPrepService() {
        linkMethodTestPrepService.click();
    }

    public void clickLinkOnePlayService() {
        linkOnePlayService.click();
    }

    public void clickLinkPongaloService() {
        linkPongaloService.click();
    }

    public void clickLinkStingrayQelloService() {
        linkStingrayQelloService.click();
    }

    public void clickLinkTransparentLanguageService() {
        linkTransparentLanguageService.click();
    }

    public String checkOpenPageService() {
        return indentifierPageService.getText();
    }
}
