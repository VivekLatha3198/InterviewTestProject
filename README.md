Base Class:
TestProject1/src/test/java/Com/TestProject1/BaseClass.java  file contains reusable methods like launch browser, launchURL, inputs, Clickon, getattributes etc.. which are basic functions and can be reused in TestProject1.

Task1:
Data retrieval and modification from excel:
Data driven framework is used here to extract the data from excel which uses fileinputstream to  read the data. Once the excel is opened, dog breed values are fetched from all the rows with the default excel method and all the whitespaces were deleted in the values using string replace method and made lowercase using default string method. Once all this is done, those values are added to the set to avoid duplicate values.
Note: Apache poi dependencies were added to pom.xml file to implement data driven framework.
This scriptfile is available in TestProject1/src/test/java/Com/TestProject1/Task1_DataRetrievalAndModification.java

Task2:
API Automation Test:
Once we get the response from the given endpoints, the Json response is parsed and converted to Javascript object.  And Empty list is created to add individual dog breeds, by using for loop and condition check for an array of objects individual dog breeds were added to the newly created list.
lstOfMultipleDogBreeds test script has been added to retrieve multiple dog breeds and added in     specific list.
Status code check test script has been added to validate the response.
Status code name test script has been added to validate the response.
Contains string test script has been added to validate the response.
Response body check test script has been added to validate the response.
Json Value check test script has been added to validate the response.


Body matches String test script has been added to validate the response.
Collection file which contains request and scripts are available in InterviewTestProject/PostmanCollection.json

Task3:
UI Automation Test:
Launched browser on Microsoft edge with the giver URL "https://sweetshop.netlify.app/" and added 4 products with different quantities to the basket by fetching the web element and clicking on the ADD to basket option. 
 Also created one comparison array list (productNames) and added item names to check for further verification process. Then clicked on Basket page to navigate and checked whether all the items are present in the basket (i.e. productNamesOnBasket list) with the previous (productNames) list.
 For each product, quantity value has been assigned and stored in a variable to calculate and the value of totalpriceOnGBP is noted. All the individual product price were stored, added and multiplied with each product item quantity which gives totalprice. And it is validated with totalPricesOnGBP whether it matches or not.
Once I clicked the delivery type to standard shipping, the total price on GBP is changed and it is verified.
And finally, all the personal and payment details were entered using base class methods and clicked continue to checkout.
This script file is available in InterviewTestProject/TestProject1/src/test/java/Com/TestProject1/Task2_UIAutomation.java.
