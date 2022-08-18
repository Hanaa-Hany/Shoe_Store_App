package com.hanaahany.shoestoreapp.ui.fragment.shoelist

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import com.hanaahany.shoestoreapp.R
import com.hanaahany.shoestoreapp.databinding.FragmentShoeListingBinding
import com.hanaahany.shoestoreapp.databinding.ItemListBinding
import com.hanaahany.shoestoreapp.ui.fragment.LoginFragment


class ShoeListingFragment : Fragment() {
    private val TAG = "ShoeListingFragment"
    private lateinit var binding: FragmentShoeListingBinding
    private  val viewModel:ShoeListViewModel by activityViewModels()
    //val args: ShoeListingFragmentArgs by navArgs()

    // var list=ArrayList<ShoeDataList>()
    // lateinit var listItems:ArrayList<ShoeDataList>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_listing, container, false)
        binding.btnFloatingAction.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoeListingFragment_to_shoeDetailFragment)

        )
//        //viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)
//        viewModel.isEmpty.observe(viewLifecycleOwner){
//            binding.linear.visibility=if (it)View.VISIBLE else View.GONE
//        }
       // binding.vm=viewModel
        viewModel.shoeList.observe(viewLifecycleOwner)  { newList->
            newList.forEach{newshoe ->
                val card:ItemListBinding=DataBindingUtil.inflate(inflater,R.layout.item_list,container,false)
                card.shoes=newshoe

                binding.linear.addView(card.root)

            }
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




       // updateUi()
       // addNewList()


//        for (i in 0 until 10){
////            viewModel.addItems()
//        viewModel.shoeList.observe(viewLifecycleOwner, Observer { newList ->
//           // val adapter = getView()?.let { ShoeAdapter(it.context, newList) }
//            val adapter = context?.let { ShoeAdapter(it,list) }
//            var items=ShoeDataList(R.drawable.shoes_back_image,"skjfk","dfk")
//
//            newList.add(items)
//            binding.listView.adapter = adapter
//            if (adapter != null) {
//                adapter.notifyDataSetChanged()
//            }
//        })
//        }

   // }

//    private fun addNewList() {
//        viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)
//        binding.btnFloatingAction.setOnClickListener {
//            findNavController().navigate(R.id.action_shoeListingFragment_to_shoeDetailFragment)
//            viewModel.x = true
//            viewModel.shoeList.observe(viewLifecycleOwner, Observer { newList1 ->
//                // newList1.add(ShoeDataList(R.drawable.shoes_back_image,args.nameShoes,args.sizeShoes))
//                //viewModel.x=true
//                viewModel.addItems()
//                val adapter1 = context?.let { ShoeAdapter(it, newList1) }
//                binding.listView.adapter = adapter1
//
//
//                adapter1?.notifyDataSetChanged()
//            })





            Log.i(TAG, "onViewCreated: " + (viewModel.shoeList.value?.size ?: -1))
        }


//    private fun addItems() {
//        //obj Data List
//        var items=ShoeDataList(R.drawable.shoes_back_image,"skjfk","dfk")
//        //instance of array list
//        for (i in 0 until 10){
//            list.add(items)
//        }
//        val adapter = context?.let { ShoeAdapter(it,list) }
//        binding.listView.adapter = adapter
//
//    }

//    private fun updateUi() {
//
//        viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)
//
//
//        viewModel.shoeList.observe(viewLifecycleOwner, Observer { newList ->
//
//            viewModel.addItems()
//            Log.i(TAG, "onViewCreated: " + (viewModel.shoeList.value?.size ?: -1))
//            val adapter = context?.let { ShoeAdapter(it, newList) }
//
//
//            adapter?.notifyDataSetChanged()
//            binding.listView.adapter = adapter
//        })
//
//
//    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logout -> findNavController().navigate(R.id.action_shoeListingFragment_to_loginFragment)
        }
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

}

