package finder

import appium_flutter_driver.FlutterElement
import java.util.regex.Pattern

import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.FileDetector
import appium_flutter_driver.ancestor as _ancestor
import appium_flutter_driver.bySemanticsLabel as _bySemanticsLabel
import appium_flutter_driver.byTooltip as _byTooltip
import appium_flutter_driver.byType as _byType
import appium_flutter_driver.byValueKey as _byValueKey
import appium_flutter_driver.descendant as _descendant
import appium_flutter_driver.pageBack as _pageBack
import appium_flutter_driver.text as _text


public class FlutterFinder(driver: RemoteWebDriver) {
    private val driver = driver
    private val fileDetector = FileDetector({ _ -> null })
    fun ancestor(of: FlutterElement, matching: FlutterElement, matchRoot: Boolean = false): FlutterElement {
        val f = _ancestor(of, matching, matchRoot)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun ancestor(of: FlutterElement, matching: FlutterElement): FlutterElement {
        val f = _ancestor(of, matching)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun bySemanticsLabel(label: String): FlutterElement {
        val f = _bySemanticsLabel(label)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun bySemanticsLabel(label: Pattern): FlutterElement {
        val f = _bySemanticsLabel(label)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun byTooltip(input: String): FlutterElement {
        val f = _byTooltip(input)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun byType(input: String): FlutterElement {
        val f = _byType(input)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun byValueKey(input: String): FlutterElement {
        val f = _byValueKey(input)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun byValueKey(input: Int): FlutterElement {
        val f = _byValueKey(input)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun descendant(of: FlutterElement, matching: FlutterElement, matchRoot: Boolean = false): FlutterElement {
        val f = _descendant(of, matching, matchRoot)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun descendant(of: FlutterElement, matching: FlutterElement): FlutterElement {
        val f = _descendant(of, matching)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun pageBack(): FlutterElement {
        val f = _pageBack()
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
    fun text(input: String): FlutterElement {
        val f = _text(input)
        f.setParent(driver)
        f.setFileDetector(fileDetector)
        return f
    }
}