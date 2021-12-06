package com.kim.pizzaorderapp_kim.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kim.pizzaorderapp_kim.Datas.Store
import com.kim.pizzaorderapp_kim.R
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*
import com.kim.pizzaorderapp_kim.adapters.PizzaStoreAdapter as PizzaStoreAdapter1

class PIzzaStoreListFragment : Fragment() {

    val mPizzaStoreDataList = ArrayList<Store>()

    lateinit var mPizzaStoreAdapter : com.kim.pizzaorderapp_kim.adapters.PizzaStoreAdapter




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        동작 관련 코드

        mPizzaStoreDataList.add( Store("A피자가게", "1111-5555", "https://cdn3.iconfinder.com/data/icons/street-food-and-food-trucker-1/64/pizza-fast-food-bake-bread-128.png"))
        mPizzaStoreDataList.add( Store("B피자가게", "2222-4444", "https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png"))
        mPizzaStoreDataList.add( Store("C피자가게", "5555-2222", "https://cdn3.iconfinder.com/data/icons/food-set-3/91/Food_C219-128.png"))
        mPizzaStoreDataList.add( Store("D피자가게", "3333-3333", "https://cdn0.iconfinder.com/data/icons/fastfood-31/64/pizza-italian-food-fast-fastfood-cheese-piece-128.png"))


mPizzaStoreAdapter = com.kim.pizzaorderapp_kim.adapters.PizzaStoreAdapter(requireContext(), R.layout.pizza_store_list_item, mPizzaStoreDataList)
        pizzaStoreListView.adapter = mPizzaStoreAdapter



    }


}