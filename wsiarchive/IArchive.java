package wsiarchive;

// Archive für Items
public interface IArchive {
    // Name des Archivs liefern
    public String getName();

    // Item ins Archiv schreiben
    public IPutResult put(Item item);
    
    // Mehrere Items ins Archiv schreiben
    public IPutResultList putMultiple(IItemList items);
    
    // Item aus Archiv auslesen
    public IGetResult get(IItemId id);
}
