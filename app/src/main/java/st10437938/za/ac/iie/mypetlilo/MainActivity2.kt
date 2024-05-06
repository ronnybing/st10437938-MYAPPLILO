package st10437938.za.ac.iie.mypetlilo

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import st10437938.za.ac.iie.mypetlilo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val petImageView = findViewById<ImageView>(R.id.imageView5)
        val feedButton = findViewById<Button>(R.id.feedbutton)
        val cleanButton = findViewById<Button>(R.id.cleanbutton)
        val playButton = findViewById<Button>(R.id.playbutton)

        val feedTextView = findViewById<TextView>(R.id.textViewfeed)
        val cleanTextView = findViewById<TextView>(R.id.textViewclean)
        val playTextView = findViewById<TextView>(R.id.textViewplay)

        // Retrieve the message passed from the first screen
        val feedMessage = intent.getStringExtra("FEED_MESSAGE")
        // Set the text of the feed TextView to the feed message
        feedTextView.text = feedMessage


        // Logic for the Feed button
        feedButton.setOnClickListener {
            // Change the pet's image to match feeding action icon
            petImageView.setImageResource(R.drawable.petfeed)//replace text in bold with   your picture name


            feedTextView.text = getString(R.string.feed)


            playTextView.text = getString(R.string.play)

        }


        cleanButton.setOnClickListener {
            // Change the pet's image to match cleaning action icon
            petImageView.setImageResource(R.drawable.petclean)
            cleanTextView.text = getString(R.string.clean)

        }

        // Logic for the Play button
        playButton.setOnClickListener {
            // Change the pet's image to match playing action icon
            petImageView.setImageResource(R.drawable.petplay)//your picture name here


            playTextView.text = getString(R.string.play)
            // Update the clean textview
            cleanTextView.text = getString(R.string.clean)

        }
    }
}
