package com.hanaahany.shoestoreapp.ui.fragment.shoelist


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hanaahany.shoestoreapp.modle.ShoeDataList


class ShoeListViewModel() : ViewModel() {
    private val TAG = "ShoeListViewModel"
    private val _shoeList = MutableLiveData<MutableList<ShoeDataList>>()
    val shoeList: LiveData<MutableList<ShoeDataList>>
        get() = _shoeList
    private val _isEmpty = MutableLiveData<Boolean>()
    val isEmpty: LiveData<Boolean>
        get() = _isEmpty

    var editTextName = MutableLiveData<String>()
    init {

        _shoeList.value = mutableListOf()
        _isEmpty.value = true

    }
    fun addItems(shoe: ShoeDataList) {
        //instance of array list
        _shoeList.value?.add(shoe)
        _isEmpty.value = false

////        for (i in 0 until 5) {
//            _shoeList.value?.add(items)
//        }


    }


}