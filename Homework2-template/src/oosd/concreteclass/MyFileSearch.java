package oosd.concreteclass;

import oosd.abstractclass.FileSearch;
import oosd.abstractclass.SearchResult;

import java.io.File;

public class MyFileSearch extends FileSearch {


    @Override
    public SearchResult searchForFile(File root, String queryText, int max) {

        SearchResult result;
        SearchResult resultlist = new MySearchResult(max);

        if (!root.isDirectory())
            return resultlist.copy();

        if (root.listFiles() == null)
            return resultlist.copy();

        for (File folderItem : root.listFiles()) {
            if (folderItem.isDirectory()) {
                if (folderItem.getName().contains(queryText)) {
                    resultlist.addFile(folderItem);
                }
                result = searchForFile(folderItem, queryText, max);
                for (int i = 0; i < result.getSize(); i++) {
                    resultlist.addFile(result.getFiles()[i]);
                }
            } else {
                if (folderItem.getName().contains(queryText)) {
                    resultlist.addFile(folderItem);
                }
            }
            if (resultlist.isMax())
                return resultlist.copy();
        }
        return resultlist.copy();
    }
}