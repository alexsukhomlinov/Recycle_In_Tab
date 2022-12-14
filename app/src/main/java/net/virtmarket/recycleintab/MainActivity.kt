package net.virtmarket.recycleintab

//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.support.design.widget.TabLayout
//import android.support.v4.view.ViewPager
//import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import net.virtmarket.recycleintab.adapters.PageAdapter



class MainActivity : AppCompatActivity() {
    private var mSectionsPagerAdapter: PageAdapter? = null

    /**
     * The [ViewPager] that will host the section contents.
     */
    private var mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     //   val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
     //   setSupportActionBar(toolbar)
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = PageAdapter(supportFragmentManager, this)

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById<ViewPager?>(R.id.container)
        mViewPager!!.adapter = mSectionsPagerAdapter

        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(mViewPager)

        // set icons
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_launcher_foreground)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_launcher_background)

        tabLayout.getTabAt(0)!!.setText("Users")

        tabLayout.getTabAt(1)!!.setText("Friends")

        //tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_launcher_background)
        //tabLayout.getTabAt(3)!!.setIcon(R.drawable.ic_launcher_foreground)
        //tabLayout.getTabAt(4)!!.setIcon(R.drawable.ic_launcher_background)

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    public fun onClicTaast(){
        println("Toast1234567")
    }
}