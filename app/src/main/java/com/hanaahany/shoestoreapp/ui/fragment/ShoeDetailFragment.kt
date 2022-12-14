package com.hanaahany.shoestoreapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.hanaahany.shoestoreapp.R
import com.hanaahany.shoestoreapp.modle.ShoeDataList
import com.hanaahany.shoestoreapp.databinding.FragmentShoeDetailBinding
import com.hanaahany.shoestoreapp.ui.fragment.shoelist.ShoeListViewModel


class ShoeDetailFragment : Fragment() {
    private  val TAG = "ShoeDetailFragment"
    private lateinit var binding: FragmentShoeDetailBinding
      private  val viewModel: ShoeListViewModel by activityViewModels()
   // private lateinit var viewModel:ShoeListViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentShoeDetailBinding.inflate(inflater,container,false)


        binding.shoe=ShoeDataList(R.id.image_list_item,viewModel.editTextName.value,
            viewModel.editTextName.value,
            viewModel.editTextName.value,
            viewModel.editTextName.value)

       // val action=ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListingFragment().setNameShoes(name).setSizeShoes(size)
       // viewModel= ViewModelProvider(this).get(ShoeListViewModel::class.java)

        binding.btnSaveShoeDetails.setOnClickListener {

            viewModel.addItems(binding.shoe as ShoeDataList)

            findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListingFragment)

        }
        binding.btnCancel.setOnClickListener{
            findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListingFragment)
        }
        return binding.root
    }


    



}