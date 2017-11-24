package com.yyq.designmode.Composite.Leaf;

import android.util.Log;

import com.yyq.designmode.Composite.Component.AbstractFile;

/**
 * 作者：yangyouqiao on 2017/11/24 10:39
 * 功能：
 */

/**
 * 对于增加、删除等操作，可以通过异常进行处理，只实现属于叶子对象的方法
 *
 * @author YangYQ
 *         created at 2017/11/24 上午10:41
 */
public class JavaFile extends AbstractFile {

    public JavaFile(String name) {
        super(name);
    }

    @Override
    public void addFile(AbstractFile abstractFile) {
        throw new UnsupportedOperationException("不支持操作");

    }

    @Override
    public void removeFile(AbstractFile abstractFile) {
        throw new UnsupportedOperationException("不支持操作");

    }

    @Override
    public void getFileSuffix() {
        Log.d("JavaFile", "Java 文件的后缀名是 .java");
    }

    @Override
    public AbstractFile getFile(int index) {
        throw new UnsupportedOperationException("不支持操作");
    }
}
