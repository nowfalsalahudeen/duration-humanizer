package nl.mirrajabi.humanize.duration.languages

interface LanguageDictionary {
    fun get(key: String, count: Long): String
}