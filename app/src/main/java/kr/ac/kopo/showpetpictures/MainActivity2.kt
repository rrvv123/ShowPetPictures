package kr.ac.kopo.showpetpictures

import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    lateinit var checkStarts : Switch
    lateinit var LinearSub : LinearLayout
    lateinit var rg : RadioGroup
    lateinit var radioBull : RadioButton
    lateinit var radioCro : RadioButton
    lateinit var radioEgle : RadioButton
    lateinit var btnExit : Button
    lateinit var btnFirst : Button
    lateinit var imgV : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        checkStarts = findViewById<Switch>(R.id.checkStarts)
        LinearSub = findViewById<LinearLayout>(R.id.LinearSub)
        rg = findViewById<RadioGroup>(R.id.rg)
        btnExit = findViewById<Button>(R.id.btnExit)
        btnFirst = findViewById<Button>(R.id.btnFirst)

        btnExit.setOnClickListener(btnListener)
        btnFirst.setOnClickListener(btnListener)

        imgV = findViewById<ImageView>(R.id.imgV)

        LinearSub.visibility = View.INVISIBLE

        checkStarts.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                LinearSub.visibility = View.VISIBLE
            }
            else{
                LinearSub.visibility = View.INVISIBLE
            }
        }

        rg.setOnCheckedChangeListener{ buttononView, isChecked ->
            when (rg.checkedRadioButtonId){
                R.id.radioBull -> imgV.setImageResource(R.drawable.bull)
                R.id.radioCro -> imgV.setImageResource(R.drawable.cro)
                R.id.radioEgle -> imgV.setImageResource(R.drawable.egle)
            }
        }
    }

    val btnListener = OnClickListener{
        when(it.id){
            R.id.btnExit -> finish()
            R.id.btnFirst -> {
                checkStarts.isChecked = false
                LinearSub.visibility = INVISIBLE
            }
        }
    }
}