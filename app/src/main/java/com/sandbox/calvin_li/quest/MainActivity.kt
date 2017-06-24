package com.sandbox.calvin_li.quest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import com.sandbox.calvin_li.quest.ExpandableListAdapter.ExpandableListAdapter
import com.sandbox.calvin_li.quest.MultiLevelListView.MultiLevelListView
import java.io.FileInputStream

class MainActivity : AppCompatActivity() {
    lateinit var listAdapter: ExpandableListAdapter
    lateinit var expandListView: MultiLevelListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expandListView = findViewById(R.id.top_view) as MultiLevelListView
        listAdapter = ExpandableListAdapter(this, prepareListData())
        expandListView.setAdapter(listAdapter)
    }

    private fun prepareListData(): JsonObject {
        val questFileName = "quests.json"
        val questStream: FileInputStream = openFileInput(questFileName)
        val quests: JsonObject = Parser().parse(questStream) as JsonObject
        return quests
    }

}
