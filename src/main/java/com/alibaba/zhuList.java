package com.alibaba;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;

public class zhuList extends AnalysisEventListener<excelZhu> {
    ArrayList<Object> list = new ArrayList<>();
    @Override
    public void invoke(excelZhu excelzhu, AnalysisContext analysisContext) {
        list.add(excelzhu);
    }
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
