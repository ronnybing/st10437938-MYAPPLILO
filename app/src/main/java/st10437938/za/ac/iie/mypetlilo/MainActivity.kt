package st10437938.za.ac.iie.mypetlilo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Button navigate to the second screen
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
// Pass the message "I am hungry" as an extra with the intent
            intent.putExtra("FEED_MESSAGE", "I am hungry")//This will be shown in the feedTextView
            startActivity(intent)
        }
    }
}
