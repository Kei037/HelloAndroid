package com.kei037.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // xml에서 만든 버튼의 아이디값을 불러옴 (R -> resource!!)
        var btn: Button = findViewById(R.id.button)
        btn.setOnClickListener { // Toast (경고창)  LENGTH_LONG, LENGTH_SHORT -> 경고창이 떠 있는 시간
            Toast.makeText(applicationContext, "버튼 클릭!!", Toast.LENGTH_SHORT).show()
        }
    }
}