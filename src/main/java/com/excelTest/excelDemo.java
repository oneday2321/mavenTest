package com.excelTest;

public class excelDemo {
    private String CaseId;
    private String ApiName;
    private String Describe;
    private String Url;
    private String RequestType;
    private String Headers;
    private String Cookies;
    private String Parameters;
    private String UploadFile;
    private String InitSql;
    private String GlobalVariables;
    private String AssertFields;

    public String getCaseId() {
        return CaseId;
    }

    public void setCaseId(String caseId) {
        CaseId = caseId;
    }

    public String getApiName() {
        return ApiName;
    }

    public void setApiName(String apiName) {
        ApiName = apiName;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getRequestType() {
        return RequestType;
    }

    public void setRequestType(String requestType) {
        RequestType = requestType;
    }

    public String getHeaders() {
        return Headers;
    }

    public void setHeaders(String headers) {
        Headers = headers;
    }

    public String getCookies() {
        return Cookies;
    }

    public void setCookies(String cookies) {
        Cookies = cookies;
    }

    public String getParameters() {
        return Parameters;
    }

    public void setParameters(String parameters) {
        Parameters = parameters;
    }

    public String getUploadFile() {
        return UploadFile;
    }

    public void setUploadFile(String uploadFile) {
        UploadFile = uploadFile;
    }

    public String getInitSql() {
        return InitSql;
    }

    public void setInitSql(String initSql) {
        InitSql = initSql;
    }

    public String getGlobalVariables() {
        return GlobalVariables;
    }

    public void setGlobalVariables(String globalVariables) {
        GlobalVariables = globalVariables;
    }

    public String getAssertFields() {
        return AssertFields;
    }

    public void setAssertFields(String assertFields) {
        AssertFields = assertFields;
    }
}
