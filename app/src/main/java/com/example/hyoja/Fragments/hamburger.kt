 package com.example.hyoja.Fragments

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.hyoja.R

class hamburger : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_hamburger, container, false)

        rootView.findViewById<View>(R.id.burger1).setOnClickListener {
            showBurgerDetailsDialog(R.drawable.burger1)
        }

        rootView.findViewById<View>(R.id.burger2).setOnClickListener {
            showBurgerDetailsDialog(R.drawable.burger2)
        }

        rootView.findViewById<View>(R.id.burger3).setOnClickListener {
            showBurgerDetailsDialog(R.drawable.burger3)
        }

        rootView.findViewById<View>(R.id.burger4).setOnClickListener {
            showBurgerDetailsDialog(R.drawable.burger4)
        }

        rootView.findViewById<View>(R.id.burger5).setOnClickListener {
            showBurgerDetailsDialog(R.drawable.burger5)
        }

        rootView.findViewById<View>(R.id.burger6).setOnClickListener {
            showBurgerDetailsDialog(R.drawable.burger6)
        }
        return rootView
    }

    private fun showBurgerDetailsDialog(imageResId: Int) {

        val dialogView = layoutInflater.inflate(R.layout.fragment_show_set_or_one, null)
        dialogView.setBackgroundColor(Color.TRANSPARENT);

        // 다이얼로그 뷰에 내용 설정
//        dialogView..setImageResource(imageResId)
//        dialogView.dialog_burger_name.text = burgerName
//        dialogView.dialog_burger_price.text = "가격: $burgerPrice"

        // AlertDialog를 생성하고 설정
        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setView(dialogView)

        // 다이얼로그를 표시
        val alertDialog = alertDialogBuilder.create()

        // 다이얼로그 외부를 터치해도 닫히지 않도록 설정
        alertDialog.setCanceledOnTouchOutside(false)

        // "X" 버튼 클릭 시 다이얼로그 닫기
        val closeButton = dialogView.findViewById<ImageView>(R.id.dialog_x_button)
        closeButton.setOnClickListener {
            alertDialog.dismiss()
        }

        alertDialog.show()
    }


}