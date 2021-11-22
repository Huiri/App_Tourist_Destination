package com.example.tourist_destination

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tourist_destination.adapter.Adapter
import com.example.tourist_destination.datamodel.Data

class TourActivity : AppCompatActivity() {
    private var adapter: Adapter? = null
    private var recyclerView: RecyclerView? = null
    var tour_list: MutableList<Data>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour)
        recyclerView = findViewById(R.id.recycler_view)
        adapter = Adapter(this, tour_list)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.adapter = adapter

        val button: Button = findViewById(R.id.close_btn)
        button.setOnClickListener {
            finish()
        }
        recyclerView!!.addItemDecoration(VerticalItemDecorator(25))
        recyclerView!!.addItemDecoration(HorizontalItemDecorator(30))
//        recyclerView = findViewById(R.id.recycler_view)
//        adapter = Adapter(this, tour_data)
//        recyclerView?.layoutManager = GridLayoutManager(this, 2 )
//        recyclerView?.itemAnimator= DefaultItemAnimator()
//        recyclerView?.adapter = adapter
        prepareDatas()
//        tour_datas = savedInstanceState?. let{
//            it.getStringArrayList("datalist")?.toMutableList()
//        }?: let{mutableListOf<String()}

//        Adapter.setOnItemClickListener(object : Adapter.OnItemClickListener{
//            override fun onItemClick(v: View, data: Data, pos : Int) {
//                Intent(this@TourActivity, DetailActivity::class.java).apply {
//                    putExtra("data", data)
//                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//                }.run { startActivity(this) }
//            }
//
//        })
    }

    private fun prepareDatas() {
        val imgs = intArrayOf(
            R.drawable.parkguel,
            R.drawable.laboqueria,
            R.drawable.sagrada,
            R.drawable.pradomuseum,
            R.drawable.alhambra
        )
        var a = Data(
            Data.TOUR, imgs[0],
            "구엘 공원",
            "가우디의 조각 건물이 있는 공원으로 스페인 바르셀로나에 있다. 1984년 유네스코 세계유산에 등록되었다. 안토니 가우디의 작품 중 하나이다. 카르멜 언덕 위에 있으며, 공용 공원과 초등학교가 위치해 있다. 에우제비 구에이를 기리기 위해 1914년에 완성되었다."
        )
        tour_list!!.add(a)

        a = Data(
            Data.TOUR, imgs[1],
            "라 보케리아",
            "라 보케리아 또는 산호셉 시장은 스페인 바르셀로나 시우타베야에 있는 시장이다. 청과 · 정육 · 조미료 · 건어물 · 유제품 · 과자류 등 다양한 상품이 있는 시장. 람블라스 거리에서 서쪽에 시장의 입구가 있다."
        )
        tour_list!!.add(a)

        a = Data(
            Data.TOUR, imgs[2],
            "사그라다 파밀리아",
            " 로마 가톨릭 성당이다. 또한 '사그라다'는 스페인어로 성스러운이라는 뜻을 가졌으며, 파밀리아는 가족을 뜻하기 때문에 성가족성당이라고도 불린다. 카탈루냐 출신의 건축가 안토니 가우디가 설계하고 직접 건축을 책임졌다. 이 건물에 대한 가우디의 작업은 유네스코 세계 문화 유산의 일부이며, 2010년 11월 교황 베네딕토 16세는 성당에서 준 대성당으로 승격을 선포"
        )
        tour_list!!.add(a)

        a = Data(
            Data.TOUR, imgs[3],
            "프라도 미술관",
            "스페인 마드리드에 있는 세계적인 미술관 중 하나이다. 15세기 이후 스페인 왕실에서 수집한 미술 작품을 전시하고 있다. 그림과 조각을 위한 전용 박물관으로 설립되었으며 5,000개 이상의 그림과 2,000개 이상의 판화, 1,000개 이상의 주화와 메달 그리고 2천 개 이상의 장식물과 예술 작품이 전시되어 있다."
        )
        tour_list!!.add(a)

        a = Data(
            Data.TOUR, imgs[4],
            "알람브라",
            "스페인 그라나다에 있는 궁전과 성곽의 복합단지다. 1238년부터 1358년 사이에 지어졌다. 스페인 남부의 그라나다도 지역에서 머물던 아랍 군주의 저택이었던 곳으로 그라나다 시의 남동쪽 경계에 있다. 현재에는 이슬람 건축 박물관으로 쓰이고 있다. 르네상스식 건물이 카를로스 1세 때 추가되었다. 유네스코가 지정한 세계문화유산이다.")
        tour_list!!.add(a)
        
//
        adapter!!.notifyDataSetChanged()
    }
}
