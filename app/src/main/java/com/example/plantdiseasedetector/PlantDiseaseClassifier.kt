package com.example.plantdiseasedetector

import android.content.Context
import android.graphics.Bitmap
import org.tensorflow.lite.support.image.ImageProcessor
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.image.ops.ResizeOp
import org.tensorflow.lite.task.vision.classifier.ImageClassifier

class PlantDiseaseClassifier(context: Context) {
    private var classifier: ImageClassifier? = null

    init {
        setupClassifier(context)
    }

    private fun setupClassifier(context: Context) {
        val options = ImageClassifier.ImageClassifierOptions.builder()
            .setMaxResults(3)
            .build()
        try {
            classifier = ImageClassifier.createFromFileAndOptions(
                context,
                "plant_disease_model.tflite",
                options
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun classify(bitmap: Bitmap): List<Classification> {
        if (classifier == null) {
            return emptyList()
        }

        // Preprocess the image
        val imageProcessor = ImageProcessor.Builder()
            .add(ResizeOp(224, 224, ResizeOp.ResizeMethod.BILINEAR))
            .build()

        val tensorImage = imageProcessor.process(TensorImage.fromBitmap(bitmap))

        val results = classifier?.classify(tensorImage)
        
        return results?.flatMap { classifications ->
            classifications.categories.map { category ->
                Classification(
                    label = category.label,
                    score = category.score
                )
            }
        } ?: emptyList()
    }

    data class Classification(
        val label: String,
        val score: Float
    )
} 