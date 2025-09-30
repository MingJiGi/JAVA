package gemini_DigitalAssetVlault;

public class DocumentFile extends DigitalAsset{
    int pageCount;




    @Override
    String getAssetInfo() {
        return this.name + " " + this.pageCount;
    }
}
