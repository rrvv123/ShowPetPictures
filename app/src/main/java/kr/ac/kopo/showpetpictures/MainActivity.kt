package kr.ac.kopo.showpetpictures

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var checkStart : CheckBox
    lateinit var LinearSub : LinearLayout
    lateinit var rg : RadioGroup
    lateinit var radioBull : RadioButton
    lateinit var radioCro : RadioButton
    lateinit var radioEgle : RadioButton
    lateinit var btnDone : Button
    lateinit var imgV : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkStart = findViewById<CheckBox>(R.id.checkbox)
        LinearSub = findViewById<LinearLayout>(R.id.LinearSub)
        rg = findViewById<RadioGroup>(R.id.rg)
        btnDone = findViewById<Button>(R.id.btnDone)
        imgV = findViewById<ImageView>(R.id.imgV)

        LinearSub.visibility = View.INVISIBLE

        checkStart.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                LinearSub.visibility = View.VISIBLE
            }
            else{
                LinearSub.visibility = View.INVISIBLE
            }
        }

        btnDone.setOnClickListener{
            when (rg.checkedRadioButtonId){
                R.id.radioBull -> imgV.setImageResource(R.drawable.bull)
                R.id.radioCro -> imgV.setImageResource(R.drawable.cro)
                R.id.radioEgle -> imgV.setImageResource(R.drawable.egle)
            }
        }
    }
}