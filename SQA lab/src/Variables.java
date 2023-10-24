import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Variables {
        static Random random = new Random();
        static int randomInt = random.nextInt(6) + 1;

        public static String chromedriver= "web.chrome.driver";
        public static String driverPath="src/driver";
        public static String URL="https://saucedemo.com/";
        public static  String expectedTitle="Swag Labs";
        public static String username="standard_user";

        public static String userId="user-name";

        public  static  String passWord="secret_sauce";

        public static String passwordId="password";

        public static String loginButtonId="login-button";
        public static String Xpath="//span[@class='title']";
        public static String expectedtedProducts="Products";
        public static WebDriver driver;



        public static String addToCartXpath="//div[@class ='inventory_list']/div[@class='inventory_item']["+randomInt+"]/div[@class='inventory_item_description']/div[@class='pricebar']/button";

        public static String addToCartLogoXpath="//a[@class='shopping_cart_link']";

        public static String checkOutXpath="//div[@class='cart_footer']/button[2]";

        public static final String firstName = "Muhammad Bin";
        public static final String lastName = "Waseem";
        public static final String postalCode = "712324";
        public static final String firstNameId = "first-name";
        public static final String lastNameId = "last-name";
        public static final String pCodeId = "postal-code";

        public static final  String continueXpath="//div[@class='checkout_buttons']/input";
        public static final String productText="//div[@class='cart_item_label']/a/div";

        public static final String productPrice="//div[@class='cart_item_label']/div[@class='item_pricebar']";
        public static final String continueButton = "continue";
        public static final String finishButton = "finish";
        public static final String backHomeButton = "back-to-products";






}
