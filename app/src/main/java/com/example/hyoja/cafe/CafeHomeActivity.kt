package com.example.hyoja.cafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hyoja.cafe.model.CafeModel
import com.example.hyoja.common.util.CommonUi
import com.example.hyoja.databinding.ActivityCafeHomeBinding

class CafeHomeActivity : AppCompatActivity() {
    var backPressedTime: Long = 0
    private lateinit var binding: ActivityCafeHomeBinding
    val common = CommonUi()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCafeHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val view = this

        binding.forHere.setOnClickListener{
            common.goToCafeHome1(view)
            CafeModel.pickOrMarket = true
        }
        binding.toGo.setOnClickListener{
            common.goToCafeHome1coffee(view)
            CafeModel.pickOrMarket = false
        }

}
}