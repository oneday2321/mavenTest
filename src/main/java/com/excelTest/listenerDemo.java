package com.excelTest;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;

public class listenerDemo extends AnalysisEventListener<excelDemo> {
    ArrayList<excelDemo> list = new ArrayList<>();
    @Override
    public void invoke(excelDemo excelDemo, AnalysisContext analysisContext) {
        list.add(excelDemo);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
