package com.example.androidintensive_hw3.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidintensive_hw3.R
import com.example.androidintensive_hw3.contact_detail.Contact
import com.example.androidintensive_hw3.databinding.FragmentContactsBinding

class ContactsFragment : Fragment() {

    private lateinit var binding: FragmentContactsBinding
    private lateinit var contactsAdapter: ContactsAdapter

    val contactList = listOf(
        Contact("Иван", "Иванов", "+7 (123) 456-7890"),
        Contact("Мария", "Петрова", "+7 (987) 654-3210"),
        Contact("Александр", "Смирнов", "+7 (111) 222-3333"),
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentContactsBinding.inflate(inflater, container, false)
        binding.contactsToolbar.toolbar.title = getString(R.string.contacts)

        contactsAdapter = ContactsAdapter(contactList)
        binding.contactsList.adapter = contactsAdapter

        return binding.root
    }
}