package org.example.droidjar.lib

/**
 * Sample library used by both the "app" and the "cli" modules.
 */
class DroidJarLib {

    fun countUniqueCharacters(string: String): Int = HashSet(string.toList()).size

}
