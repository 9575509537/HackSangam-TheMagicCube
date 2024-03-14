package com.example.smartparkingiot

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.smartparkingiot.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.button.setOnClickListener{readData()}
        if (isOnline()) {
            databaseListener()
        } else {
            Toast.makeText(this@MainActivity, "No internet connection", Toast.LENGTH_SHORT).show()
        }

    }
    //----------------------------------------------------------------------------------------------
    private fun isOnline(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

    //----------------------------------------------------------------------------------------------
    private fun databaseListener(){
        database = FirebaseDatabase.getInstance().getReference()
        val postListener1 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 1").value
                if (status == "Available") {
                    binding.textViewSlot01.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot01.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot01.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot01.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener1)

        val postListener2 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 2").value
                if (status == "Available") {
                    binding.textViewSlot02.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot02.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot02.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot02.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener2)
        val postListener3 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 3").value
                if (status == "Available") {
                    binding.textViewSlot03.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot03.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot03.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot03.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener3)
        val postListener4 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 4").value
                if (status == "Available") {
                    binding.textViewSlot04.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot04.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot04.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot04.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener4)
        val postListener5 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 5").value
                if (status == "Available") {
                    binding.textViewSlot05.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot05.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot05.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot05.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener5)
        val postListener6 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 6").value
                if (status == "Available") {
                    binding.textViewSlot06.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot06.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot06.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot06.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener6)
        val postListener7 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 7").value
                if (status == "Available") {
                    binding.textViewSlot07.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot07.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot07.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot07.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener7)
        val postListener8 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 8").value
                if (status == "Available") {
                    binding.textViewSlot08.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot08.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot08.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot08.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener8)
        val postListener9 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 9").value
                if (status == "Available") {
                    binding.textViewSlot09.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot09.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot09.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot09.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener9)
        val postListener10 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Slot 10").value
                if (status == "Available") {
                    binding.textViewSlot10.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot10.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewSlot10.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewSlot10.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener10)
        val postListener11 = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val status = snapshot.child("Sensors/Total_Slots").value
                if (status == "Available") {
                    binding.textViewTotalSlots.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewTotalSlots.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Engaged))
                } else {
                    binding.textViewTotalSlots.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                }
                binding.textViewTotalSlots.setText(status.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
            }
        }
        database.addValueEventListener(postListener11)
    }
//------------------------------------------------------------------------------------------------------------------------------------------
    private fun readData(){
        database = FirebaseDatabase.getInstance().getReference("Sensors")
        database.child("Slot 1").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot01.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot01.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot01.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot01.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }

        database.child("Slot 2").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot02.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot02.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot02.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot02.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }
        database.child("Slot 3").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot03.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot03.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot03.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot03.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }
        database.child("Slot 4").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot04.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot04.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot04.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot04.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }
        database.child("Slot 5").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot05.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot05.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot05.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot05.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }
        database.child("Slot 6").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot06.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot06.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot06.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot06.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }
        database.child("Slot 7").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot07.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot07.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot07.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot07.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }
        database.child("Slot 8").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot08.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot08.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot08.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot08.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }
        database.child("Slot 9").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot09.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot09.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot09.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot09.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }
        database.child("Slot 10").get().addOnSuccessListener {
            if(it.exists()){
                val status: String = it.value.toString()
//                Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
                if (status == "Available") {
                    binding.textViewSlot10.setTextColor(ContextCompat.getColor(this, R.color.Available))
                } else if (status == "Engaged") {
                    binding.textViewSlot10.setTextColor(ContextCompat.getColor(this, R.color.Engaged))
                } else {
                    binding.textViewSlot10.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
                binding.textViewSlot10.setText(status)
            }else{
//                Toast.makeText(this,"Update Unsuccessful",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
//            Toast.makeText(this,"Failed to Fetch Database",Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this,"Updated Successully",Toast.LENGTH_SHORT).show()
    }
}