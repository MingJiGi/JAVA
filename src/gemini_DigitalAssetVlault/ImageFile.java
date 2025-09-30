package gemini_DigitalAssetVlault;

public class ImageFile extends DigitalAsset{
    int pixelSize;




    @Override
    String getAssetInfo() {
        return this.name + " " + this.pixelSize;
    }
}
