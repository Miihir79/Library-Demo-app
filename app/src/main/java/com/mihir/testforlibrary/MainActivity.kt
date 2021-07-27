package com.mihir.testforlibrary

import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mihir.drawingcanvas.drawingView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_undo.setOnClickListener {
            drawing_view.undo()
        }

        btn_redo.setOnClickListener {
            drawing_view.redo()
        }

        btn_color.setOnClickListener {
            drawing_view.setBrushColor(R.color.teal_200)
        }

        btn_brush.setOnClickListener {
            drawing_view.setSizeForBrush(25)//0-35
            drawing_view.setBrushAlpha(100) //0-255
        }
        btn_clearscreen.setOnClickListener {
            drawing_view.clearDrawingBoard()
        }
        val alpha = drawing_view.getBrushAlpha()
        drawing_view.erase()
        val brushSize = drawing_view.getBrushSize()
        val brushColor = drawing_view.getBrushColor()

        val drawing = drawing_view.getDrawing()
    }
}