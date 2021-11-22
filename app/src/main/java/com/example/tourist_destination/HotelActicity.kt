package com.example.tourist_destination

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tourist_destination.adapter.Adapter
import com.example.tourist_destination.datamodel.Data

class HotelActicity : AppCompatActivity() {
    private var adapter: Adapter? = null
    private var recyclerView: RecyclerView? = null
    var hotel_list: MutableList<Data>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)
        recyclerView = findViewById(R.id.simple_recycler_view)
        adapter = Adapter(this, hotel_list)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.adapter = adapter

        val button: Button = findViewById(R.id.close_btn)
        button.setOnClickListener {
            finish()
        }
        recyclerView!!.addItemDecoration(VerticalItemDecorator(25))
        recyclerView!!.addItemDecoration(HorizontalItemDecorator(30))
        prepareDatas()

    }

    private fun prepareDatas() {
        val imgs = intArrayOf(
            R.drawable.hotelvanillagarden,
            R.drawable.alhambrapalacehotel,
            R.drawable.hotelmarina,
            R.drawable.wbarcelona
        )
        var a = Data(
            Data.HOTEL, imgs[0],
            "바닐라 가든 호텔",
            "4성급 호텔\n조식 포함\n무료 Wi-Fi\n실외 수영장\n온수 욕조\n에어컨"
        )
        hotel_list!!.add(a)

        a = Data(
            Data.HOTEL, imgs[1],
            "알함브라 궁전 호텔",
           "5성급 호텔\n조식\n무료 Wi-Fi\n주차 가능\n애완동물 허용\n에어컨"
        )
        hotel_list!!.add(a)

        a = Data(
            Data.HOTEL, imgs[2],
            "마리나 호텔",
            "4성급 호텔\n조식\n무료 Wi-Fi\n주차\n실외 수영장\n에어컨"
        )
        hotel_list!!.add(a)

        a = Data(
            Data.HOTEL, imgs[3],
            "W 바르셀로나",
            "5성급 호텔\n조식\n무료 Wi-Fi\n주차\n수영장\n온수 욕조"
        )
        hotel_list!!.add(a)

        adapter!!.notifyDataSetChanged()
    }
}