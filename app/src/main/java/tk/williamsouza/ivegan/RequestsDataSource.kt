package tk.williamsouza.ivegan

import tk.williamsouza.ivegan.models.Request

class RequestsDataSource {
    companion object{
        fun createDataSet(): ArrayList<Request> {
            val restaurants = RestaurantsDataSource.createDataSet()
            val list = ArrayList<Request>()
            val listItems = ArrayList<String>()
            listItems.add("1 Greenburger")
            listItems.add("1 Tradicional Vegburger")
            list.add(
                    Request("Sáb - 20 fevereiro 2021",
                            restaurants[4],
                            6243,
                            listItems
                    )
            )

            list.add(
                    Request("Ter - 09 fevereiro 2021",
                            restaurants[4],
                            6243,
                            listItems
                    )
            )
            list.add(
                    Request("Sáb - 20 fevereiro 2021",
                            restaurants[1],
                            6243,
                            listItems
                    )
            )
            list.add(
                    Request("Sáb - 20 fevereiro 2021",
                            restaurants[1],
                            6243,
                            listItems
                    )
            )
            list.add(
                    Request("Sáb - 20 fevereiro 2021",
                            restaurants[3],
                            6243,
                            listItems
                    )
            )
            list.add(
                    Request("Sáb - 20 fevereiro 2021",
                            restaurants[0],
                            6243,
                            listItems
                    )
            )
            list.add(
                    Request("Sáb - 20 fevereiro 2021",
                            restaurants[1],
                            6243,
                            listItems
                    )
            )
            list.add(
                    Request("Sáb - 20 fevereiro 2021",
                            restaurants[1],
                            6243,
                            listItems
                    )
            )
            list.add(
                    Request("Sáb - 20 fevereiro 2021",
                            restaurants[2],
                            6243,
                            listItems
                    )
            )

            return list
        }
    }
}