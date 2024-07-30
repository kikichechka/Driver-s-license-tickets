package com.example.drivers_license_tickets

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.FrameLayout
import com.example.drivers_license_tickets.databinding.CustomCardItemCategoryBinding

class CustomCardItemCategory(context: Context, attributeSet: AttributeSet? = null) :
    FrameLayout(context, attributeSet) {
    private val binding: CustomCardItemCategoryBinding

    init {
        val inflatedView = inflate(context, R.layout.custom_card_item_category, this)
        binding = CustomCardItemCategoryBinding.bind(inflatedView)
    }

    fun setIcon(icon: Drawable) {
        binding.icon.setImageDrawable(icon)
    }

    fun setTitle(title: String) {
        binding.titleCategory.text = title
    }
}
