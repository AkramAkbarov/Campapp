package com.akramia.campapp.homefragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akramia.campapp.adapter.CampAdapter
import com.akramia.campapp.R
import com.akramia.campapp.databinding.FragmentHomeInnerBinding
import com.akramia.campapp.modelshomedata.Camp

class HomeInnerFragment : Fragment() {
    private lateinit var GridView: RecyclerView
    private lateinit var binding: FragmentHomeInnerBinding

    private val camps = listOf(
        Camp("Quba Camp", 75, "AZN", "2-3 Noyabr", R.drawable.img_3),
        Camp("Samur Camp", 80, "AZN", "2–3 November", R.drawable.img_16) ,
        Camp("Qabala Camp", 40, "AZN", "2-3 Noyabr", R.drawable.img_18),
        Camp("İsmayilli Camp", 55, "AZN", "2–3 November", R.drawable.img_19)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeInnerBinding.inflate(inflater, container, false)
        val view = binding.root

        GridView = binding.recyclerView
        GridView.layoutManager = GridLayoutManager(context, 2)

        // Adapter oluşturulması ve RecyclerView'a atanması
        val adapter = CampAdapter(camps)
        GridView.adapter = adapter

        return view
    }
}