package src.NorXndir


internal object Func {
    fun remVowel(str: String): String {
        return str.replace("[ԱաԻիՈուՒԸըՕօԵեԷէ]".toRegex(), " ")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val str = "Գեղարքունիքի մարզային միասնական հարթակը գործառույթների առումով առայժմ եզակի է հանրապետության տարածքում"
        println(remVowel(str))
    }
}