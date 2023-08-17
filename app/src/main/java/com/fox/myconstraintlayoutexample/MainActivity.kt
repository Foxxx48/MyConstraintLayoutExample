package com.fox.myconstraintlayoutexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fox.myconstraintlayoutexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnLike.setOnClickListener {
//
//             fun alertDialog(): Dialog {
//
//                val builder = AlertDialog.Builder(this)
//                builder.setTitle("Alert Dialog")
//                builder.setMessage("Hello! I am Alert Dialog")
//                builder.setPositiveButton("Cool", object: DialogInterface.OnClickListener {
//                    override fun onClick(dialog:DialogInterface, which:Int) {
//
//                        onBackPressed()
//                    }
//                })
//                builder.setNegativeButton("Cancel", object: DialogInterface.OnClickListener {
//                    override fun onClick(dialog:DialogInterface, which:Int) {
//                        onBackPressed()
//                    }
//                })
//                return builder.show()
//            }
//        }

        binding.btnLike.setOnClickListener {

//            val builder = AlertDialog.Builder(this)
//                builder.setTitle("Alert Dialog")
//                builder.setMessage("Hello! I am Alert Dialog")
//                builder.setPositiveButton("Cool", object: DialogInterface.OnClickListener {
//                    override fun onClick(dialog:DialogInterface, which:Int) {
//                        println("Positive button")
//
//                    }
//                })
//                builder.setNegativeButton("Cancel"){ _,_ ->
//
//                    println("Negative button")
//                }
//                builder.show()

        }
        binding.btnWatch.setOnClickListener {
            SimpleDialog.newInstance(getString(R.string.label_logout), getString(R.string.msg_logout)).show(supportFragmentManager, SimpleDialog.TAG)
        }


        }



}