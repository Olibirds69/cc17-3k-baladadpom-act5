package com.example.artspace
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.artspace.adapter.ArtSpaceAdapter
import com.example.artspace.model.ArtSpace


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rvArtSpace: RecyclerView = findViewById(R.id.rvArtSpace)
        rvArtSpace.layoutManager = LinearLayoutManager(this)
        val btnBack: Button = findViewById(R.id.back)
        val btnNext: Button = findViewById(R.id.next)


        val artSpace1 = ArtSpace(R.drawable.img1, "Last pic before Graduation", "Author: Trio tatlong Bobo (2022)", {})
        val artSpace2 = ArtSpace(R.drawable.img2, "Ate's Graduation Picture", "Author: Oliva Baladad (2023)", {})
        val artSpace3 = ArtSpace(R.drawable.img3, "Birthday Date", "Author: Philip Baladad (2024)", {})
        val artSpace4 = ArtSpace(R.drawable.img4, "Family Outing", "Author: Baladad Family (2023)", {})
        val artSpace5 = ArtSpace(R.drawable.img5, "UNWIND", "Author: Baladad #10 (2023)", {})

        val arrList = listOf(artSpace1, artSpace2, artSpace3, artSpace4, artSpace5)

        val artSpaceAdapter = ArtSpaceAdapter(arrList)
        rvArtSpace.adapter = artSpaceAdapter

        var currentPosition = 0

        rvArtSpace.scrollToPosition(currentPosition)

        btnBack.setOnClickListener {
            if (currentPosition > 0){
                currentPosition--
                rvArtSpace.scrollToPosition(currentPosition)
            }
        }

        btnNext.setOnClickListener {
            if (currentPosition < arrList.size - 1){
                currentPosition++
                rvArtSpace.scrollToPosition(currentPosition)
            }
        }
    }

}