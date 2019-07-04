package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorClass implements Iterable<String> {
    /* implementuję interfejs iterable aby uzyskać dostęp do pętli for each
     * dla normalnej interacji po tabeli */

    String[] sampleTable = {"jeden", "dwa", "trzy", "cztery", "piec"};

    /*  tworzę własną wersję iteratora aby dostosować ją do innego typu iteracji
      - iteracji z pominięciem indeksu 0*/
    public Iterator getSkipZeroIterator() {
        class SkipOneIterator implements Iterator<String> {
            int index = 0;
            /*pozostawiam index startowy jako 0 bo i tak przed zwróceniem treści
            zostanie on podniesiony */

            @Override
            public boolean hasNext() {
                return index < sampleTable.length - 1;
            }

            @Override
            public String next() {
                index++;
                return sampleTable[index];
            }

            @Override
            public void remove() {
                sampleTable[index + 1] = null;
            }
        }
        return new SkipOneIterator();
    }

    //   nadpisanie metody z zaimplementowanego interfejsu
    public Iterator<String> iterator() {
        return Arrays.asList(sampleTable).iterator();
    }
}
