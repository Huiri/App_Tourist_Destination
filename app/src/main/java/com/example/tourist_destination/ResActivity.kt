package com.example.tourist_destination

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tourist_destination.adapter.Adapter
import com.example.tourist_destination.datamodel.Data

class ResActivity : AppCompatActivity(){

    private var adapter: Adapter? = null
    private var grid_recycler_view: RecyclerView? = null
    var res_list: MutableList<Data>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)
        grid_recycler_view = findViewById(R.id.grid_recycler_view)
        grid_recycler_view?.layoutManager = GridLayoutManager(this ,2)
        grid_recycler_view?.itemAnimator = DefaultItemAnimator()
        adapter = Adapter(this, res_list)
        grid_recycler_view?.adapter = adapter

        grid_recycler_view?.addItemDecoration(VerticalItemDecorator(20))
        grid_recycler_view?.addItemDecoration(HorizontalItemDecorator(30))

        val button: Button = findViewById(R.id.close_btn)
        button.setOnClickListener {
            finish()
        }

        prepareDatas()
    }

    private fun prepareDatas() {
        val imgs = intArrayOf(
            R.drawable.pizzartfuencarral,
            R.drawable.restaurantemikuna,
            R.drawable.elcocodrilo,
            R.drawable.cebo,
            R.drawable.bennu
        )
        var a = Data(Data.RES, imgs[0],
            "Pizzart Fuencarral",
            "가격대 : ₩12,213 - ₩24,427\n\n요리 :\n이탈리아 요리, 피자, 로마나, 라치오, 중부 이탈리아, 남부 이탈리아, 지중해 요리, 나폴리, 캄파니아, 시칠리아\n\n특별식 제공 :\n채식주의 식단, 채식 옵션"
        )
        res_list!!.add(a)

        a = Data(Data.RES, imgs[1],
            "Restaurante MIKUNA",
            "가격대 : ₩13,570 - ₩40,711\n" +
                    "\n요리 :\n페루, 라틴, 퓨전, 중앙아시아\n\n특별식 제공 :\n채식주의 식단"
        )
        res_list!!.add(a)

        a = Data(Data.RES, imgs[2],
            "El Cocodrilo",
            "요리 : 바, 스페인 요리\n" +
                    "\n특별식 제공 : 채식주의 식단\n" +
                    "\n식사 시간 :\n점심식사, 저녁식사, 브런치, 음료"
        )
        res_list!!.add(a)

        a = Data(Data.RES, imgs[3],
            "Cebo",
            "가격대 : ₩12,213 - ₩24,427\n" +
                    "\n 요리 :\n이탈리아 요리, 피자, 로마나, 라치오, 중부 이탈리아, 남부 이탈리아, 지중해 요리, 나폴리, 캄파니아, 시칠리아\n" +
                    "\n특별식 제공 :\n채식주의 식단, 채식 옵션"
        )
        res_list!!.add(a)

        a = Data(Data.RES, imgs[4],
            "Bennu",
            "요리 :\n라틴, 지중해 요리, 스페인 요리, 아시아 요리, 퓨전\n" +
                    "\n식사 시간 :\n점심식사, 저녁식사\n" +
                    "\n특징 : 예약"
        )
        res_list!!.add(a)

        adapter!!.notifyDataSetChanged()
    }
}