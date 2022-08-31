package net.virtmarket.recycleintab.adapters

//import android.support.v4.app.Fragment
import net.virtmarket.recycleintab.models.PuppyListType
import net.virtmarket.recycleintab.fragments.PuppyListFragment
//import android.support.v4.app.FragmentPagerAdapter
import android.content.Context
//import android.support.v4.app.FragmentManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import net.virtmarket.recycleintab.fragments.FriendListFragment


/**
 * Created by  Oleksandr.
 */

class PageAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm)  {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return PuppyListFragment.newInstance(PuppyListType.All, context)
            1 -> return FriendListFragment.newInstance(context)
           // 1 -> return PuppyListFragment.newInstance(PuppyListType.Big, context)
           // 2 -> return PuppyListFragment.newInstance(PuppyListType.Small, context)
           // 3 -> return PuppyListFragment.newInstance(PuppyListType.LeashTrained, context)
           // 4 -> return PuppyListFragment.newInstance(PuppyListType.Active, context)
        }
        return PuppyListFragment.newInstance(PuppyListType.All, context)
    }

    override fun getCount(): Int {
        // Show 5 total pages.
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        // return empty to show no title. Delete this line to show tab titles
        return null
        /* switch (position) {
            case 0:
                return "All";
            case 1:
                return "Big";
            case 2:
                return "Small";
            case 3:
                return "Trained";
            case 4:
                return "Active";
        }
        return null;*/
    }

}