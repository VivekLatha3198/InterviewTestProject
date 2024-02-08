package Com.TestProject1;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2_UIAutomation extends BaseClass{

	public static void main(String[] args)
	{
				//launch browser and URL
		        driver = BaseClass.launchBrowser();
				BaseClass.urlLaunch("https://sweetshop.netlify.app/");
				 
				 //Add different quantities of at least 4 products in the basket 
				 WebElement addToBasketShertbertDiscs = driver.findElement(By.xpath("//a[@data-name = 'Sherbet Discs']"));
				 clickon(addToBasketShertbertDiscs);
				 clickon(addToBasketShertbertDiscs);
				 String product1 = getAttribute(addToBasketShertbertDiscs,"data-name");
				 WebElement addToBasketChocolateCups = driver.findElement(By.xpath("//a[@data-name = 'Chocolate Cups']"));
				 clickon(addToBasketChocolateCups);
				 clickon(addToBasketChocolateCups);
				 String product2 = getAttribute(addToBasketChocolateCups,"data-name");
				 WebElement addToBasketBonBons = driver.findElement(By.xpath("//a[@data-name = 'Strawberry Bon Bons']"));
				 clickon(addToBasketBonBons);
				 clickon(addToBasketBonBons);
				 clickon(addToBasketBonBons);
				 String product3 = getAttribute(addToBasketBonBons,"data-name");
				 WebElement addToBasketShertbertStraws = driver.findElement(By.xpath("//a[@data-name = 'Sherbert Straws']"));
				 clickon(addToBasketShertbertStraws);
				 String product4 = getAttribute(addToBasketShertbertStraws,"data-name");
				 
				 //Adding 4 product names to new list
				 ArrayList<String> productNames = new ArrayList<String>();
				 productNames.add(product1);
				 productNames.add(product2);
				 productNames.add(product3);
				 productNames.add(product4);
								 
				 //Navigating to basket page
				 WebElement basketPage = driver.findElement(By.xpath("//a[@href = '/basket']"));
				 clickon(basketPage);

				 //1.To Check  All the selected items are present in basket
				 String shertbertDiscsitem = driver.findElement(By.xpath("//*[text() = 'Sherbet Discs']")).getText();
				 String chocolateCupsitem = driver.findElement(By.xpath("//*[text() = 'Chocolate Cups']")).getText();
				 String strawberryBonBonsitem = driver.findElement(By.xpath("//*[text() = 'Strawberry Bon Bons']")).getText();
				 String shertbertStrawsitem = driver.findElement(By.xpath("//*[text() = 'Sherbert Straws']")).getText();				 
				 ArrayList<String> productNamesOnBasket = new ArrayList<String>();
				 productNamesOnBasket.add(shertbertDiscsitem);
				 productNamesOnBasket.add(chocolateCupsitem);
				 productNamesOnBasket.add(strawberryBonBonsitem);
				 productNamesOnBasket.add(shertbertStrawsitem);	
				 
				 boolean ispresent =  productNames.equals(productNamesOnBasket);
				 if (ispresent) {
					 System.out.println("All the selected items are present in basket");
				 }
				 else
				 {
					 System.out.println("All the selected items are not present in basket"); 
				 }
				 
				 //Quantity given for each product item
				 int quanOfSherbertStraws = 1;
				 int quanOfSherbertDiscs = 2;
				 int quanOfChocolateCups= 2;
				 int quanOfStrawberryBonBons = 3;
				 
				 //2.Test the total price in GBP is correct i.e., matches the price of individual items based on quantity.
				 String totalValue = driver.findElement(By.xpath("//*[text()='£7.65']")).getText().replace("£", "");
				 Float totalPriceInGBP = Float.valueOf(totalValue);
				 String price1 = driver.findElement(By.xpath("(//span[@class='text-muted'])[2]")).getText().replace("£", "");
				 Float sherbertStrawsPrice = Float.valueOf(price1);
				 String price2 = driver.findElement(By.xpath("(//span[@class='text-muted'])[3]")).getText().replace("£", "");
				 Float strawberryBonBonsPrice = Float.valueOf(price2);
				 String price3 = driver.findElement(By.xpath("(//span[@class='text-muted'])[4]")).getText().replace("£", "");
				 Float chocolateCupsPrice = Float.valueOf(price3);				 
				 String price4 = driver.findElement(By.xpath("(//span[@class='text-muted'])[5]")).getText().replace("£", "");
				 Float shetrbetDiscsPrice = Float.valueOf(price4);			 
				 
				 
				 float totalPriceOfAllItems = (sherbertStrawsPrice*quanOfSherbertStraws) + (strawberryBonBonsPrice*quanOfStrawberryBonBons) + (chocolateCupsPrice*quanOfChocolateCups) + (shetrbetDiscsPrice*quanOfSherbertDiscs);
				 if (totalPriceOfAllItems == totalPriceInGBP)
				 {
					 System.out.println("The total price in GBP is correct and matches the price of individual items based on quantity.");
				 }
				 else
				 {
					 System.out.println("The total price in GBP is not correct and not matches the price of individual items based on quantity.");
				 }
				 
				 //3.Change the delivery type to Standard Shipping and verify the total price.
				 WebElement standardShipping = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
				 clickon(standardShipping);
				 String priceOnShipping= driver.findElement(By.xpath("//*[text()='£NaN']")).getText();
				 if (priceOnShipping.equals("£NaN"))
				 {
					 System.out.println("When we change the delivery type to Standard Shipping,total price is changed and it is shown as '£NaN'");
				 }
				 else
				 {
					 System.out.println("When we change the delivery type to Standard Shipping, total price is not changed and not shown as '£NaN'");
				 }		
				 
				 //4.Fill the details and click on checkout.
				 WebElement firstName = driver.findElement(By.xpath("//input[@id= 'name'][1]"));
				 inputs(firstName, "Vivek");
				 WebElement lastName = driver.findElement(By.xpath("(//input[@id='name'])[2]"));
				 inputs(lastName, "Rajan");
				 WebElement email = driver.findElement(By.xpath("//input[@type= 'email']"));
				 inputs(email, "vivekrajan@nousinfo.com");
				 WebElement address1 = driver.findElement(By.id("address"));
				 inputs(address1, "3/156,North Street,London");
				 WebElement address2 = driver.findElement(By.id("address2"));
				 inputs(address2, "address2");
				 WebElement country = driver.findElement(By.id("country"));
				 SelectByVisbibleText(country, "United Kingdom");
				 WebElement city = driver.findElement(By.id("city"));
				 SelectByVisbibleText(city, "Bristol");
				 WebElement zip = driver.findElement(By.id("zip"));
				 inputs(zip, "789021");
				 WebElement ccName = driver.findElement(By.id("cc-name"));
				 inputs(ccName, "VivekRajan");
				 WebElement ccNumber = driver.findElement(By.id("cc-number"));
				 inputs(ccNumber, "7890234567801234");
				 WebElement ccExpiration = driver.findElement(By.id("cc-expiration"));
				 inputs(ccExpiration, "09/2030");
				 WebElement ccCVV = driver.findElement(By.id("cc-cvv"));
				 inputs(ccCVV, "567");
				 WebElement checkout = driver.findElement(By.xpath("//button[@type = 'submit']"));
				 clickon(checkout);						 
				 
	}
	}

