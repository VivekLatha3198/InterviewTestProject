TestProject1/src/test/java/Com/TestProject1/BaseClass.java  file contains reusable methods like launch browser,launchURL,inputs,Clickon,getattributes etc.. which are basic function andcan be reused in TestProject1.
Task1:
  Data retrieval and modification from excel:
  Data driven framework is used here to extract the data from the excel which uses fileinputstream to read the data. once the excel is opened, dog breed values are fetched from all the rows 
  and all the whitespaces were deleted in the values using string replace method and made them lowercase using default string method. Once all this done, those values are added to the set to avoid duplicate values.

  Note: Apache poi dependencies were added to pom.xml file to implement data driven framework.
  This program file is available in TestProject1/src/test/java/Com/TestProject1/Task1_DataRetrievalAndModification.java

Task2:
  API Automation Test:
    Once we got the response from the given endpoints, the json response is parsed and converted to javascript object. Empty list is created to add individual dog breeds, by using for loop and condition check for
    an array of objects individual dog breeds were added to the newly created list.

    lstOfMultipleDogBreeds test script has been added to retrieve multiple dog breeds and added in specific list.

    Status code check test script has been added to validate the reponse.
    Status code name test script has been added to validate the reponse.
    Contains string tets script has been added to validate the reponse.
    Response body check test script has been added to validate the reponse.
    Json Value check test script has been added to validate the reponse.
    Body matches String test script has been added to validate the response.

    Collection file which contains request and scripts are available in InterviewTestProject/PostmanCollection.json

  Task3:
   UI Automation Test:
     Launched browser on microsoft edge with the giver URL "https://sweetshop.netlify.app/" and added 4 products with different quantities to the basket by fetching the webelement and clicking on the ADD to basket option. 
     Also created one comparison array list (productNames) and added item names to check for further verificaton process. Then clicked on Basket page to navigate and checked whether all the items are present in the basket (i.e. productNamesOnBasket
     list) with the previous (productNames) list.

     For each product, quantity has been given which has been stored in a variable to calculate and the totalpriceOnGBP is noted. Stroed and added  all the individual product price and multiplied with the each product item quantity gives totalprice/
     And it is checked with totalPricesOnGBP whether it matches or not.

     once I clicked the delivery type to standard shipping, total price on GBP is changed and it is verified.
     And finally all the personal and payment details were entered using baseclass methods and clicked continue to checkout.
    
    This test file is available in InterviewTestProject/TestProject1/src/test/java/Com/TestProject1/Task2_UIAutomation.java.

  
  
