package models.dataSaver;

import models.dataSaver.DataSaver;

public class FileDataSaver<T> implements DataSaver<T> {
    private T data;

    @Override
    public void save(T data) {
        System.out.println("Saving to file");
        this.data = data;
    }

    @Override
    public T load() {
        System.out.println("Načítání ze souboru");
        return data;
    }
}
