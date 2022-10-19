package kr.ac.kumoh.s20170991.w0701implicitment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20170991.w0701implicitment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHomepage.setOnClickListener {
            val uri = Uri.parse("http://www.naver.com")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }

}