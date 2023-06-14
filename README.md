# tess4j-test-java

### Project created to test ocr recognition with Tess4J

### References
1. [Tess4J](https://tess4j.sourceforge.net/)
2. [Tesseract](https://github.com/tesseract-ocr/tesseract)
3. [Trained Data](https://github.com/tesseract-ocr/tessdata)

### Setup

Create two folders: src/main/resources/tessdata and src/main/resources/test-files/
1. src/main/resources/tessdata: will contain the trained models for wich language your test files will be (more on [Trained Data](https://github.com/tesseract-ocr/tessdata))
2. src/main/resources/test-files: Is where you will place the test files

To run a test just run TestTess4J class changing the file and language parameters.