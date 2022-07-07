package ru.novikova.handlinglinksapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CountParticipantsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_participants)

        val data = intent?.data
        if (data != null) {
            val count = data.lastPathSegment
            findViewById<TextView>(R.id.countParticipants).text = String.format(
                getString(R.string.count),
                count
            )
        }
    }

}