object PlayingField {

    object Size {
        var width = 0
        var height = 0

        fun changeSize(width: Int, height: Int) {
            if (width < 0 && height < 0) {
                PlayingField.Size.width = 0
                PlayingField.Size.height = 0
            }
        }
    }
}



//class Player(val id: Int, name: String) {
//    companion object Properties {
//        val defaultSpeed = 8
//        val maxSpeed = 13
//
//        fun calcMovePenalty(cell: Int) : Int {
//            return defaultSpeed - cell % 3
//        }
//    }
//}
//
//fun calculatePlayerSpeed(cell: Int): Int {
//    return Player.Properties.calcMovePenalty(cell)
//}