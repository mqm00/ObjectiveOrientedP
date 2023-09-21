package oosd.concreteclass;

import oosd.abstractclass.SearchResult;

import java.io.File;

public class MySearchResult extends SearchResult {

    public MySearchResult(MySearchResult other) {
        this.max = other.max;
        this.size = other.size;
        this.files = other.getFiles();
    }

    public MySearchResult(int max) {
        this.files = new File[max];
        this.size = 0;
        this.max = max;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public File[] getFiles() {
        File[] resultlist = new File[max];
        for (int i = 0; i < this.size; i++) {
            resultlist[i] = new File(this.files[i].getAbsolutePath());
        }
        return resultlist;
    }

    @Override
    public boolean isMax() {
        if (size >= max)
            return true;
        else
            return false;
    }

    @Override
    public void addFile(File file) {
        if (file == null)
            return;
        this.files[size] = file;
        size++;
    }

    @Override
    public SearchResult copy() {
        return new MySearchResult(this);
    }
}