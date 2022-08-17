package com.hanaahany.shoestoreapp.ui.fragment.shoelist


import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hanaahany.shoestoreapp.modle.ShoeDataList


class ShoeListViewModel() : ViewModel() {
    private val TAG = "ShoeListViewModel"
    private val _shoeList = MutableLiveData<MutableList<ShoeDataList>>()
    val shoeList: LiveData<MutableList<ShoeDataList>>
        get() = _shoeList
    private val _isEmpty=MutableLiveData<Boolean>()
    val isEmpty:LiveData<Boolean>
    get() = _isEmpty





    //var shoe:ShoeListingFragment=ShoeListingFragment()
   // private var items = ShoeDataList(R.drawable.shoes_back_image, "skjfk", "dfk")

    //private var newItem=(ShoeDataList(R.drawable.shoes_back_image,shoe.args.nameShoes,shoe.args.sizeShoes))
    var x = false
    // private  var newItem=ShoeDataList()

    init {
        //var items=ShoeDataList(R.drawable.shoes_back_image,"skjfk","dfk")

            _shoeList.value = mutableListOf()
        _isEmpty.value=true

        //  _shoeList.value= arrayListOf(items)

    }



    fun addItems(shoe:ShoeDataList) {
        //obj Data List
        //  var items=ShoeDataList(R.drawable.shoes_back_image,"skjfk","dfk")
        //instance of array list
            _shoeList.value?.add(shoe)
        _isEmpty.value=false

////        for (i in 0 until 5) {
//            _shoeList.value?.add(items)
//        }


    }


}