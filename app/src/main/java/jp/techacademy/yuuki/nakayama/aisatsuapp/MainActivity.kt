package jp.techacademy.yuuki.nakayama.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("KADAI", "$hour:$minute")
                if (9 >= hour && hour >= 2) {
                    textView.text = "おはよう"
                } else if (17 >= hour && hour >= 10) {
                    textView.text = "こんにちは"
                } else {
                    textView.text = "こんばんは"
                }
            },
            13, 0, true)

        timePickerDialog.show()
    }
}
