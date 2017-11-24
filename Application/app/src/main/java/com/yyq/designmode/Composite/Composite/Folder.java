package com.yyq.designmode.Composite.Composite;

import android.util.Log;

import com.yyq.designmode.Composite.Component.AbstractFile;

import java.util.ArrayList;

/**
 * 作者：yangyouqiao on 2017/11/24 10:42
 * 功能：
 */

public class Folder extends AbstractFile {
    ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addFile(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    @Override
    public void removeFile(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    @Override
    public void getFileSuffix() {
        Log.i("getFileSuffix", "文件夹无后缀名");
        for (AbstractFile file : fileList) {
            file.getFileSuffix();
        }
    }

    @Override
    public AbstractFile getFile(int index) {
        return fileList.get(index);
    }
}
