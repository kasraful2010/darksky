package framework.page_object_model_web;

import framework.actions_web.BasePage;
import org.openqa.selenium.By;

public class DarkskyPage extends BasePage {

	private By textField = By.xpath("//input[@type='text']");
	private By search = By.xpath("//a[@class='searchButton']//img[@width='16']");
	private By currentTemp = By.xpath("//span[@class='summary swap']");

	public void clearTextField (){ clear(textField);}

	public void sendText(String text){sendText(textField, text);}

	public void clickOnSearch(){clickOn(search);}

	public void verify(){convertToInt(currentTemp,2,18);}



}
