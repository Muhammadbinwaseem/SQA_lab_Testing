
public class Main {
    public static void main(String[] args) throws Exception {

       methods.initiateWebBrowser();

       methods.navigatetoURL(Variables.URL);
       methods.waitfortime(2000);
       methods.verifyTitle(Variables.expectedTitle);
       methods.entryText(Variables.userId,Variables.username);
       methods.entryText(Variables.passwordId,Variables.passWord);
       methods.clickElement(Variables.loginButtonId);
       methods.waitfortime(2000);
       methods.verifyElement(Variables.Xpath,Variables.expectedtedProducts);
       methods.waitfortime(2000);
       methods.addToCart(Variables.addToCartXpath);
       methods.waitfortime(2000);
       methods.addToCart(Variables.addToCartLogoXpath);
       methods.waitfortime(2000);
       methods.addToCart(Variables.checkOutXpath);
       methods.waitfortime(2000);
       methods.entryText(Variables.firstNameId,Variables.firstName);
       methods.entryText(Variables.lastNameId,Variables.lastName);
       methods.entryText(Variables.pCodeId,Variables.postalCode);
       methods.waitfortime(2000);
       methods.addToCart(Variables.continueXpath);
       methods.waitfortime(2000);
       methods.verifyAddToCartProduct(Variables.productText,Variables.productPrice);

       methods.clickElement(Variables.finishButton);
       methods.waitfortime(2000);
       methods.clickElement(Variables.backHomeButton);










    }
}
