//package com.hanaahany.shoestoreapp.ui.fragment
//
//import android.annotation.SuppressLint
//import android.content.Context
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.ImageView
//import android.widget.TextView
//import com.hanaahany.shoestoreapp.R
//import com.hanaahany.shoestoreapp.modle.ShoeDataList
//
//class ShoeAdapter(private val context: Context,
//                  private val dataSource: MutableList<ShoeDataList>
//): BaseAdapter() {
//    private  val TAG = "ShoeAdapter"
//    private val inflater: LayoutInflater
//            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//
//    override fun getCount(): Int {
////        notifyDataSetChanged()
//        Log.i(TAG, "getCount: ${dataSource.size}")
//        return dataSource.size
//
//    }
//
//    override fun getItem(p0: Int): Any {
//        var position=dataSource[0]
//
//        return dataSource[p0]
//    }
//
//    override fun getItemId(p0: Int): Long {
//        return p0.toLong()
//    }
//
//    @SuppressLint("ViewHolder")
//    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
//        notifyDataSetChanged()
//        // Get view for row item
//        val rowView = inflater.inflate(R.layout.item_list, p2, false)
//// Get title element
//        val name = rowView.findViewById(R.id.tv_name_list_item) as TextView
//
//// Get subtitle element
//        val price = rowView.findViewById(R.id.tv_price_list_item) as TextView
//
//// Get thumbnail element
//        val thumbnailImageView = rowView.findViewById(R.id.image_list_item) as ImageView
//// 1
//        val recipe = getItem(p0) as ShoeDataList
//
//// 2
//        name.text = recipe.name
//        price.text = recipe.price
//
//
//// 3
//        thumbnailImageView.setImageResource(R.drawable.shoes_back_image)
//
//        return rowView
//    }
//}
//
//
//
