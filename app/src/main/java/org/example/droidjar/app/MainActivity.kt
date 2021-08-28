package org.example.droidjar.app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.example.droidjar.lib.DroidJarLib

class MainActivity : AppCompatActivity() {

    private val lib = DroidJarLib()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_count_unique)
        val editText = findViewById<EditText>(R.id.edit_input_string)
        val textOutput = findViewById<TextView>(R.id.text_output_info)

        button.setOnClickListener {
            val string = editText.text.toString()
            val count = lib.countUniqueCharacters(string)
            textOutput.text = getString(R.string.output_text, string, count)
        }
    }
}
