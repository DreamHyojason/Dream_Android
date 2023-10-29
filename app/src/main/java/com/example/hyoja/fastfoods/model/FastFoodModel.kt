package com.example.hyoja.fastfoods.model

import com.example.hyoja.cafe.model.OrderingDrink

object FastFoodModel {
    var menuCategory: String = "newMenu" //카테고리 데이터
    lateinit var foodSelected: FoodDataInterface // 고른 음료
    var foodSelectedList= ArrayList<OrderingDrink>()//고른 음료 리스트
    var priceToPay:Int = 0
}