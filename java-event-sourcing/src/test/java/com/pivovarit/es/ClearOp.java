package com.pivovarit.es;

import java.util.List;

class ClearOp<T> implements com.pivovarit.es.ListOp<T> {
    @Override
    public Object apply(List<T> list) {
        list.clear();
        return null;
    }

    @Override
    public String toString() {
        return "clear()";
    }
}
