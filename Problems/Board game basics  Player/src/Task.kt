
data class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        var id = -1
        fun create(name: String): Player {
            val hp = 100
            id += 1
            return Player(id, name, hp)
        }
    }
}