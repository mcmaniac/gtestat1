package wsiarchive;



// Liste von Items
public interface IItemList {

    // alle Items in das Archiv schreiben
    public IPutResultList putAll(IArchive archive);
    
    // in myarchive-Item-Liste umwandeln
    public myarchive.IItemList toMyItemList();

    // in myarchive-Item-Liste umwandeln
    public yourarchive.IItemList toYourItemList();
}
