package com.example.pc.compoundviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_compound.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOk.setOnClickListener(this::Clicked)

    }

    private fun Clicked(view: View) {
        val vm: View = layoutInflater.inflate(R.layout.layout_compound, null, false)
        vm.findViewById<ImageView>(R.id.imgVw).setOnClickListener {
            (it as ImageView).setImageResource(R.mipmap.ic_launcher_round)
        }

        vm.findViewById<TextView>(R.id.txtVw).setOnClickListener {
            (
                    it as TextView).textSize = 40f
        }
        layoutRoot.addView(vm)
    }
}
    /**private fun Clicked(view:View){
    val vm: View = layoutInflater.inflate(R.layout.layout_compound, null, false)
    vm.findViewById<ImageView>(R.id.imgVw1).setOnClickListener
    {
        (it as ImageView).setImageResource(R.mipmap.ic_launcher)
    }

    vm.findViewById<TextView>(R.id.txtVw1).setOnClickListener
    {
        (it as TextView).textSize = 50f
    }
    vm.findViewById<ImageView>(R.id.imgVw2).setOnClickListener
    {
        (it as ImageView).setImageResource(R.mipmap.ic_launcher)
    }
    vm.findViewById<TextView>(R.id.txtVw2).setOnClickListener
    {
        (it as TextView).textSize = 50f
    }

}
*/

