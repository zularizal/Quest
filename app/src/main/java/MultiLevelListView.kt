package com.sandbox.calvin_li.quest.MultiLevelListView
import android.content.Context
import android.util.AttributeSet
import android.widget.ExpandableListView

class MultiLevelListView(context: Context, attributes: AttributeSet) :
        ExpandableListView(context, attributes) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(
                MeasureSpec.makeMeasureSpec(widthMeasureSpec, MeasureSpec.EXACTLY),
                MeasureSpec.makeMeasureSpec(heightMeasureSpec, MeasureSpec.AT_MOST))
    }

}