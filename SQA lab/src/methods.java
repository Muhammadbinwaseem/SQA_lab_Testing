import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
    public static void waitfortime(int ms)throws InterruptedException{
        Thread.sleep(ms);
    }
    public static void initiateWebBrowser() throws Exception{
        try {
            System.setProperty(Variables.chromedriver, Variables.driverPath);
            Variables.driver=new ChromeDriver();
            Variables.driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void navigatetoURL(String url)throws Exception{
        try {

            Variables. driver.get(url);

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void verifyTitle(String title){

        String actualTitle=  Variables.driver.getTitle();
        if(actualTitle.equals(title)){
            System.out.println("Title Test Passed");
        }else {
            System.out.println("Title Test Failed");
        }
    }

    public static void entryText(String identifier,String testdata)throws Exception{
        try {

            WebElement userNameTextBox = Variables. driver.findElement(By.id(identifier));
            userNameTextBox.sendKeys(testdata);

        }catch (Exception e){
            System.out.println(e);
        }



    }
    public static void clickElement(String identifier)throws Exception{
        try {

            WebElement loginbutton= Variables.driver.findElement(By.id(identifier));
            loginbutton.click();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void verifyElement(String identifier,String expectedResult)throws Exception{

        WebElement heading = Variables. driver.findElement(By.xpath(identifier));
        String actualProducts = heading.getText();


        if (actualProducts.equals(expectedResult)) {
            System.out.println("Products Test Passed");
        } else {
            System.out.println("Products Test Failed");
        }

    }
    public static void addToCart(String identifier){
        try {

            WebElement addToCartButton= Variables.driver.findElement(By.xpath(identifier));
            addToCartButton.click();
        }catch (Exception e){
            System.out.println(e);
        }

    }

//    public static void addToCartIconXpath(String identifier){
//        try {
//
//            WebElement addToCartLogoButton= Variables.driver.findElement(By.xpath(identifier));
//            addToCartLogoButton.click();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//    }

//    public static void checkOutButton(String identifier){
//        try {
//
//            WebElement checkOutButton= Variables.driver.findElement(By.xpath(identifier));
//            checkOutButton.click();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//    }


    public static void verifyAddToCartProduct(String identifier1,String identifier2)throws Exception{

        WebElement heading = Variables. driver.findElement(By.xpath(identifier1));
        String actualProductTitle = heading.getText();

        WebElement price = Variables. driver.findElement(By.xpath(identifier2));
        String actualProductPrice = price.getText();


        String[] productTitle={"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt",
                "Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};
        String[] productPrice={"$29.99","$9.99","$15.99","$49.99","$7.99","$15.99"};
        System.out.println(actualProductPrice);
        for (String product:productTitle) {
            if (product == actualProductTitle) {
                System.out.println(product);
            }
        }

        for (String product:productPrice) {
            if (product == actualProductPrice) {
                System.out.println(product);
            }
        }



    }



    }



