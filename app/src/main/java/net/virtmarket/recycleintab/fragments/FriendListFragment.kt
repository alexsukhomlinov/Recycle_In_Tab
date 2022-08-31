package net.virtmarket.recycleintab.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import net.virtmarket.recycleintab.R
import net.virtmarket.recycleintab.adapters.FriendAdapter
import net.virtmarket.recycleintab.models.Friend
import net.virtmarket.recycleintab.models.FriendFactory


class FriendListFragment(passedContext: Context) : Fragment() {

    val friendFactory : FriendFactory = FriendFactory(passedContext)
    //val ARG_LIST_TYPE = "LIST_TYPE"
    val passThroughContext : Context = passedContext

    //fun onItemClickFun() {onItemClick}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.puppyRecyclerView) as RecyclerView
        //val listType = this.arguments?.getSerializable(ARG_LIST_TYPE) as PuppyListType
        var friends: ArrayList<Friend>
        friends = friendFactory.friends

        //when (listType) {
            //PuppyListType.All -> puppies = puppyFactory.puppies
            //PuppyListType.Big -> puppies = puppyFactory.bigPuppies
            //PuppyListType.Small -> puppies = puppyFactory.smallPuppies
            //PuppyListType.LeashTrained -> puppies = puppyFactory.leashTrainedPuppies
            //PuppyListType.Active -> puppies = puppyFactory.activePuppies
        //}



        //friendAdapter=FriendAdapter(friends)
        recyclerView.adapter = FriendAdapter(friends)
        recyclerView.layoutManager = LinearLayoutManager(passThroughContext)
        return rootView
    }

    companion object {


        fun newInstance(context: Context): FriendListFragment {
            val fragment = FriendListFragment(context)
            val args = Bundle()
            //args.putSerializable(ARG_LIST_TYPE, listType)
            fragment.arguments = args
            return fragment
        }
    }
}