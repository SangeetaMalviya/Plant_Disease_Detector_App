# Plant Disease Detector

An Android application that uses machine learning to detect plant diseases from leaf images in real-time.

## Features

- 📸 Real-time camera preview
- 🤖 ML-powered plant disease detection
- 📊 Confidence score display
- 🎯 Easy-to-use interface
- 📱 Works on Android 7.0 (API 24) and above

## Technical Stack

- **Language**: Kotlin
- **ML Framework**: TensorFlow Lite
- **Camera**: CameraX
- **UI Components**: Material Design
- **Architecture**: MVVM
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 35

# Plant Disease Detector

An Android application that uses machine learning to detect plant diseases from leaf images in real-time.

## Features

- 📸 Real-time camera preview
- 🤖 ML-powered plant disease detection
- 📊 Confidence score display
- 🎯 Easy-to-use interface
- 📱 Works on Android 7.0 (API 24) and above

## Technical Stack

- **Language**: Kotlin
- **ML Framework**: TensorFlow Lite
- **Camera**: CameraX
- **UI Components**: Material Design
- **Architecture**: MVVM
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 35

## Prerequisites

- Android Studio Arctic Fox or newer
- Android SDK 35
- Android device with camera (for testing)
- Gradle 8.0 or newer

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/PlantDiseaseDetector.git
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned directory and open it

3. **Add ML Model**
   - Download the plant disease classification model
   - Place the `plant_disease_model.tflite` file in `app/src/main/ml/`
   - The model should be compatible with TensorFlow Lite

4. **Build and Run**
   - Connect your Android device
   - Click "Run" in Android Studio
   - Grant camera permissions when prompted

## Dependencies

```gradle
// CameraX
implementation "androidx.camera:camera-core:1.3.1"
implementation "androidx.camera:camera-camera2:1.3.1"
implementation "androidx.camera:camera-lifecycle:1.3.1"
implementation "androidx.camera:camera-view:1.3.1"

// TensorFlow Lite
implementation "org.tensorflow:tensorflow-lite-support:0.4.4"
implementation "org.tensorflow:tensorflow-lite-metadata:0.4.4"
implementation "org.tensorflow:tensorflow-lite-gpu:2.13.0"
implementation "org.tensorflow:tensorflow-lite-task-vision:0.4.4"
```

## Usage

1. Launch the app
2. Grant camera permissions if prompted
3. Point the camera at a plant leaf
4. Tap the "Capture" button
5. View the detected disease and confidence score


app/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/plantdiseasedetector/
│ │ │ ├── MainActivity.kt
│ │ │ ├── PlantDiseaseClassifier.kt
│ │ │ └── ImageUtils.kt
│ │ ├── ml/
│ │ │ └── plant_disease_model.tflite
│ │ └── res/
│ │ └── layout/
│ │ └── activity_main.xml
│ └── test/
└── build.gradle.kts

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- TensorFlow Lite for providing the ML framework
- CameraX for camera functionality
- Android Jetpack for modern Android development components


