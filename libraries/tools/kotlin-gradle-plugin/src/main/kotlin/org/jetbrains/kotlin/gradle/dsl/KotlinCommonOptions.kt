// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
package org.jetbrains.kotlin.gradle.dsl

interface KotlinCommonOptions {

    /**
     * Allow to use declarations only from the specified version of bundled libraries
     * Possible values: "1.0", "1.1", "1.2 (EXPERIMENTAL)"
     * Default value: "1.1"
     */
     var apiVersion: kotlin.String

    /**
     * Provide source compatibility with specified language version
     * Possible values: "1.0", "1.1", "1.2 (EXPERIMENTAL)"
     * Default value: "1.1"
     */
     var languageVersion: kotlin.String

    /**
     * Generate no warnings
     * Default value: false
     */
     var suppressWarnings: kotlin.Boolean

    /**
     * Enable verbose logging output
     * Default value: false
     */
     var verbose: kotlin.Boolean

    /**
     * A list of additional compiler arguments
     * Default value: emptyList()
     */
     var freeCompilerArgs: kotlin.collections.List<kotlin.String>
}
