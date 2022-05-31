@file:JvmName("_FinderRawMethods")
@file:JvmMultifileClass
package appium_flutter_driver

fun byType(input: String): FlutterElement {
    return FlutterElement(mapOf(
        "finderType" to "ByType",
        "type" to input
    ))
}