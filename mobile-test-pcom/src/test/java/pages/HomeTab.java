package pages;

import elements.ArticleDetailElements;
import elements.FeedListElements;
import io.appium.java_client.AppiumDriver;

public class HomeTab extends BasePage {
    private FeedListElements feedListElements;
    private ArticleDetailElements articleDetailElements;

    public HomeTab(AppiumDriver driver) {
        super(driver);
        feedListElements = new FeedListElements(driver);
        articleDetailElements = new ArticleDetailElements(driver);
    }

    public void HomeTabTC2() {
        String title = feedListElements.getFeedItemTopStoryTitle();
        feedListElements.feedItemTopStoryClick();
        articleDetailElements.assertTitleResult(title);
    }

    public void HomeTabTC6() {
        String title = feedListElements.getFeedItemTitle();
        feedListElements.feedItemClick();
        articleDetailElements.assertTitleResult(title);
    }
}
