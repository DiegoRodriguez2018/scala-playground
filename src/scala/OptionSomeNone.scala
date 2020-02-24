object OptionSomeNone {

    def main(args: Array[String]): Unit = {
        println(toInt("5"))
    }

    def toInt(in: String): Option[Int] = {
        try {
            Some(Integer.parseInt(in.trim))
        } catch {
            case e: NumberFormatException => None
        }
    }
}
