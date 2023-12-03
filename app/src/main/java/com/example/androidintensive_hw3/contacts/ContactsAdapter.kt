package com.example.androidintensive_hw3.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidintensive_hw3.R
import com.example.androidintensive_hw3.contact_detail.Contact

class ContactsAdapter(private val contacts: List<Contact>) :
    RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {
    class ContactsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val contactAvatarView: AppCompatImageView
        val nameView: TextView
        val surnameView: TextView
        val phoneView: TextView

        init {
            contactAvatarView = view.findViewById(R.id.contactAvatarView)
            nameView = view.findViewById(R.id.nameView)
            surnameView = view.findViewById(R.id.surnameView)
            phoneView = view.findViewById(R.id.phoneView)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ContactsViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_contact, viewGroup, false)

        return ContactsViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ContactsViewHolder, position: Int) {

        viewHolder.nameView.text = contacts[position].firstName
        viewHolder.surnameView.text = contacts[position].lastName
        viewHolder.phoneView.text = contacts[position].phoneNumber
    }

    override fun getItemCount() = contacts.size

}