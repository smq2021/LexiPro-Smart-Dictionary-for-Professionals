package com.example.simpledictionary

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simpledictionary.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MeaningAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.searchBtn.setOnClickListener {
            val word = binding.searchInput.text.toString()
            getMeaning(word)


        }

        adapter = MeaningAdapter(emptyList())
        binding.meaningsRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.meaningsRecyclerView.adapter = adapter


    }

    private fun getMeaning(word: String) {
        setInProgress(true)
        GlobalScope.launch {
            try {
                val response = RetrofitInstance.dictionaryApi.getMeaning(word)
                if (response.body()==null){
                    throw(Exception())
                }
                runOnUiThread {
                    setInProgress(false)
                    response.body()?.first()?.let {
                        setUI(it)


                    }


                }

            }catch (e: Exception){
                setInProgress(false)
                Toast.makeText(applicationContext,"Something went wrong", Toast.LENGTH_SHORT).show()


            }




        }
    }

    private fun setUI(response: WordResult){
        binding.wordTextview.text = response.word
        binding.phoneticTextview.text = response.phonetic
        adapter.updateNewData(response.meanings)


    }

    private fun setInProgress(inProgress: Boolean) {
        if(inProgress){
            binding.progressBar.visibility = View.VISIBLE
            binding.searchBtn.visibility = View.INVISIBLE

        }
        else{    binding.progressBar.visibility = View.INVISIBLE
            binding.searchBtn.visibility = View.VISIBLE}




    }



}