package tk.williamsouza.ivegan.models

data class Request(
        val date: String,
        val restaurant: Restaurant,
        val id: Int,
        val items: List<String>
) {
}