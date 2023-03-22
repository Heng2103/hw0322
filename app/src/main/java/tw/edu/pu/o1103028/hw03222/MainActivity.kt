package tw.edu.pu.o1103028.hw03222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv = findViewById(R.id.txv)
        txv.setOnClickListener({
           if (txv.text == "许梓恒!"){
               txv.text ="海清班，哈哈哈"
           }else{
               txv.text="许梓恒!"
           }
        })
    }
}