package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaproductReviewPage extends basePage {

	public NinjaproductReviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(linkText="Write a review")
	WebElement OnReview;
	
	public void clickOnReview()
	{
		OnReview.click();
	}
	
	@FindBy(xpath="//*[@id=\"input-name\"]")
	WebElement inputName;
	
	public void EnterName (String reviewerName)
	{
		inputName.sendKeys(reviewerName);
	}
	
	@FindBy(xpath="//*[@id=\"input-review\"]")
	WebElement inputReview;
	
	public void EnterInput (String inputreviewcontent)
	{
	    inputReview.sendKeys(inputreviewcontent);
	}
	
	 @FindBy(name = "rating")
	 List<WebElement> ratings;

	    // Select rating
	 public void selectRating(int ratingValue) 
	 {
	        if (ratingValue < 1 || ratingValue > 5) {
	            throw new IllegalArgumentException(
	                    "Rating should be between 1 and 5" );
	 }
     ratings.get(ratingValue - 1).click();
	 }
	 
	// Verify rating is selected
	 public boolean isRatingSelected(int ratingValue) 
	 {
      return ratings.get(ratingValue - 1).isSelected();
	  }
	 
@FindBy(xpath="//*[@id=\"button-review\"]")
WebElement continuebtn;

public void selectContinuebtn()
{
	continuebtn.click();
}

@FindBy(xpath="//*[@id=\"form-review\"]/div[2]")
WebElement completedmsg;

public String getcompletemsg()
{
	try {
		return (completedmsg.getText());
	}
	catch (Exception e) {
		return (e.getMessage());
	}
}

	
	


	
	

}
