package tk.williamsouza.ivegan.models

data class Restaurant(
        var title: String,
        var image: String,
        var rating: Double,
        var type: String,
        var distance: Double,
        var time: Int,
        var deliverTax: Double
) {
}