// IS_APPLICABLE: false
// COMPILER_ARGUMENTS: -XXLanguage:-FunctionReferenceWithDefaultValueAsOtherType

fun Int.exec(f: (Int) -> Unit) = f(this)

fun bar(x: Int) = x

fun foo() {
    2.exec {<caret> bar(it) }
}
