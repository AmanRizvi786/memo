package com.example.memo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Product : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rowView=inflater.inflate(R.layout.fragment_product, container, false)

        val recyclerView: RecyclerView = rowView.findViewById(R.id.rcv)

        val data = arrayListOf<DataModel>(
            DataModel(R.drawable.baseline_access_time_filled_24, "ImageView"),
            DataModel(R.drawable.baseline_camera_alt_24, "Camera"),
            DataModel(R.drawable.baseline_edit, "EditText"),
            DataModel(R.drawable.baseline_access_time_filled_24, "Time Picker"),
            DataModel(R.drawable.baseline_check_box_24, "Checkbox"),
            DataModel(R.drawable.baseline_date_range_24, "Date Picker"),
            DataModel(R.drawable.baseline_star_24, "Rating Bar"),
            DataModel(R.drawable.baseline_text_fields_24, "TextView"),
            DataModel(R.drawable.baseline_toggle_off_24, "Toggle Switch"),
            DataModel(R.drawable.baseline_format_list_bulleted_24, "ListView") ,
            DataModel(R.drawable.baseline_image_24, "ImageView"),
            DataModel(R.drawable.baseline_camera_alt_24, "Camera"),
            DataModel(R.drawable.baseline_edit_24, "EditText"),
            DataModel(R.drawable.baseline_access_time_filled_24, "Time Picker"),
            DataModel(R.drawable.baseline_check_box_24, "Checkbox"),
            DataModel(R.drawable.baseline_date_range_24, "Date Picker"),
            DataModel(R.drawable.baseline_star_24, "Rating Bar"),
            DataModel(R.drawable.baseline_text_fields_24, "TextView"),
            DataModel(R.drawable.baseline_toggle_off_24, "Toggle Switch"),
            DataModel(R.drawable.baseline_format_list_bulleted_24, "ListView"),
            DataModel(R.drawable.baseline_image_24, "ImageView"),
            DataModel(R.drawable.baseline_camera_alt_24, "Camera"),
            DataModel(R.drawable.baseline_edit_24, "EditText"),
            DataModel(R.drawable.baseline_access_time_filled_24, "Time Picker"),
            DataModel(R.drawable.baseline_check_box_24, "Checkbox"),
            DataModel(R.drawable.baseline_date_range_24, "Date Picker"),
            DataModel(R.drawable.baseline_star_24, "Rating Bar"),
            DataModel(R.drawable.baseline_text_fields_24, "TextView"),
            DataModel(R.drawable.baseline_toggle_off_24, "Toggle Switch"),
            DataModel(R.drawable.baseline_format_list_bulleted_24, "ListView")

        )

        val myAdapter = RecyclerAdapter(requireContext(),data)
        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        return rowView
    }


}