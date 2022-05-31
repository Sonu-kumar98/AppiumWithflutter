
@file:JvmName("_FinderRawMethods")
@file:JvmMultifileClass
package appium_flutter_driver

import java.util.regex.Pattern;
// chnages made by sonu
fun bySemanticsLabel(label: String): FlutterElement {
    return FlutterElement(mapOf(
        "finderType" to "BySemanticsLabel",
        "isRegExp" to false,
        "label" to label
    ))
}

fun bySemanticsLabel(label: Pattern): FlutterElement {
    return FlutterElement(mapOf(
        "finderType" to "BySemanticsLabel",
        "isRegExp" to true,
        "label" to label.toString()
    ))
}