package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHoverPage();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "caption NOT displayed");
        assertEquals(caption.getTitle(),"name: user1", "Caption title INCORRECT" );
        assertEquals(caption.getLinkText(), "View profile", "Caption link text is INCORRECT");
        assertTrue(caption.getLink().endsWith("/users/1"));

    }
}
