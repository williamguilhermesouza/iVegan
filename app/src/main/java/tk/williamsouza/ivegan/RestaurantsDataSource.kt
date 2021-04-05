package tk.williamsouza.ivegan

import tk.williamsouza.ivegan.models.Restaurant

class RestaurantsDataSource {
    companion object{
        fun createDataSet(): ArrayList<Restaurant>{
            val list = ArrayList<Restaurant>()
            list.add(
                    Restaurant(
                        "Bistro Vegano",
                            "https://raw.githubusercontent.com/williamguilhermesouza/iVegan/master/app/src/main/res/drawable/bistro.webp",
                            4.5,
                            "Lanches",
                        4.6,
                            30,
                            0.0
                    )
            )

            list.add(
                    Restaurant(
                            "Buddah Burger",
                            "https://raw.githubusercontent.com/williamguilhermesouza/iVegan/master/app/src/main/res/drawable/buda.webp",
                            4.3,
                            "Lanches",
                            3.6,
                            20,
                            7.0
                    )
            )
            list.add(
                    Restaurant(
                            "Nork Burger",
                            "https://raw.githubusercontent.com/williamguilhermesouza/iVegan/master/app/src/main/res/drawable/nork.webp",
                            3.9,
                            "Lanches",
                            3.6,
                            35,
                            12.0
                    )
            )
            list.add(
                    Restaurant(
                            "Paixão Vegana",
                            "https://raw.githubusercontent.com/williamguilhermesouza/iVegan/master/app/src/main/res/drawable/paixao.webp",
                            4.8,
                            "Lanches",
                            0.6,
                            10,
                            0.0
                    )
            )

            list.add(
                    Restaurant(
                            "Nikit Vegan",
                            "https://raw.githubusercontent.com/williamguilhermesouza/iVegan/master/app/src/main/res/drawable/nikitvegan.webp",
                            4.2,
                            "Lanches",
                            4.3,
                            30,
                            5.0
                    )
            )

            list.add(
                    Restaurant(
                            "Veglotus",
                            "https://raw.githubusercontent.com/williamguilhermesouza/iVegan/master/app/src/main/res/drawable/veglotus.webp",
                            3.7,
                            "Lanches",
                            6.6,
                            40,
                            12.0
                    )
            )

            return list
        }
    }
}