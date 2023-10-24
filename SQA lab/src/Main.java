
public class Main {
    public static void main(String[] args) throws Exception {

       methods.initiateWebBrowser();
       methods.navigatetoURL(Variables.URL);
       methods.waitfortime(2000);
       methods.verifyTitle(Variables.expectedTitle);
       methods.entryText(Variables.userId,Variables.username);
       methods.entryText(Variables.passwordId,Variables.passWord);
       methods.clickElement(Variables.loginButtonId);
       methods.verifyElement(Variables.Xpath,Variables.expectedtedProducts);
       methods.addToCart(Variables.addToCartXpath);
       methods.addToCart(Variables.addToCartLogoXpath);
       methods.addToCart(Variables.checkOutXpath);
       methods.entryText(Variables.firstNameId,Variables.firstName);
       methods.entryText(Variables.lastNameId,Variables.lastName);
       methods.entryText(Variables.pCodeId,Variables.postalCode);
       methods.addToCart(Variables.continueXpath);
       methods.verifyAddToCartProduct(Variables.productText,Variables.productPrice);
       methods.clickElement(Variables.finishButton);
//       methods.clickElement(Variables.backHomeButton);










    }
}
