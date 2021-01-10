package com.h6ah4i.example.motionlayoutwithrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = object : RecyclerView.Adapter<VH>() {
            override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
            ): VH {
                val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
                return VH(v)
            }

            override fun onBindViewHolder(holder: VH, position: Int) {
                holder.itemView.setBackgroundColor(Color.HSVToColor(floatArrayOf((position * 20) % 360f, 1.0f, 1.0f)))
            }

            override fun getItemCount(): Int {
                return 20
            }
        }

        val motionLayout1 = findViewById<MotionLayout>(R.id.motionLayout1)
        motionLayout1.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                Log.d("XXXXXX", "onTransitionStarted")
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                Log.d("XXXXXX", "onTransitionChange")
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                Log.d("XXXXXX", "onTransitionCompleted")
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
                Log.d("XXXXXX", "onTransitionTrigger")
            }
        })


        val motionLayout2 = findViewById<MotionLayout>(R.id.motionLayout2)
        motionLayout2.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                Log.d("XXXXXX", "onTransitionStarted")
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                Log.d("XXXXXX", "onTransitionChange")
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                Log.d("XXXXXX", "onTransitionCompleted")
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
                Log.d("XXXXXX", "onTransitionTrigger")
            }
        })
    }

    class VH(v: View): RecyclerView.ViewHolder(v)
}
