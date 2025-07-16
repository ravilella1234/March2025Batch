package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedJSUtil 
{

    private WebDriver driver;

    public AdvancedJSUtil(WebDriver driver) {
        this.driver = driver;
    }

    // Element Retrieval using JavaScriptExecutor

    // 1. By ID
    public WebElement getElementByIdJS(String id) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(
            "return document.getElementById(arguments[0]);", id);
    }

    // 2. By Name
    public WebElement getElementByNameJS(String name) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(
            "return document.getElementsByName(arguments[0])[0];", name);
    }

    // 3. By Class Name
    public WebElement getElementByClassNameJS(String className) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(
            "return document.getElementsByClassName(arguments[0])[0];", className);
    }

    // 4. By Link Text
    public WebElement getElementByLinkTextJS(String linkText) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(
            "var links = document.getElementsByTagName('a');" +
            "for (var i = 0; i < links.length; i++) {" +
            "  if (links[i].textContent.trim() === arguments[0]) return links[i];" +
            "}" +
            "return null;", linkText);
    }

    // 5. By Partial Link Text
    public WebElement getElementByPartialLinkTextJS(String partialText) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(
            "var links = document.getElementsByTagName('a');" +
            "for (var i = 0; i < links.length; i++) {" +
            "  if (links[i].textContent.includes(arguments[0])) return links[i];" +
            "}" +
            "return null;", partialText);
    }

    // 6. By Tag Name
    public WebElement getElementByTagNameJS(String tagName) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(
            "return document.getElementsByTagName(arguments[0])[0];", tagName);
    }

    
    // 7. By CSS Selector
    public WebElement getElementByCssSelectorJS(String cssSelector) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(
            "return document.querySelector(arguments[0]);", cssSelector);
    }

    // 8. By XPath (via JS)
    public WebElement getElementByXPathJS(String xpath) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(
            "return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;", xpath);
    }


}
