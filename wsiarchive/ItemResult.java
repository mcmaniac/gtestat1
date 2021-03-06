package wsiarchive;



// Resultat, das nur ein Item liefert, bei gleichem Schlüssel
public class ItemResult implements IGetResult {

    private Item item;
    
    public ItemResult(Item item) {
        this.item = item;
    }

    // Item extrahieren
    public Item getItem() {
        return this.item;
    }
}
