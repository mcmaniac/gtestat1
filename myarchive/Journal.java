package myarchive;

import wsiarchive.*;

// Journal für Dateidaten
public class Journal {

    private IItemId id; // ID des Items
    private IArchiveList archives; // Archiv auf dem Item gespeichert wurde
    
    Journal (IItemId id, IArchiveList archives) {
        this.id = id;
        this.archives = archives;
    }
    
    // Gets:
    public IItemId getItemId () {
        return this.id;
    }
    public IArchiveList getArchives () {
        return this.archives;
    }
    
    // Archiv zur Liste hinzufügen
    public void add (IArchive archive) {
        if (this.archives instanceof PairArchiveList) {
            ((PairArchiveList) this.archives).add(archive);
        } else {
            this.archives = new PairArchiveList(archive, new EmptyArchiveList());
        }
    }
    

}
