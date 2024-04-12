package com.akramia.campapp
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akramia.campapp.databinding.FragmentHomeInnerBinding

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