# LexiPro: Smart Dictionary for Professionals

## Overview

**LexiPro** is an Android dictionary application designed specifically for business professionals and learners. The app provides comprehensive definitions, usage examples, and grammatical forms of words, ensuring that users can quickly find the right word to enhance their communication and learning effectiveness. 

This project showcases my skills in Android development, user interface design, and integration of external APIs for real-time data retrieval.

## Features

- **User-Friendly Interface**: Intuitive design that allows users to search for words effortlessly.
- **Comprehensive Definitions**: Access to detailed definitions sourced from a reliable dictionary API.
- **Usage Examples**: Real-world examples to help users understand the context of words.
- **Grammatical Forms**: Information on different grammatical forms of words, including synonyms and antonyms.
- **Search Functionality**: Quick search feature to find words instantly.
- **Progress Indicator**: Visual feedback during data retrieval to enhance user experience.

## Technologies Used

- **Programming Language**: Kotlin
- **Framework**: Android SDK
- **Architecture**: MVVM (Model-View-ViewModel)
- **Networking**: Retrofit for API calls
- **UI Components**: RecyclerView for displaying word meanings, ViewBinding for layout management
- **Dependency Management**: Gradle

## Installation

To run the LexiPro app on your local machine, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/smq2021/LexiPro-Smart-Dictionary-for-Professionals.git
   ```

2. **Open the Project**:
   Open the project in Android Studio.

3. **Sync Gradle**:
   Ensure that all dependencies are downloaded by syncing Gradle.

4. **Run the Application**:
   Connect an Android device or start an emulator, then run the application from Android Studio.

## Usage

1. **Search for a Word**: Enter a word in the search bar and press the "Search" button.
2. **View Results**: The app will display the definition, usage examples, and grammatical forms of the searched word.
3. **Explore Synonyms and Antonyms**: If available, synonyms and antonyms will be displayed to enhance vocabulary.

## API Integration

LexiPro utilizes the [Dictionary API](https://api.dictionaryapi.dev/) to fetch word definitions and related information. The API provides a simple and effective way to access a wide range of dictionary data.

## Code Structure

The project is organized into the following key components:

- **MainActivity.kt**: The main entry point of the application, handling user interactions and displaying results.
- **RetrofitInstance.kt**: Manages the Retrofit instance for API calls.
- **DictonaryApi.kt**: Defines the API endpoints for fetching word data.
- **WordResult.kt**: Data classes representing the structure of the API response.
- **MeaningAdapter.kt**: Adapter for displaying word meanings in a RecyclerView.



## License

This project is licensed under the GNU General Public License v3.0. See the [LICENSE](LICENSE) file for more details.


