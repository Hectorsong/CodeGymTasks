package zh.codegym.task.task16.task1631;

import zh.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory{
    public static ImageReader getImageReader(ImageTypes imageTypes){
        if (imageTypes == null) throw new IllegalArgumentException("Unknown image type");
        if (imageTypes == ImageTypes.BMP){
            return new BmpReader();
        }else if (imageTypes.equals(ImageTypes.JPG)){
            return new JpgReader();
        }else if (imageTypes.equals(ImageTypes.PNG)){
            return new PngReader();
        }else throw new IllegalArgumentException();

    }
}
