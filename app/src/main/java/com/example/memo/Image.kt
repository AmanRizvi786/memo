package com.example.memo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.memo.databinding.ActivityMainBinding

class Image : Fragment() {
    private lateinit var button: Button
    private lateinit var image: ImageView




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val y = inflater.inflate(R.layout.fragment_image, container, false)

        button = y.findViewById(R.id.button)
        image =y.findViewById(R.id.images)

        button.setOnClickListener {
            pickImageGallery()

        }


        return y
    }

    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, 101)

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode,resultCode,data)
        if (requestCode == 101 && resultCode == AppCompatActivity.RESULT_OK) {
            image.setImageURI(data?.data)
        }
    }
    companion object {
//        const val IMAGE_REQUEST_CODE = 101
//        const val READ_EXTERNAL_STORAGE_PERMISSION_CODE =101
        }



}